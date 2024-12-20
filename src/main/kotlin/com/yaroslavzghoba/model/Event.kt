package com.yaroslavzghoba.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    @SerialName("id") val id: Long,
    @SerialName("event") val event: String,
)