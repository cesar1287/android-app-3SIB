package com.github.cesar1287.turma3sib

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val email: String,
    val password: String,
    val age: Int
): Parcelable
