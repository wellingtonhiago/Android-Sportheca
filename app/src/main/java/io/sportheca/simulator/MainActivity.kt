package io.sportheca.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.sportheca.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.tvHello.text = "Hello, Wellington"


    }
}