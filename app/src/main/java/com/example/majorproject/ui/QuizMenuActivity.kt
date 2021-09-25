package com.example.majorproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.majorproject.R
import com.example.majorproject.adapter.QuizAdapter
import com.example.majorproject.models.Quiz
import kotlinx.android.synthetic.main.activity_quiz_menu.*

class QuizMenuActivity : AppCompatActivity() {
    lateinit var adapter: QuizAdapter
    private var quizList = mutableListOf<Quiz>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_menu)
        dummyData()
        setUpRecyclerView()
    }

    private fun dummyData() {
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
        quizList.add(Quiz("12-10-2000", "hello"))
    }

    private fun setUpRecyclerView() {
        adapter = QuizAdapter(this, quizList)
        quizRecyclerView.layoutManager = GridLayoutManager(this, 2)
        quizRecyclerView.adapter = adapter
    }
}