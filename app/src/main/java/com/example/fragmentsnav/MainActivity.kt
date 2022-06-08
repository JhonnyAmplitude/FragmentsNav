package com.example.fragmentsnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentsnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirstFramgent.setOnClickListener(firstFragmentButtonListener)
            //openFrag(firstFragment.newInstance(), R.id.place_holder)
    }

    private val firstFragmentButtonListener = View.OnClickListener {
        it.visibility = View.GONE
        supportFragmentManager.beginTransaction()
            .replace(binding.placeHolder.id, firstFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }


/*
    private fun openFrag(f: Fragment, idHolder:Int){
        supportFragmentManager
            .beginTransaction()
            .add(idHolder, f).commit()
    }

 */
}