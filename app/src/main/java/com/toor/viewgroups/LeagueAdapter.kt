package com.toor.viewgroups

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class LeagueAdapter(context: Context, details:List<LeagueTable>): ArrayAdapter<LeagueTable>(
    context,0,details
) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val detail = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.detail_item, parent, false)
        }

        val logo = view?.findViewById<ImageView>(R.id.club_logo)
        val name = view?.findViewById<TextView>(R.id.name)
        detail?.logo?.let {
            logo?.setImageResource(detail?.logo)
        }
    name?.text = detail?.name
        view?.setOnClickListener {
            val intent = Intent(parent.context, DetailActivity::class.java)
            intent.putExtra(LOGO_EXTRA,detail?.logo)
            intent.putExtra(NAME_EXTRAS,detail?.name)
            intent.putExtra(DETAIL_EXTRAS, detail?.details)
            parent.context.startActivity(intent)
        }
        return view!!
    }


    companion object {
        val LOGO_EXTRA = "logo_extras"
        val NAME_EXTRAS = "name_extras"
        val DETAIL_EXTRAS ="detail_extras"
    }
}