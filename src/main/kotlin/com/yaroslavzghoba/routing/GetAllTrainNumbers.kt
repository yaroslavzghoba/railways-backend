package com.yaroslavzghoba.routing

import com.yaroslavzghoba.model.Repository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Suppress("UnusedReceiverParameter")
fun RouteHandlersProvider.getAllTrainNumbers(
    repository: Repository,
): suspend RoutingContext.() -> Unit = getAllTrainNumbersHandler@{

    val trainNumbers = repository.getAllTrainNumbers()
    call.respond(status = HttpStatusCode.OK, message = trainNumbers)
}