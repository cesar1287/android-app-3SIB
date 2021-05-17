package com.github.cesar1287.turma3sib

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Imc(
    val height: Double,
    val weight: Double
) : Parcelable
