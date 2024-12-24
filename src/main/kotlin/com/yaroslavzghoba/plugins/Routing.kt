package com.yaroslavzghoba.plugins

import com.yaroslavzghoba.model.Repository
import com.yaroslavzghoba.routing.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(
    repository: Repository
) {
    routing {
        get(
            path = "/station_by_name/{station_name}",
            body = RouteHandlersProvider.getStationsByName(repository),
        )
        get(
            path = "/stops_at_station/{station_id}",
            body = RouteHandlersProvider.getStopsAtStation(repository),
        )
        get(
            path = "/route_by_stop/{train_stop_id}",
            body = RouteHandlersProvider.getRouteByStop(repository),
        )
        get(
            path = "/all_train_numbers",
            body = RouteHandlersProvider.getAllTrainNumbers(repository),
        )
        get(
            path = "/all_events_by_route/{route_id}",
            body = RouteHandlersProvider.getAllEventsByRoute(repository),
        )
    }
}