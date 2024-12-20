package com.yaroslavzghoba.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Route(
    @SerialName("id") val id: Long,
    @SerialName("train_number_id") val trainNumberId: Long?,
)
