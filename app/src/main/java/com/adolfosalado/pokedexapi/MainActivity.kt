package com.adolfosalado.pokedexapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.adolfosalado.pokedexapi.data.RetrofitFactory
import com.adolfosalado.pokedexapi.databinding.ActivityMainBinding
import com.adolfosalado.pokedexapi.models.Pokemon
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }



}