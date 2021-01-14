package com.example.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import kotlinx.android.synthetic.main.activity_profile_page.*

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val imageURL = "https://www.songhall.org/images/uploads/exhibits/Michael_Jackson.jpg"


        Glide.with(this)
            .load(imageURL)
            .into(ProfilePic)

    }
}
