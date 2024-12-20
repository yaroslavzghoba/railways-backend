package com.yaroslavzghoba.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrainStop(
    @SerialName("id") val id: Long,
    @SerialName("expected_arrival_time") val expectedArrivalTime: Instant,
    @SerialName("actual_arrival_time") val actualArrivalTime: Instant,
    @SerialName("expected_departure_time") val expectedDepartureTime: Instant,
    @SerialName("actual_departure_time") val actualDepartureTime: Instant,
    @SerialName("route_id") val routeId: Long,
    @SerialName("station_id") val stationId: Long,
    @SerialName("expected_station_platform") val expectedStationPlatform: Short,
    @SerialName("actual_station_platform") val actualStationPlatform: Short,
)
