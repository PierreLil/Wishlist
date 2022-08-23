package com.example.wishlist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val itemName = findViewById<EditText>(R.id.Name)
        val url = findViewById<EditText>(R.id.Url)
        val price = findViewById<EditText>(R.id.Price)
        val textView1Name = findViewById<TextView>(R.id.textView1Name)
        val textView1Url = findViewById<TextView>(R.id.textView1Url)
        val textView1Price = findViewById<TextView>(R.id.textView1Price)
        val textView2Name = findViewById<TextView>(R.id.textView2Name)
        val textView2Url = findViewById<TextView>(R.id.textView2Url)
        val textView2Price = findViewById<TextView>(R.id.textView2Price)
        val textView3Name = findViewById<TextView>(R.id.textView3Name)
        val textView3Url = findViewById<TextView>(R.id.textView3Url)
        val textView3Price = findViewById<TextView>(R.id.textView3Price)
        val textView4Name = findViewById<TextView>(R.id.textView4Name)
        val textView4Url = findViewById<TextView>(R.id.textView4Url)
        val textView4Price = findViewById<TextView>(R.id.textView4Price)
        val textView5Name = findViewById<TextView>(R.id.textView5Name)
        val textView5Url = findViewById<TextView>(R.id.textView5Url)
        val textView5Price = findViewById<TextView>(R.id.textView5Price)

        var counter = 0

        button.setOnClickListener {
            counter++

            val listUrl = url.text.toString()
            val listItemName = itemName.text.toString()
            val listPrice = price.text.toString()

            if (counter == 1) {
                textView1Name.text = listItemName
                textView1Price.text = listPrice
                textView1Url.text = listUrl
            }
            if (counter == 2) {
                textView2Name.text = listItemName
                textView2Price.text = listPrice
                textView2Url.text = listUrl
            }
            if (counter == 3) {
                textView3Name.text = listItemName
                textView3Price.text = listPrice
                textView3Url.text = listUrl
            }
            if (counter == 4) {
                textView4Name.text = listItemName
                textView4Price.text = listPrice
                textView4Url.text = listUrl
            }
            if (counter == 5) {
                textView5Name.text = listItemName
                textView5Price.text = listPrice
                textView5Url.text = listUrl
            }

            itemName.hideKeyboard()
            itemName.setText("")
            url.hideKeyboard()
            url.setText("")
            price.hideKeyboard()
            price.setText("")
        }

        itemName.hideKeyboard()
        itemName.setText("")
        url.hideKeyboard()
        url.setText("")
        price.hideKeyboard()
        price.setText("")
    }
    fun View.hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}