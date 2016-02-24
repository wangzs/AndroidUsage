LOCAL_PATH:= $(call my-dir)

### ====> 编译模块的开始
# 清除除LOCAL_PATH以外的所有LOCAL_XXX变量
include $(CLEAR_VARS)

LOCAL_MODULE := jnibase_shared
LOCAL_MODULE_FILENAME := libjnibase

# 编译C/C++代码文件时使用的可选编译器选项
LOCAL_CPPFLAGS += \
                -DDEBUG \
                 -D__ANDROID__ \
                -fvisibility=hidden     \
                -Wno-invalid-offsetof \
                -fno-inline-functions   \
                -std=c++11
# 编译C++代码文件时使用的可选编译器选项
# LOCAL_CXXFLAGS += -std=c++11

# 编译C代码文件时使用的可选编译器选项
# LOCAL_CFLAGS += \
#                -DDEBUG \
#                -D__ANDROID__ \
#                -fvisibility=hidden \
#                -Wno-invalid-offsetof \
#                -fno-inline-functions 


# LOCAL_WHOLE_STATIC_LIBRARIES := xxx_static
# 本模块运行时需要依赖的静态库列表（本模块为动态库时才有意义）
# LOCAL_STATIC_LIBRARIES += zlib_static

# 本模块运行时需要依赖的动态库列表
LOCAL_SHARED_LIBRARIES := liblog

# 编译时使用的附加的连接器选项
LOCAL_LDLIBS := \
                -llog

###################################
# 指定C++文件的后缀，默认为.cpp
# LOCAL_APP_EXTENSION := .cxx

LOCAL_SRC_FILES := \
                   com_wangzs_android_jnibase_JNIManager.cpp

LOCAL_C_INCLUDES += $(LOCAL_PATH)
    


###################################

# 编译成动态库
include $(BUILD_SHARED_LIBRARY)
# 编译成静态库
# include $(BUILD_STATIC_LIBRARY)
# 编译成可执行程序
# include $(BUILD_EXECUTABLE)
### ====> 模块编译的结束

$(call import-add-path, $(LOCAL_PATH))
# $(call import-module, zlib)




