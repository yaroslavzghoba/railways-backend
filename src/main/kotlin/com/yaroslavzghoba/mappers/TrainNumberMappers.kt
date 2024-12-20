package com.yaroslavzghoba.mappers

import com.yaroslavzghoba.data.dao.TrainNumberDao
import com.yaroslavzghoba.model.TrainNumber

/**
 * Converts an instance of the [TrainNumberDao] class to an instance of the [TrainNumber] class.
 */
fun TrainNumberDao.toTrainNumber() = TrainNumber(
    id = this.id.value,
    number = this.number,
)