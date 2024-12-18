package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

object TrainStopsTable : LongIdTable(name = "train_stops", columnName = "id") {

    val expectedArrivalTime = timestamp(name = "expected_arrival_time")
    val actualArrivalTime = timestamp(name = "actual_arrival_time")
    val expectedDepartureTime = timestamp(name = "expected_departure_time")
    val actualDepartureTime = timestamp(name = "actual_departure_time")
    val routeId = reference(name = "route_id", foreign = RoutesTable)
    val stationId = reference(name = "station_id", foreign = StationsTable)
    val expectedStationPlatform = integer(name = "expected_station_platform")
    val actualStationPlatform = integer(name = "actual_station_platform")
}