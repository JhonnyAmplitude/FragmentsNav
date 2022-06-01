package com.example.fragmentsnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentsnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //openFrag(firstFragment.newInstance(), R.id.place_holder_1)
        //openFrag(firstFragment.newInstance(), R.id.place_holder_2)
        binding.toFirstFramgent.setOnClickListener {
            openFrag(firstFragment.newInstance(), R.id.place_holder_1)
        }
    }


    private fun openFrag(f: Fragment, idHolder:Int){
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f).commit()
    }
}