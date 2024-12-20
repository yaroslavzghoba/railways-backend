package com.yaroslavzghoba.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrainNumber(
    @SerialName("id") val id: Long,
    @SerialName("number") val number: String,
)
