#include "test.hpp"

using namespace java;
void test_string(JNIEnv *env) {
	Env::Scope tmp(JVM::getJavaVM());

	java::LocalRef<String> str = String::create("create java string from c++");
	LOG_D("=====> Java String: %s", str->std_str().c_str());
}

void get_signature() {
	
}