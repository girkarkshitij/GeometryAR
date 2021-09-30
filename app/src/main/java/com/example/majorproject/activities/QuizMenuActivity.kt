package com.example.majorproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.majorproject.R
import com.example.majorproject.adapter.QuizAdapter
import com.example.majorproject.models.Quiz
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_quiz_menu.*

class QuizMenuActivity : AppCompatActivity() {
    lateinit var adapter: QuizAdapter
    private var quizList = mutableListOf<Quiz>()

    lateinit var firestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_menu)
        setUpFireStore()
        setUpRecyclerView()
    }

    private fun setUpFireStore(){
        firestore = FirebaseFirestore.getInstance()
        val collectionReference : CollectionReference = firestore.collection("quizzes")
        collectionReference.addSnapshotListener{value, error ->
            if(value == null || error != null){
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                return@addSnapshotListener
            }
            Log.d("DATA", value.toObjects(Quiz::class.java).toString())
            quizList.clear()
            quizList.addAll(value.toObjects(Quiz::class.java))
            adapter.notifyDataSetChanged()
        }
    }

    private fun setUpRecyclerView() {
        adapter = QuizAdapter(this, quizList)
        quizRecyclerView.layoutManager = GridLayoutManager(this, 2)
        quizRecyclerView.adapter = adapter
    }
}