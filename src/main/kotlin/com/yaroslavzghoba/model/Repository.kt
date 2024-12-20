package com.yaroslavzghoba.model

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

interface Repository {

    suspend fun getStationsByName(name: String): List<Station>

    suspend fun getStopsAtStation(
        stationId: Long,
        startingFrom: Instant = Clock.System.now(),
    ): List<TrainStop>

    suspend fun getRouteByStop(trainStopId: Long): Route

    suspend fun getAllTrainNumbers(): List<TrainNumber>

    suspend fun getAllRouteEvents(routeId: Long): List<RouteEvent>
}