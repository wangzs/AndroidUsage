#include "com_wangzs_android_jnibase_JNIManager.h"

#include "JniCpp.hpp"
#include "test/test.hpp"

#include <android/log.h>


extern "C" jint JNI_OnLoad(JavaVM* vm, void* reserved) {
	java::JVM::setJavaVM(vm);

	return JNI_VERSION_1_6;
}

jobject g_context = nullptr;

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_wangzs_android_jnibase_JNIManager
 * Method:    testJni
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_wangzs_android_jnibase_JNIManager_testJni
  (JNIEnv *env, jclass, jobject context) {
  //__android_log_print(ANDROID_LOG_INFO, "JNIMsg", "====> jni test");
	g_context = context;
	test_string(env);
}

#ifdef __cplusplus
}
#endif
