package com.uniandes.sport.viewmodels.log

import android.graphics.Bitmap

interface LogViewModelInterface {
    fun log(screen: String, action: String)
    fun crash(screen: String, exception: Exception)
}