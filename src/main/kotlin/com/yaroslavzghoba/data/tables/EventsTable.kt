package com.yaroslavzghoba.data.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object EventsTable : LongIdTable(name = "events", columnName = "id") {

    val event = varchar(name = "event", length = 128)
}