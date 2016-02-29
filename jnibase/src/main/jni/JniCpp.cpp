#include "JniCpp.hpp"

namespace java {
	JavaVM* JVM::jvm_ = nullptr;
	JNIEnv* Env::value_ = nullptr;

	void JVM::setJavaVM(JavaVM* vm) {
		LOG_D("====> SetJavaVM(%p), pthread_self() = %ld", vm, pthread_self());
		jvm_ = vm;
	}

	JavaVM* JVM::getJavaVM() {
		LOG_D("====> GetJavaVM(), pthread_self() = %ld", pthread_self());
		return jvm_;
	}

}