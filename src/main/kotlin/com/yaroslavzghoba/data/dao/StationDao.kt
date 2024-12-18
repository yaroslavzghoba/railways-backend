package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.StationsTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class StationDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<StationDao>(StationsTable)

    var name by StationsTable.name
    var address by StationsTable.address
}