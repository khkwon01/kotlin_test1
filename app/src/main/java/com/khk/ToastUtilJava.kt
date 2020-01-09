@file:JvmName("ToastUtil")
package com.khk

import android.widget.Toast


fun toastShort(message : String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}

fun toastLong(message : String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show()
}

fun toastMsg(message : String, length : Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, length).show()
}
