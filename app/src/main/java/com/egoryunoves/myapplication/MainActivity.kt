package com.egoryunoves.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initButtons()
    }

//    private fun initButtons() {
//        b_menu.setOnClickListener {
//            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
//        }
//        b_izbran.setOnClickListener {
//            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
//        }
//        b_posmotr.setOnClickListener {
//            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
//        }
//        b_podborki.setOnClickListener {
//            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
//        }
//        b_nastroiki.setOnClickListener {
//            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
//        }
//    }

}