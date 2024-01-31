package com.example.newshayri

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager

class MainActivity3 : AppCompatActivity() {

    lateinit var done: ViewPager
    var set2 = arrayOf<String>("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        done = findViewById(R.id.done)


        var position = intent.getIntExtra("pos", 0)

        var set = intent.getStringExtra("m2")
    
        set2 = intent.getStringArrayExtra("array")!!

        var mypager = Pageradapterrr(this, set2)
        done.adapter = mypager

        done.setCurrentItem(position)

    }
}