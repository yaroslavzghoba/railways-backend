package com.yaroslavzghoba.routing

import com.yaroslavzghoba.model.Repository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Suppress("UnusedReceiverParameter")
fun RouteHandlersProvider.getRouteByStop(
    repository: Repository,
): suspend RoutingContext.() -> Unit = getRouteByStopHandler@{

    // Return 400 if the `train_stop_id` parameter is not passed or is invalid
    val trainStopId = call.parameters["train_stop_id"]?.toLong()
    if (trainStopId == null) {
        val message = mapOf("message" to "The \"train_stop_id\" parameter is not passed or is invalid")
        call.respond(status = HttpStatusCode.BadRequest, message = message)
        return@getRouteByStopHandler
    }

    // Get route by one of the train stops
    val route = repository.getRouteByStop(trainStopId = trainStopId)
    call.respond(status = HttpStatusCode.OK, message = route)
}