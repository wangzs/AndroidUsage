#include "JniCpp.hpp"

namespace java {
	JavaVM* JVM::jvm_ = nullptr;

	void JVM::setJavaVM(JavaVM* vm) {
		LOG_D("JVM::setJavaVM(%p), pthread_self() = %ld", vm, pthread_self());
		jvm_ = vm;
	}

	JavaVM* JVM::getJavaVM() {
		LOG_D("JVM::getJavaVM(), pthread_self() = %ld", pthread_self());
		return jvm_;
	}

}