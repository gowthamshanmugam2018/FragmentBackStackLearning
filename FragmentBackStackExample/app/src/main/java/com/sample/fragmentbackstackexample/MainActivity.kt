package com.sample.fragmentbackstackexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchInitialFragment(view: View) {
        findViewById<Button>(R.id.activity_btn).visibility=View.GONE
        var args:Bundle = Bundle()
        args.putInt("frag_name",R.string.hello_First_fragment)
        var firstFragment =BlankFragment()
        firstFragment.arguments=args
        supportFragmentManager.beginTransaction().replace(R.id.activity_container, firstFragment).addToBackStack("MainActivity").commit()
    }

    override fun onBackPressed() {

        val frag = supportFragmentManager.findFragmentById(R.id.activity_container)
        if(frag==null && !findViewById<Button>(R.id.activity_btn).isVisible){
            findViewById<Button>(R.id.activity_btn).visibility=View.VISIBLE
        }else{
            if(findViewById<Button>(R.id.activity_btn).isVisible) Toast.makeText(this,"Activity closed", Toast.LENGTH_SHORT).show()
            super.onBackPressed()
        }
    }
}