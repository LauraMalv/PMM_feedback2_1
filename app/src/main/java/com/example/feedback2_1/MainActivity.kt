package com.example.feedback2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback2_1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
        if(checkedId == binding.spain.id){
            binding.imagenPais.setImageResource(R.drawable.spain)
        }

        when (checkedId) {
            binding.spain.id -> binding.imagenPais.setImageResource(R.drawable.spain)
            binding.alemania.id -> binding.imagenPais.setImageResource(R.drawable.alem)
            binding.belgica.id -> binding.imagenPais.setImageResource(R.drawable.belgica)
            binding.francia.id -> binding.imagenPais.setImageResource(R.drawable.franc)
            binding.usa.id -> binding.imagenPais.setImageResource(R.drawable.usa)
            binding.portugal.id -> binding.imagenPais.setImageResource(R.drawable.port)
            binding.italia.id -> binding.imagenPais.setImageResource(R.drawable.italia)
            binding.suecia.id -> binding.imagenPais.setImageResource(R.drawable.suecia)
            binding.holanda.id -> binding.imagenPais.setImageResource(R.drawable.holand)
            binding.reinoUnido.id -> binding.imagenPais.setImageResource(R.drawable.reino_unido)

            else -> Snackbar.make(binding.root, "Opcion no valida", Snackbar.LENGTH_SHORT).show()
        }




    }
    }
}