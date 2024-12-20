package com.yaroslavzghoba.routing

import com.yaroslavzghoba.model.Repository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Suppress("UnusedReceiverParameter")
fun RouteHandlersProvider.getAllRouteEvents(
    repository: Repository,
): suspend RoutingContext.() -> Unit = getAllRouteEventsHandler@{

    // Return 400 if the `route_id` parameter is not passed or is invalid
    val routeId = call.parameters["route_id"]?.toLong()
    if (routeId == null) {
        val message = mapOf("message" to "The \"route_id\" parameter is not passed or is invalid")
        call.respond(status = HttpStatusCode.BadRequest, message = message)
        return@getAllRouteEventsHandler
    }

    // Get all events on the route
    val routeEvents = repository.getAllRouteEvents(routeId = routeId)
    call.respond(status = HttpStatusCode.OK, message = routeEvents)
}