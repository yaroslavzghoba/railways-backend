package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object RoutesTable : LongIdTable(name = "routes", columnName = "id") {

    val trainNumberId = reference(name = "train_number_id", foreign = TrainNumbersTable)
}