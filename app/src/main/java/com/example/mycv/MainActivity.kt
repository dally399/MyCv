package com.example.mycv

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivFacebook = findViewById<ImageView>(R.id.img_facebook)
        ivFacebook.setOnClickListener {
            val url = "https://www.facebook.com/" // replace <username> with your Facebook username
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val ivWhatsapp = findViewById<ImageView>(R.id.img_whatsapp)
        ivWhatsapp.setOnClickListener {
            val url = "https://api.whatsapp.com/send?phone=+254727466678" // replace <phone_number> with the actual phone number
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val ivGithub = findViewById<ImageView>(R.id.img_github)
        ivGithub.setOnClickListener {
            val url = "https://github.com/dally399"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val ivYoutube = findViewById<ImageView>(R.id.img_youtube)
        ivYoutube.setOnClickListener {
            val url = "https://www.youtube.com/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val ivGoogle = findViewById<ImageView>(R.id.img_google)
        ivGoogle.setOnClickListener {
            val url = "https://plus.google.com/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }





    }
}