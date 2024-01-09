package com.adolfosalado.pokedexapi.data

import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("pokemon/{name}")
    suspend fun getPokemonByName (
        @Path("name") name: String

    )
}