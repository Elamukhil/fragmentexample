package com.example.fragmentexample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment


class TextFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Get the custom view for this fragment layout
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
        super.onCreate(savedInstanceState)
        val users = listOf(
                "Virat Kohli", "Rohit Sharma", "Steve Smith",
                "Kane Williamson", "Ross Taylor"
        )

        var mListView = view.findViewById<ListView>(R.id.userlist)
        val arrayAdapter = ArrayAdapter(activity!!,
                R.layout.list_item_forecast, users)
        mListView.adapter = arrayAdapter

        return view
    }

}