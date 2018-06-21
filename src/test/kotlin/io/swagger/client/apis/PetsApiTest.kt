package io.swagger.client.apis

import io.swagger.client.infrastructure.ApiClient
import io.swagger.client.models.Error
import io.swagger.client.models.Pets
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * API tests for PetsApi
 */
class PetsApiTest {

    private lateinit var api: PetsApi

    @Before
    fun setup() {
        api = ApiClient().createService(PetsApi::class.java)
    }

    /**
     * Create a pet
     *
     * 
     */
    @Test
    fun createPetsTest() {
        // val response = api.createPets().execute()
        // Assert.assertEquals(200, response.code())
        // TODO: test validations
    }

    /**
     * List all pets
     *
     * 
     */
    @Test
    fun listPetsTest() {
        val limit: kotlin.Int? = null
        // val response = api.listPets(limit).execute()
        // Assert.assertEquals(200, response.code())
        // TODO: test validations
    }

    /**
     * Info for a specific pet
     *
     * 
     */
    @Test
    fun showPetByIdTest() {
        val petId: kotlin.String? = null
        // val response = api.showPetById(petId).execute()
        // Assert.assertEquals(200, response.code())
        // TODO: test validations
    }
}
