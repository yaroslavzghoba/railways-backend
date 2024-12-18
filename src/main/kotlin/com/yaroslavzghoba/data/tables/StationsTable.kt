package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object StationsTable : LongIdTable(name = "stations", columnName = "id") {

    val name = varchar(name = "name", length = 64)
    val address = varchar(name = "address", length = 64)
}