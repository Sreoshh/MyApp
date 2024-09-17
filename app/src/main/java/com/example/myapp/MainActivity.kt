package com.example.myapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.adapter.AlumniAdapter
import com.example.myapp.model.Alumni


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AlumniAdapter
    private val alumniList = mutableListOf<Alumni>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        //You can now interact with the views in your xml file
        val textView=findViewById<TextView>(R.id.hello_text)
        textView.text="Welcome to the Alumni Connect!"

        recyclerView = findViewById(R.id.alumni_recycler_view)
        val connectButton: View = findViewById(R.id.connect_button)

        // Add sample data
        alumniList.add(Alumni("John Doe", "Software Engineer at XYZ Corp"))
        alumniList.add(Alumni("Jane Smith", "Marketing Manager at ABC Inc"))

        adapter = AlumniAdapter(alumniList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        connectButton.setOnClickListener {
            // Handle connect button click here
        }
    }
}