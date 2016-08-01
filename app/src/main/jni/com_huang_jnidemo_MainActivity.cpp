//
// Created by Administrator on 2016/8/1.
//

#include <com_huang_jnidemo_MainActivity.h>

JNIEXPORT jint JNICALL Java_com_huang_jnidemo_MainActivity_getStringFromJNI
  (JNIEnv *, jobject, jint, jint){
  return 2;
  }