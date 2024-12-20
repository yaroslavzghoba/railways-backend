package com.yaroslavzghoba.mappers

import com.yaroslavzghoba.data.dao.StationDao
import com.yaroslavzghoba.model.Station

/**
 * Converts an instance of the [StationDao] class to an instance of the [Station] class.
 */
fun StationDao.toStation() = Station(
    id = this.id.value,
    name = this.name,
    address = this.address,
)