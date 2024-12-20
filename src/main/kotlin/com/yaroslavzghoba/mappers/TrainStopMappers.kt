package com.yaroslavzghoba.mappers

import com.yaroslavzghoba.data.dao.TrainStopDao
import com.yaroslavzghoba.model.TrainStop

/**
 * Converts an instance of the [TrainStopDao] class to an instance of the [TrainStop] class.
 */
fun TrainStopDao.toTrainStop() = TrainStop(
    id = this.id.value,
    expectedArrivalTime = this.expectedArrivalTime,
    actualArrivalTime = this.actualArrivalTime,
    expectedDepartureTime = this.expectedDepartureTime,
    actualDepartureTime = this.actualDepartureTime,
    routeId = this.routeId.id.value,
    stationId = this.stationId.id.value,
    expectedStationPlatform = this.expectedStationPlatform,
    actualStationPlatform = this.actualStationPlatform
)