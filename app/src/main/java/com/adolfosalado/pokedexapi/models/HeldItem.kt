package com.adolfosalado.pokedexapi.models

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)