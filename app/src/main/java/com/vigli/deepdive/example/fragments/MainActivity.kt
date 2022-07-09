package com.vigli.deepdive.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vigli.deepdive.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()

        addTopRoundedFragment()
    }

    private fun initView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun addTopRoundedFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.root_container, TopRoundedBlankFragment.newInstance())
            .commit()
    }
}