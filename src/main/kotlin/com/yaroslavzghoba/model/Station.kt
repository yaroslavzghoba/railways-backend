package com.yaroslavzghoba.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Station(
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("address") val address: String,
)
