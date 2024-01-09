package com.adolfosalado.pokedexapi.data

import retrofit2.Retrofit

object RetrofitFactory {

    private const val URL: String = "https://pokeapi.co/api/v2"

    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl(URL)
            .build().create(RetrofitService::class.java)
    }
}