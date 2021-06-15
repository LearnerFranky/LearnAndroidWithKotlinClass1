package com.nr97.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nr97.activitytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainActBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActBinding.root)
        mainActBinding.startNormalActivity.setOnClickListener {
            val intentToNormalActivity = Intent(this, NormalActivity::class.java)
            startActivity(intentToNormalActivity)
        }

        mainActBinding.startDialogActivity.setOnClickListener {
            val intentToDialogActivity = Intent(this, DialogActivity::class.java)
            startActivity(intentToDialogActivity)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart")
    }
}