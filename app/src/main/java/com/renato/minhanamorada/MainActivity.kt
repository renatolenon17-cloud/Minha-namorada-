package com.renato.minhanamorada

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.LinearLayout
import android.view.Gravity
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.parseColor("#FFF0F5"))
        layout.setPadding(60, 60, 60, 60)

        val texto = TextView(this)
        texto.text = "Oi meu amor ❤️\n\nFiz esse app só pra você!"
        texto.textSize = 24f
        texto.gravity = Gravity.CENTER
        texto.setTextColor(Color.parseColor("#C2185B"))

        layout.addView(texto)
        setContentView(layout)
    }
}
