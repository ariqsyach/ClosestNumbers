package com.example.test

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(),GameView {
    private val presenter : GamePresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        btn_play.setOnClickListener{
            presenter.
        }
    }

    override fun hasilHitung(int: Int) {
        text_hasil.text = int
    }

}