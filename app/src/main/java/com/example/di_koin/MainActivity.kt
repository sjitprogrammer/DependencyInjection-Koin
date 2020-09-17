package com.example.di_koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.di_koin.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by inject()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewModel = mainViewModel
        binding.setLifecycleOwner(this)
    }
}