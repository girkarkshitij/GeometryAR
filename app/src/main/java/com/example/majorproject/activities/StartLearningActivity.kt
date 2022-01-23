package com.example.majorproject.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.majorproject.R
import com.example.majorproject.adapter.SolidItemAdapter
import com.example.majorproject.daos.SolidDao
import com.example.majorproject.models.Solid
import kotlinx.android.synthetic.main.activity_quiz_menu.*
import kotlinx.android.synthetic.main.activity_start_learning.*

class StartLearningActivity : AppCompatActivity() {
    lateinit var adapter: SolidItemAdapter
    private var myDataset = mutableListOf<Solid>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_learning)
        loadData()
        setUpRecyclerView()
    }

    private fun loadData(){
        myDataset = SolidDao().loadSolid()
    }

    private fun setUpRecyclerView() {
        adapter = SolidItemAdapter(this, myDataset)
        solidsMenuView.layoutManager = GridLayoutManager(this, 2)
        solidsMenuView.adapter = adapter
        solidsMenuView.setHasFixedSize(true)
        adapter.onItemClick = {
            Solid -> Log.d("CLICK", Solid.toString())
            val intent = Intent(this, ArActivity::class.java)

            //TODO: pass the name of solid to render
            intent.putExtra("name", Solid.title)
            startActivity(intent)
        }
    }
}