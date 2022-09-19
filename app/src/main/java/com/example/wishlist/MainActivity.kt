package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var wishlist_items:ArrayList<Item>
    // Creating a variable, yet not setting anything to it yet. Blank container.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the input and send the variable to the arraylist. Every time the button is pressed. Put the add function into the loop for adding items
        setContentView(R.layout.activity_main)
        wishlist_items = ArrayList()
        wishlist_items.add(Item(name="input the name", price="input the double", store="input the store locator from the keyboard"))
        wishlist_items.add(Item())
        wishlist_items.add(Item())
        wishlist_items.add(Item())
        wishlist_items.add(Item())
        wishlist_items.add(Item())

        class UserListActivity : AppCompatActivity() {
            lateinit var wishlist: ArrayList<Item>
            override fun onCreate(savedInstanceState: Bundle?) {
                // ...
                // Lookup the recyclerview in activity layout
                val rvContacts = findViewById<View>(R.id.rvContacts) as RecyclerView
                // Initialize contacts
                contacts = Contact.createContactsList(20)
                // Create adapter passing in the sample user data
                val adapter = ContactsAdapter(contacts)
                // Attach the adapter to the recyclerview to populate items
                rvContacts.adapter = adapter
                // Set layout manager to position the items
                rvContacts.layoutManager = LinearLayoutManager(this)
                // That's all!
            }
        }
    }
}