package com.android.libsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sgf.interfacelib.MyStr

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val str = MyStr()

        findViewById<TextView>(R.id.tv_text).text = str.getStr()

    }
}