package com.wangzs.android.anticrack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Process;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by wangzhenshui@yy.com on 2016/2/24 0024.
 */
public class AntiCrackTools {

    /**
     * 运行时获取检查签名hashCode
     * @return 当前apk的签名Hash值
     */
    @SuppressLint("PackageManagerGetSignatures")
    public static int getApkSignature(final Context context) {
        PackageManager pm = context.getPackageManager();
        PackageInfo packageInfo;
        int signatureCode;
        try {
            packageInfo = pm.getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
            Signature signature = packageInfo.signatures[0];
            signatureCode = signature.hashCode();
        } catch (PackageManager.NameNotFoundException e) {
            signatureCode = 0;
            e.printStackTrace();
        }
        return signatureCode;
    }


    /**
     * 判断当前apk是否运行在模拟器中
     * @return true-在模拟器中运行
     */
    public static boolean checkEmulator() {
        try {
            boolean goldfish = getSystemProperty("ro.hardware").contains("goldfish");
            boolean emu = getSystemProperty("ro.kernel.qemu").length() > 0;
            boolean sdk = getSystemProperty("ro.product.model").equals("sdk");
            if (goldfish || emu || sdk) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private static String getSystemProperty(String propertyName) throws Exception {
        Class<?> systemPropertyClass = Class.forName("android.os.SystemProperties");
        return (String)systemPropertyClass.getMethod("get", new Class[] {String.class})
                .invoke(systemPropertyClass, propertyName);
    }


    /**
     * 判断程序是否可调试
     * @return true-可调试
     */
    public static boolean checkDebugger(Context context) {
        return (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0
                || android.os.Debug.isDebuggerConnected();
    }

    /**
     * 获取apk中classes.dex文件的crc
     * @throws IOException
     */
    public static long getDexCrc(Context context) throws IOException {
        ZipFile zf = new ZipFile(context.getPackageCodePath());
        ZipEntry dexEntry = zf.getEntry("classes.dex");
        return dexEntry.getCrc();
    }

    /**
     * 杀掉当前自己所在的进程
     */
    public static void killSelf() {
        android.os.Process.killProcess(Process.myPid());
    }
}
