package com.yaroslavzghoba.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RouteEvent(
    @SerialName("id") val id: Long,
    @SerialName("event_id") val eventId: Long,
    @SerialName("route_id") val routeId: Long,
)