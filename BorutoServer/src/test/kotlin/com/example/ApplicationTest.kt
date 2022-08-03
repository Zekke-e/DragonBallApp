package com.example

import com.example.DI.koinModule
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.callloging.*
import org.slf4j.event.*
import io.ktor.server.request.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*
import org.koin.dsl.module

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        val response = client.get("/")
            assertEquals(expected = HttpStatusCode.OK, actual = response.status)
            assertEquals(expected = "\"Welcome api\"", actual = response.bodyAsText())

    }
}