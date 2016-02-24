#include "com_wangzs_android_jnibase_JNIManager.h"

#include <android/log.h>

#ifdef __cplusplus
extern "C" {
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
