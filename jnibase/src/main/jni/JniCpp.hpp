#ifndef JNIBASE_JNICPP_HPP_
#define JNIBASE_JNICPP_HPP_

#include <jni.h>
#include <android/log.h>

#include <string>

#define LOG_TAG "JNI2CPP"

#if defined(_DEBUG)
	#define LOG_V(...) __android_log_print(ANDROID_LOG_VERBOSE, LOG_TAG, __VA_ARGS__)
	#define LOG_D(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#else
	#define LOG_V(...) 
	#define LOG_D(...)
#endif
#define LOG_I(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOG_W(...) __android_log_print(ANDROID_LOG_WARN, LOG_TAG, __VA_ARGS__)
#define LOG_I(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)



#define JAVA_NAME_STRING      "java/lang/String"
#define JAVA_NAME_CLASS       "java/lang/Class"
#define JAVA_NAME_OBJECT      "java/lang/Object"
#define JAVA_SIGNATURE_BOOLEAN     "Z"
#define JAVA_SIGNATURE_BYTE        "B"
#define JAVA_SIGNATURE_CHAR        "C"
#define JAVA_SIGNATURE_SHORT       "S"
#define JAVA_SIGNATURE_INT         "I"
#define JAVA_SIGNATURE_LONG        "L"
#define JAVA_SIGNATURE_FLOAT       "F"
#define JAVA_SIGNATURE_DOUBLE      "D"
#define JAVA_SIGNATURE_VOID        "V"
#define JAVA_SIGNATURE_STRING      "Ljava/lang/String;"
#define JAVA_SIGNATURE_CLASS       "Ljava/lang/Class;"
#define JAVA_SIGNATURE_OBJECT      "Ljava/lang/Object;"
#define JAVA_SIGNATURE_ANY_OBJECT(obj_full_name)  "L" obj_full_name ";"
#define JAVA_SIGNATURE_ARRAY(type_signature) "[" type_signature

#define JAVA_SIGNATURE_METHOD(return_type_signature, all_params_combine_signature)	\
	"(" return_type_signature ")" \
	all_params_combine_signature

#define STRING_COMBINE2(a, b)			a b
#define STRING_COMBINE3(a, b, c)		a b c
#define STRING_COMBINE4(a, b, c, d)		a b c d
#define STRING_COMBINE5(a, b, c, d, e)	a b c d e

namespace java {

}






#endif