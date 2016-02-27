package com.wangzs.android.jnibase;

/**
 * Created by wangzs on 2016/2/24.
 */
public class JNIManager {
    private static JNIManager ourInstance = new JNIManager();

    public static JNIManager getInstance() {
        return ourInstance;
    }

    private JNIManager() {
        System.loadLibrary("jnibase");
    }
    
    public static native void testJni();
}
