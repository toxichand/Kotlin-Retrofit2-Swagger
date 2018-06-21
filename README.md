# io.swagger.client - Kotlin client library for Swagger Petstore

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://petstore.swagger.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PetsApi* | [**createPets**](docs/PetsApi.md#createpets) | **POST** pets | Create a pet
*PetsApi* | [**listPets**](docs/PetsApi.md#listpets) | **GET** pets | List all pets
*PetsApi* | [**showPetById**](docs/PetsApi.md#showpetbyid) | **GET** pets/{petId} | Info for a specific pet


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Error](docs/Error.md)
 - [io.swagger.client.models.Pet](docs/Pet.md)
 - [io.swagger.client.models.Pets](docs/Pets.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
#Kotlin-Retrofit2-Swagger
