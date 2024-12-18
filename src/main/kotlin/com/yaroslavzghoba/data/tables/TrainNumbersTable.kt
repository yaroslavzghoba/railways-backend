package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object TrainNumbersTable : LongIdTable(name = "train_numbers", columnName = "id") {

    val number = varchar(name = "number", length = 5)
}