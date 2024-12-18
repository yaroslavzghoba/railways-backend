package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.RouteEventsTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RouteEventDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<RouteEventDao>(RouteEventsTable)

    var eventId by EventDao referencedOn RouteEventsTable
    var routeId by RouteDao referencedOn RouteEventsTable
}