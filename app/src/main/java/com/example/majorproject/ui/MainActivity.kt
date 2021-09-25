package com.example.majorproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.RecyclerView
import com.example.majorproject.R
import com.example.majorproject.adapter.SolidItemAdapter
import com.example.majorproject.daos.SolidDao
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var actionBarDrawerToggler: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViews()

        startLearningButton.setOnClickListener {
            val startLearningActivityIntent = Intent(this, StartLearningActivity::class.java)
            startActivity(startLearningActivityIntent)
        }

        quizButton.setOnClickListener {
            val quizMenuActivityIntent = Intent(this, QuizMenuActivity::class.java)
            startActivity(quizMenuActivityIntent)
        }
    }

    private fun setUpViews(){
        setUpDrawerLayout()
    }

    private fun setUpDrawerLayout(){
        setSupportActionBar(topAppBar)
        actionBarDrawerToggler = ActionBarDrawerToggle(this, main_drawer, R.string.app_name, R.string.app_name)
        actionBarDrawerToggler.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarDrawerToggler.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}