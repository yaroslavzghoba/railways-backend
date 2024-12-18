package com.yaroslavzghoba.data.dao

import com.yaroslavzghoba.data.tables.TrainNumbersTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class TrainNumberDao(id: EntityID<Long>) : LongEntity(id = id) {
    companion object : LongEntityClass<TrainNumberDao>(TrainNumbersTable)

    var number by TrainNumbersTable.number
}