package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var wishlist_items:ArrayList<Item>
    // Creating a variable, yet not setting anything to it yet. Blank container.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the input and send the variable to the arraylist. Every time the button is pressed. Put the add function into the loop for adding items
        setContentView(R.layout.activity_main)
        wishlist_items = ArrayList()
        wishlist_items.add(Item(name="name", price=24.7, store="store link"))
        wishlist_items.add(Item(name="n", price=25.7, store="store link 2"))
        wishlist_items.add(Item(name="na", price=26.7, store="store link 3"))

        val mainRv = findViewById<View>(R.id.mainRv) as RecyclerView

        // Create adapter passing in the sample user data
        val adapter = ItemAdapter(wishlist_items)
        // Attach the adapter to the recyclerview to populate items
        mainRv.adapter = adapter
        // Set layout manager to position the items
        mainRv.layoutManager = LinearLayoutManager(this)
        // That's all!
    }
}