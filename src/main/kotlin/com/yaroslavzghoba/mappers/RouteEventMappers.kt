package com.yaroslavzghoba.mappers

import com.yaroslavzghoba.data.dao.RouteEventDao
import com.yaroslavzghoba.model.RouteEvent

/**
 * Converts an instance of the [RouteEventDao] class to an instance of the [RouteEvent] class.
 */
fun RouteEventDao.toRouteEvent() = RouteEvent(
    id = this.id.value,
    eventId = this.eventId.id.value,
    routeId = this.routeId.id.value,
)