package com.brainvire.mvvm_clean_arch.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brainvire.learning.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}