package com.example.data

import org.jetbrains.exposed.v1.jdbc.Database


class DatabaseFactory() {
    val database = Database.connect(
        url = "jdbc:postgresql://localhost:5432/winego_db",
        user = "admin",
        password = "pass",
        driver = "org.postgresql.Driver"
    )
}