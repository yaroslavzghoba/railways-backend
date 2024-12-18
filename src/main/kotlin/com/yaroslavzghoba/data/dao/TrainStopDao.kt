package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.TrainStopsTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class TrainStopDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<TrainStopDao>(TrainStopsTable)

    var expectedArrivalTime by TrainStopsTable.expectedArrivalTime
    var actualArrivalTime by TrainStopsTable.actualArrivalTime
    var expectedDepartureTime by TrainStopsTable.expectedDepartureTime
    var actualDepartureTime by TrainStopsTable.actualDepartureTime
    var routeId by RouteDao referencedOn TrainStopsTable
    var stationId by StationDao referencedOn TrainStopsTable
    var expectedStationPlatform by TrainStopsTable.expectedStationPlatform
    var actualStationPlatform by TrainStopsTable.actualStationPlatform
}