package com.example

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import com.example.repository.NEXT_PAGE_KEY
import com.example.repository.PREVIOUS_PAGE_KEY
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)

    @Test
    fun testRoot() = testApplication {
        val response = client.get("/")
        assertEquals(expected = HttpStatusCode.OK, actual = response.status)
        assertEquals(expected = "\"Welcome api\"", actual = response.bodyAsText())

    }

    @Test
    fun `access all heroes endpoint, query all pages, assert correct information`() {
        testApplication {
            environment {
                developmentMode = false
            }
            client.get("/db/heroes").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = status
                )
            }
            val pages = 1..4
            val heroes = listOf(
                heroRepository.page1,
                heroRepository.page2,
                heroRepository.page3,
                heroRepository.page4
            )
            pages.forEach { page ->
                client.get("/db/heroes?page=$page").apply {
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = status
                    )
                    val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                    val expected = ApiResponse(
                        success = true,
                        message = "ok",
                        prevPage = calculatePage(page = page)["prevPage"],
                        nextPage = calculatePage(page = page)["nextPage"],
                        heroes = heroes[page - 1],
                    )
                    assertEquals(
                        expected = expected,
                        actual = actual
                    )
                }
            }
        }
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..3) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..4) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 4) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

}