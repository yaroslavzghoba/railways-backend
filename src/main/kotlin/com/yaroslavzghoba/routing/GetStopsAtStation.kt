package com.yaroslavzghoba.routing

import com.yaroslavzghoba.model.Repository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Suppress("UnusedReceiverParameter")
fun RouteHandlersProvider.getStopsAtStation(
    repository: Repository,
): suspend RoutingContext.() -> Unit = getStopsAtStationHandler@{

    // Return 400 if the `station_id` parameter is not passed or is invalid
    val stationId = call.parameters["station_id"]?.toLong()
    if (stationId == null) {
        val message = mapOf("message" to "The \"station_id\" parameter is not passed or is invalid")
        call.respond(status = HttpStatusCode.BadRequest, message = message)
        return@getStopsAtStationHandler
    }

    // Get stops of the trains at the station
    val stops = repository.getStopsAtStation(stationId = stationId)
    call.respond(status = HttpStatusCode.OK, message = stops)
}