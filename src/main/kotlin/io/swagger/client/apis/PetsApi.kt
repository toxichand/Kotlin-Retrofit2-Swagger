package io.swagger.client.apis

import retrofit2.Call
import retrofit2.http.*

import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import io.swagger.client.models.Error
import io.swagger.client.models.Pets

interface PetsApi {
  /**
   * Create a pet
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers(
    "Content-Type:application/json"
  )
  @POST("pets")
  fun createPets()
    : Call<Void>

  /**
   * List all pets
   * 
   * @param limit How many items to return at one time (max 100) (optional)
   * @return Call&lt;Pets&gt;
   */
  @Headers(
    "Content-Type:application/json"
  )
  @GET("pets")
  fun listPets(
    @retrofit2.http.Query("limit") limit: kotlin.Int? = null
  ): Call<Pets>

  /**
   * Info for a specific pet
   * 
   * @param petId The id of the pet to retrieve (required)
   * @return Call&lt;Pets&gt;
   */
  @Headers(
    "Content-Type:application/json"
  )
  @GET("pets/{petId}")
  fun showPetById(
    @retrofit2.http.Path("petId") petId: kotlin.String
  ): Call<Pets>

}
