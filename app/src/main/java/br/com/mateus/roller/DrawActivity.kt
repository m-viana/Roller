package br.com.mateus.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_draw.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt

class DrawActivity : AppCompatActivity() {

    val array : MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw)

        play_button.setOnClickListener { clickButton() }
    }

    fun clickButton(){
        val texto= findViewById<TextView>(R.id.tv_result)
        val randomNumber = Random.nextInt(0..10)
        texto.text = "$randomNumber"
        array.add(randomNumber)

    }
}