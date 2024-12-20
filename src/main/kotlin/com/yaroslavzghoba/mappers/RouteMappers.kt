package com.yaroslavzghoba.mappers

import com.yaroslavzghoba.data.dao.RouteDao
import com.yaroslavzghoba.model.Route

/**
 * Converts an instance of the [RouteDao] class to an instance of the [Route] class.
 */
fun RouteDao.toRoute() = Route(
    id = this.id.value,
    trainNumberId = this.trainNumberId.id.value
)