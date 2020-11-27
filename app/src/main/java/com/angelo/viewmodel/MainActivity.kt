package com.angelo.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.angelo.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //We are going to use viewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //We create an instance of ViewModelProvider, which receive an object with lifecycle
        //Then the view model class reference created
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.tvNumber.text = viewModel.number.toString()

        with(binding) {
            button.setOnClickListener {
                viewModel.addNumber()
                tvNumber.text = viewModel.number.toString()
            }
        }

    }
}