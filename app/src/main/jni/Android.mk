LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jni_lib
LOCAL_SRC_FILES := com_huang_jnidemo_MainActivity.cpp

include $(BUILD_SHARED_LIBRARY)