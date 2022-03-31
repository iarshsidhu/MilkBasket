package com.milkbasket

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Error

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cartButton.setOnClickListener {//
            val intent = Intent(this, MyCartActivity::class.java)
            startActivity(intent)
        }

        cowCart.setOnClickListener {
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
            insertData()
        }

        buffaloCart.setOnClickListener {
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
            insertData2()

        }

        packetCart.setOnClickListener {
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_LONG).show()
            insertData3()

        }
    }

    private fun insertData() {

        val call = CartApi.Milk.milkInstance.sending(headingText.text.toString())
        call.enqueue(object : Callback<CartModel?> {
            override fun onResponse(call: Call<CartModel?>, response: Response<CartModel?>) {

            }

            override fun onFailure(call: Call<CartModel?>, t: Throwable) {
                Toast.makeText(applicationContext, t.toString(), Toast.LENGTH_SHORT).show()
                Log.e("Hello", "Error")
            }
        })
    }

    private fun insertData2() {

        val call = CartApi.Milk.milkInstance.sending(headingText2.text.toString())
        call.enqueue(object : Callback<CartModel?> {
            override fun onResponse(call: Call<CartModel?>, response: Response<CartModel?>) {

            }

            override fun onFailure(call: Call<CartModel?>, t: Throwable) {
                Toast.makeText(applicationContext, t.toString(), Toast.LENGTH_SHORT).show()
                Log.e("Hello", "Error")
            }
        })
    }

    private fun insertData3() {

        val call = CartApi.Milk.milkInstance.sending(headingText3.text.toString())
        call.enqueue(object : Callback<CartModel?> {
            override fun onResponse(call: Call<CartModel?>, response: Response<CartModel?>) {

            }

            override fun onFailure(call: Call<CartModel?>, t: Throwable) {
                Toast.makeText(applicationContext, t.toString(), Toast.LENGTH_SHORT).show()
                Log.e("Hello", "Error")
            }
        })
    }
}