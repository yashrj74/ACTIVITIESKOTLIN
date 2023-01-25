package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MYSTATECHANGEACTIVITY : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("StateChanges", "onCreate()")
    }


    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d("Statechanges", "onRestoreInstanceState")
    }


    public override fun onRestart() {
        super.onRestart()

        Log.d("Statechanges", "onRestart")
    }

    public override fun onStart() {
        super.onStart()

        Log.d("Statechanges", "onStart")
    }


    public override fun onResume() {
        super.onResume()

        Log.d("MyStateChangeActivity", "onResume")
    }


    public override fun onSaveInstanceState(savedInstanceState: Bundle) {

        super.onSaveInstanceState(savedInstanceState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }


    public override fun onPause() {

        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }


    public override fun onStop() {

        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    public override fun onDestroy() {

        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}
