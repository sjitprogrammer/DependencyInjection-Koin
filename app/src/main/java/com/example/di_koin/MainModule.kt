package com.example.di_koin

import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MainModule = module {
    viewModel { MainViewModel() }
}