#include "com_wangzs_android_jnibase_JNIManager.h"

#include "JniCpp.hpp"

#include <android/log.h>

#ifdef __cplusplus
extern "C" {
	JNIEXPORT jint JNI_OnLoad(JavaVM* vm, void* reserved) {
		java::JVM::setJavaVM(vm);

		return JNI_VERSION_1_6;
	}

#endif
/*
 * Class:     com_wangzs_android_jnibase_JNIManager
 * Method:    testJni
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_wangzs_android_jnibase_JNIManager_testJni
  (JNIEnv *env, jclass) {
  __android_log_print(ANDROID_LOG_INFO, "JNIMsg", "====> jni test");
}

#ifdef __cplusplus
}
#endif
