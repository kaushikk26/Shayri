package com.example.newshayri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listview_main : ListView

    var array = arrayOf("Morning Shayri","Attitude Shayri","Funny Shayri","Sad Shayri","Best Wishes","God Shayri","Night Shayri", "Brithday Shayri", "Friend Shayri", "All In One", "Kite Shayri", "Yaad Shayri", "Diwali Shayri", "2 Line Shayri", "Motivational Shayri","Other Shayri", "Royal Shayri", "Janmashtami Shayri",  "Indepandence Shayri", "Holi Shayri", "Valentine Shayri", "Republic Shayri", "Ganesha Shayri", "Navratri Shayri")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview_main = findViewById(R.id.main)

        var adapter = Class1(this, array)
        listview_main.adapter = adapter

        var animation : Animation=AnimationUtils.loadAnimation(this,R.anim.shayarilist_animation)
        animation.duration=3000
        listview_main.animation=animation

        listview_main.setOnItemClickListener { parent, view, position, id ->

            var intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent.putExtra("m1", array[position]))
        }
    }
}