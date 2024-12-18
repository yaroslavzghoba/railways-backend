package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.RoutesTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RouteDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<RouteDao>(RoutesTable)

    var trainNumberId by TrainNumberDao referencedOn RoutesTable
}