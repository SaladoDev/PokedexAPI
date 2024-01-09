package com.adolfosalado.pokedexapi.models

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)