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

class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("GTM","GTM onCreate First fragment")
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("GTM","GTM onCreateView First fragment")
        val fragView = inflater.inflate(R.layout.fragment, container, false)
        fragView.findViewById<RelativeLayout>(R.id.frag_bg).setBackgroundResource(android.R.color.holo_red_light)
        arguments?.getInt("frag_name")?.let {
            fragView.findViewById<TextView>(R.id.frag_title).setText(it)
        }
        fragView.findViewById<Button>(R.id.frag_btn).setText(R.string.launch_second_fragment)
        fragView.findViewById<Button>(R.id.frag_btn).setOnClickListener{
            Toast.makeText(activity,"Clicked to launch SecondFragment",Toast.LENGTH_LONG).show()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.activity_container,SecondFragment())?.addToBackStack("MainActivity")?.commit()
        }
        return fragView
    }

    override fun onResume() {
        Log.e("GTM","GTM onResume First fragment")
        super.onResume()
    }

    override fun onPause() {
        Log.e("GTM","GTM onPause First fragment")
        super.onPause()
    }

    override fun onStop() {
        Log.e("GTM","GTM onStop First fragment")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("GTM","GTM onDestroy First fragment")
        super.onDestroy()
    }


}