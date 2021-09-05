package com.example.majorproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.majorproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startLearningButton.setOnClickListener {
            val startLearningActivityIntent = Intent(this, StartLearningActivity::class.java)
            startActivity(startLearningActivityIntent)
        }

        quizButton.setOnClickListener {
            val quizMenuActivityIntent = Intent(this, QuizMenuActivity::class.java)
            startActivity(quizMenuActivityIntent)
        }
    }
}