package com.vigli.deepdive.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vigli.deepdive.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()

        showDialog()
    }

    private fun initView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        BlankDialogFragment.newInstance().show(
            supportFragmentManager,
            BlankDialogFragment::class.java.name
        )
    }
}