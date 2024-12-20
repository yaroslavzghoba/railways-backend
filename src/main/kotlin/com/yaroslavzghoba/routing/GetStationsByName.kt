package com.yaroslavzghoba.routing

import com.yaroslavzghoba.model.Repository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Suppress("UnusedReceiverParameter")
fun RouteHandlersProvider.getStationsByName(
    repository: Repository,
): suspend RoutingContext.() -> Unit = getStationsByNameHandler@{

    // Return 400 if the `station_name` parameter is not passed or is invalid
    val stationName = call.parameters["station_name"]
    if (stationName == null) {
        val message = mapOf("message" to "The \"station_name\" parameter is not passed or is invalid")
        call.respond(status = HttpStatusCode.BadRequest, message = message)
        return@getStationsByNameHandler
    }

    val stations = repository.getStationsByName(name = stationName)
    call.respond(status = HttpStatusCode.OK, message = stations)
}