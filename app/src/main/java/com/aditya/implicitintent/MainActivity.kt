package com.aditya.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val url=findViewById<Button>(R.id.button)
        val camera=findViewById<Button>(R.id.button2)
        val contact=findViewById<Button>(R.id.button3)
        val callLog=findViewById<Button>(R.id.button4)
        val dialPad=findViewById<Button>(R.id.button5)

        url.setOnClickListener {

            val i=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.ums.lpu.in"))
            startActivity(i)

        }

        camera.setOnClickListener{

            val i=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i)

        }

        contact.setOnClickListener {

            val i=Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i)

        }

    }
}