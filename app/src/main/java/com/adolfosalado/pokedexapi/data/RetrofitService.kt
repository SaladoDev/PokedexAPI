package com.adolfosalado.pokedexapi.data

import com.adolfosalado.pokedexapi.models.Pokemon
import com.google.gson.JsonElement
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("pokemon/{name}")
    suspend fun getPokemonByName (
        @Path("name") name: String
    ) : Pokemon
}