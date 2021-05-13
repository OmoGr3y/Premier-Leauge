package com.toor.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.toor.viewgroups.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    var binding: ActivityListBinding? = null
    var adapter: LeagueAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setLeagueDetails()
    }

    private fun setLeagueDetails(){
        adapter  = LeagueAdapter(this, DummyData.facts)
        binding?.leagueList?.adapter = adapter
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}