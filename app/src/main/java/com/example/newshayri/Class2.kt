package com.example.newshayri

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class Class2(var mainActivity2: MainActivity2, var blank: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return blank.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        var copy : ImageView
        var share : ImageView
        var whatshap : ImageView
        var listv : TextView

        var view2 = LayoutInflater.from(mainActivity2).inflate(R.layout.card2, p2, false)

        var card2: TextView
        card2 = view2.findViewById(R.id.listv)
        copy = view2.findViewById(R.id.copy)
        whatshap=view2.findViewById(R.id.whatshap)
        share=view2.findViewById(R.id.share)
        listv=view2.findViewById(R.id.listv)


        copy.setOnClickListener {

            var shayri = blank[position]

            val clipboardManager =
                mainActivity2.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", shayri)
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(mainActivity2, "Text copied to clipboard", Toast.LENGTH_LONG).show()
            Toast.makeText(mainActivity2, "copy", Toast.LENGTH_SHORT).show()

        }

        share.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, blank[position].toString())
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            mainActivity2.startActivity(shareIntent)
        }


        whatshap.setOnClickListener {
            val messageEditText = listv
            val message = messageEditText.toString()


            sendMessage(message);
        }

        card2.setText(blank[position])

        return view2
    }
    private fun sendMessage(message: String) {

        val intent = Intent(Intent.ACTION_SEND)

        intent.type = "text/plain"

        intent.setPackage("com.whatsapp")

        intent.putExtra(Intent.EXTRA_TEXT, message)

        if (intent.resolveActivity(mainActivity2.packageManager) == null) {
            Toast.makeText(mainActivity2,
                "Please install whatsapp first.",
                Toast.LENGTH_SHORT).show()
            return
        }
        mainActivity2.startActivity(intent)
    }
}
