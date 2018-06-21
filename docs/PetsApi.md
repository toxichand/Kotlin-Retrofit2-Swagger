# PetsApi

All URIs are relative to *http://petstore.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPets**](PetsApi.md#createPets) | **POST** pets | Create a pet
[**listPets**](PetsApi.md#listPets) | **GET** pets | List all pets
[**showPetById**](PetsApi.md#showPetById) | **GET** pets/{petId} | Info for a specific pet


<a name="createPets"></a>
# **createPets**
> createPets()

Create a pet

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ApiClient().createService(PetsApi::class.java)
val result = apiInstance.createPets().execute()
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPets"></a>
# **listPets**
> Pets listPets(limit)

List all pets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ApiClient().createService(PetsApi::class.java)
val limit : kotlin.Int = 56 // kotlin.Int | How many items to return at one time (max 100)
val result = apiInstance.listPets(limit).execute()
println(result.body())
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| How many items to return at one time (max 100) | [optional]

### Return type

[**Pets**](Pets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showPetById"></a>
# **showPetById**
> Pets showPetById(petId)

Info for a specific pet

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ApiClient().createService(PetsApi::class.java)
val petId : kotlin.String = petId_example // kotlin.String | The id of the pet to retrieve
val result = apiInstance.showPetById(petId).execute()
println(result.body())
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **kotlin.String**| The id of the pet to retrieve |

### Return type

[**Pets**](Pets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

