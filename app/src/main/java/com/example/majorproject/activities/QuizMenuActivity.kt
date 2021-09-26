package com.example.majorproject.activities

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
        quizList.add(Quiz("12-10-2000", "Quiz 1"))
        quizList.add(Quiz("12-10-2000", "Quiz 2"))
        quizList.add(Quiz("12-10-2000", "Quiz 3"))
        quizList.add(Quiz("12-10-2000", "Quiz 4"))
        quizList.add(Quiz("12-10-2000", "Quiz 5"))
        quizList.add(Quiz("12-10-2000", "Quiz 6"))
        quizList.add(Quiz("12-10-2000", "Quiz 7"))
        quizList.add(Quiz("12-10-2000", "Quiz 8"))
        quizList.add(Quiz("12-10-2000", "Quiz 9"))
        quizList.add(Quiz("12-10-2000", "Quiz 10"))
        quizList.add(Quiz("12-10-2000", "Quiz 11"))
        quizList.add(Quiz("12-10-2000", "Quiz 12"))
        quizList.add(Quiz("12-10-2000", "Quiz 13"))
        quizList.add(Quiz("12-10-2000", "Quiz 14"))
        quizList.add(Quiz("12-10-2000", "Quiz 15"))
        quizList.add(Quiz("12-10-2000", "Quiz 16"))
        quizList.add(Quiz("12-10-2000", "Quiz 17"))
        quizList.add(Quiz("12-10-2000", "Quiz 18"))
    }

    private fun setUpRecyclerView() {
        adapter = QuizAdapter(this, quizList)
        quizRecyclerView.layoutManager = GridLayoutManager(this, 2)
        quizRecyclerView.adapter = adapter
    }
}