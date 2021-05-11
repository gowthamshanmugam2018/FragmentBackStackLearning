package com.sample.fragmentbackstackexample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("GTM","GTM onCreate Second Fragment")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        Log.e("GTM","GTM onCreateView Second fragment")
        val fragView = inflater.inflate(R.layout.fragment, container, false)
        fragView.findViewById<RelativeLayout>(R.id.frag_bg).setBackgroundResource(android.R.color.holo_blue_bright)
        fragView.findViewById<TextView>(R.id.frag_title).setText(R.string.hello_Second_fragment)
        fragView.findViewById<Button>(R.id.frag_btn).visibility=View.GONE
        return fragView
    }

    override fun onResume() {
        Log.e("GTM","GTM onResume Second fragment")
        super.onResume()
    }

    override fun onPause() {
        Log.e("GTM","GTM onPause Second fragment")
        super.onPause()
    }

    override fun onStop() {
        Log.e("GTM","GTM onStop Second fragment")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("GTM","GTM onDestroy Second fragment")
        super.onDestroy()
    }


}