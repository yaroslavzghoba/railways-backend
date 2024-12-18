package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.EventsTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class EventDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<EventDao>(EventsTable)

    var event by EventsTable.event
}