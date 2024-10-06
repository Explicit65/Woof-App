package com.example.woofapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woofapp.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int,
    @StringRes val description: Int,
    val id: Int,
)

val dogs = listOf(
    Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1, R.string.description_1, R.string.id_1),
    Dog(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2, R.string.description_2, R.string.id_2),
    Dog(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3, R.string.description_3, R.string.id_3),
    Dog(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4, R.string.description_4, R.string.id_4),
    Dog(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5, R.string.description_5, R.string.id_5),
    Dog(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6, R.string.description_6, R.string.id_6),
    Dog(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7, R.string.description_7, R.string.id_7),
    Dog(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8, R.string.description_8, R.string.id_8),
    Dog(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9, R.string.description_9, R.string.id_9)
)
