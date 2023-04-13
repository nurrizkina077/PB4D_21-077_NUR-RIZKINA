package com.example.list_film

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class film(
    val imgfilm: Int,
    val namefilm: String,
    val descMfilm: String

) : Parcelable
