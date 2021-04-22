package com.example.demoapp4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fist = "abcd"
        Timber.d("Hello %s", fist);
    }
}
