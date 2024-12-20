package com.yaroslavzghoba.data

import com.yaroslavzghoba.data.dao.*
import com.yaroslavzghoba.data.tables.RouteEventsTable
import com.yaroslavzghoba.data.tables.RoutesTable
import com.yaroslavzghoba.data.tables.StationsTable
import com.yaroslavzghoba.data.tables.TrainStopsTable
import com.yaroslavzghoba.mappers.*
import com.yaroslavzghoba.model.*
import com.yaroslavzghoba.utils.suspendTransaction
import kotlinx.datetime.Instant

class RepositoryImpl : Repository {

    override suspend fun getStationsByName(name: String): List<Station> = suspendTransaction {
        StationDao
            .find { StationsTable.name like "%$name%" }
            .map { it.toStation() }
    }

    override suspend fun getStopsAtStation(
        stationId: Long,
        startingFrom: Instant,
    ): List<TrainStop> = suspendTransaction {
        TrainStopDao
            .find { TrainStopsTable.stationId eq stationId }
            .map { it.toTrainStop() }
    }

    override suspend fun getRouteByStop(trainStopId: Long): Route = suspendTransaction {
        val trainStop = TrainStopDao
            .find { TrainStopsTable.stationId eq trainStopId }
            .map { it.toTrainStop() }
            .first()
        RouteDao
            .find { RoutesTable.id eq trainStop.stationId }
            .map { it.toRoute() }
            .first()
    }

    override suspend fun getAllTrainNumbers(): List<TrainNumber> = suspendTransaction {
        TrainNumberDao.all()
            .map { it.toTrainNumber() }
    }

    override suspend fun getAllRouteEvents(routeId: Long): List<RouteEvent> = suspendTransaction {
        RouteEventDao
            .find { RouteEventsTable.routeId eq routeId }
            .map { it.toRouteEvent() }
    }
}