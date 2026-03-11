package com.uniandes.sport.viewmodels.storage

import android.graphics.Bitmap

interface StorageViewModelInterface {
    fun uploadImage(image: Bitmap, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit)
}