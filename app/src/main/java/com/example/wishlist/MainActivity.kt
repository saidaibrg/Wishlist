package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var wishlist_items:ArrayList<Item>
    // Creating a variable, yet not setting anything to it yet. Blank container.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get the input and send the variable to the arraylist. Every time the button is pressed. Put the add function into the loop for adding items

        val nameEditText = findViewById<EditText>(R.id.nameEdit)
        val priceEditText = findViewById<EditText>(R.id.priceEdit)
        val button=findViewById<Button>(R.id.button)
        val storeEditText=findViewById<EditText>(R.id.storeEdit)


        wishlist_items = ArrayList()
        wishlist_items.add(Item(name="name", price="24.7", store="store link"))
        //wishlist_items.add(Item(name="n", price="25.7", store="store link 2"))
        //CHECK IF THE LIST sending is WORKING


        button.setOnClickListener(View.OnClickListener {
            var strName = nameEditText.text.toString()
            var strStore = storeEditText.text.toString()
            var strPrice = priceEditText.text.toString()

            wishlist_items.add(Item(name=strName, price=strPrice, store=strStore))
            })

        // Get all of the values in temp variables, add them to the wishlist_items

        val mainRv = findViewById<View>(R.id.mainRv) as RecyclerView
        // Create adapter passing in the sample user data
        val adapter = ItemAdapter(wishlist_items)
        mainRv.adapter = adapter
        mainRv.layoutManager = LinearLayoutManager(this)

    }
}