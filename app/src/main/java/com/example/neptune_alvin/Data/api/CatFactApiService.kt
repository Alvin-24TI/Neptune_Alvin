package com.example.neptune_alvin.data.api

import com.example.neptune_alvin.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}
