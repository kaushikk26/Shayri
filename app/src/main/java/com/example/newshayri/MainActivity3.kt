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
    lateinit var leftk: Button
    lateinit var rightk: Button
    var set2 = arrayOf<String>("")
    lateinit var copy: ImageView
    lateinit var whatsapp: ImageView
    lateinit var share: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        done = findViewById(R.id.done)
//        copy = findViewById(R.id.copy)
//        share = findViewById(R.id.share)
//        whatsapp = findViewById(R.id.whatshap)

        var position = intent.getIntExtra("pos", 0)

        var set = intent.getStringExtra("m2")

//        done.setText(set)
    
        set2 = intent.getStringArrayExtra("array")!!

        var mypager = Pageradapterrr(this, set2)
        done.adapter = mypager

        done.setCurrentItem(position)

//        copy.setOnClickListener {
//
//            val textToCopy = done.toString()
//            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
//            val clipData = ClipData.newPlainText("text", textToCopy)
//            clipboardManager.setPrimaryClip(clipData)
//            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_LONG).show()
//
//            Toast.makeText(this,"copy",Toast.LENGTH_SHORT).show()
//        }
//
//        share.setOnClickListener {
//            val sendIntent: Intent = Intent().apply {
//                action = Intent.ACTION_SEND
//                putExtra(Intent.EXTRA_TEXT, done.toString())
//                type = "text/plain"
//            }
//
//            val shareIntent = Intent.createChooser(sendIntent, null)
//            startActivity(shareIntent)
//        }
//
//        whatsapp.setOnClickListener {
//            val messageEditText = done.toString()
//            val message = messageEditText.toString()
//
//
//            sendMessage(message);
//        }
//    }
//    private fun sendMessage(message: String) {
//
//        val intent = Intent(Intent.ACTION_SEND.toString())
//
//        intent.type = "text/plain"
//
//        intent.setPackage("com.whatsapp")
//
//        intent.putExtra(Intent.EXTRA_TEXT.toString(), message)
//
//        if (intent.resolveActivity(packageManager) == null) {
//            Toast.makeText(this,
//                "Please install whatsapp first.",
//                Toast.LENGTH_SHORT).show()
//            return
//        }
//        startActivity(intent)
//    }
    }
}