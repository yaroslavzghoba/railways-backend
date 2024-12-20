package com.yaroslavzghoba.plugins

import io.ktor.server.application.Application
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        get(
            path = "/station_by_name/{station_name}",
            body = { TODO("Not implemented yet") },
        )
        get(
            path = "/stops_at_station/{station_id}",
            body = { TODO("Not implemented yet") },
        )
        get(
            path = "/route_by_stop/{train_stop_id}",
            body = { TODO("Not implemented yet") },
        )
        get(
            path = "/all_train_numbers",
            body = { TODO("Not implemented yet") },
        )
        get(
            path = "/all_route_events/{route_id}",
            body = { TODO("Not implemented yet") },
        )
    }
}