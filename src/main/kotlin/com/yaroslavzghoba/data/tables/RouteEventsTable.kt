package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object RouteEventsTable : LongIdTable(name = "route_events", columnName = "id") {

    val eventId = reference(name = "event_id", foreign = EventsTable)
    val routeId = reference(name = "route_id", foreign = RoutesTable)
}