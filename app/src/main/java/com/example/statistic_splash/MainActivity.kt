package com.example.statistic_splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.statistic_splash.StartPage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nextIntent = Intent(this, StartPage::class.java)
        // StartPage로 넘어가기 전, splash 화면 나타
        startActivity(nextIntent)
    }
}