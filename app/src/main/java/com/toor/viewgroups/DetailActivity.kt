package com.toor.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.toor.viewgroups.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding:ActivityDetailBinding? = null
    private var  logo = 0
    private var name:String? = null
    private var detail:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(LeagueAdapter.LOGO_EXTRA,0)
        name = intent.getStringExtra(LeagueAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(LeagueAdapter.DETAIL_EXTRAS)
        setUpLeagueDetails()

    }

    private fun setUpLeagueDetails(){
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}