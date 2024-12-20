package com.yaroslavzghoba

import com.yaroslavzghoba.data.RepositoryImpl
import com.yaroslavzghoba.plugins.configureDatabase
import com.yaroslavzghoba.plugins.configureRouting
import com.yaroslavzghoba.plugins.configureSerialization
import com.yaroslavzghoba.utils.DbConnectionConfig
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused")
fun Application.module() {
    val dbConnectionConfig = DbConnectionConfig(
        url = environment.config.property("database.url").getString(),
        user = environment.config.property("database.user").getString(),
        password = environment.config.property("database.password").getString(),
    )
    val repository = RepositoryImpl()

    configureDatabase(dbConnectionConfig = dbConnectionConfig)
    configureSerialization()
    configureRouting(repository = repository)
}
