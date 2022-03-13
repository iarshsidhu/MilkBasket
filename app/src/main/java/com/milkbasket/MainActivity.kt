package com.milkbasket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottomsheet_fragment.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheetFragment = BottomSheetFragment()

        cartButton.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")
        }

        cowCart.setOnClickListener {
           val bundle = Bundle()
            bundle.putString("Hello",headingText.text.toString())
            bottomSheetFragment.arguments = bundle
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
        }

        buffaloCart.setOnClickListener {
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
        }

        packetCart.setOnClickListener {
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
        }

    }

}