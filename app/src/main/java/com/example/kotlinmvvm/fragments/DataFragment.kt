package com.example.kotlinmvvm.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinassignment.adapters.ItemAdapter

import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.viewmodels.MainActivityViewModel


class DataFragment : Fragment() {

    lateinit var mainActivityViewModel: MainActivityViewModel
    private lateinit var recyclerListView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityViewModel = ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = LayoutInflater.from(container?.context)
            .inflate(R.layout.fragment_data, container, false)
        recyclerListView = view.findViewById(R.id.recyclerList)
        recyclerListView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivityViewModel.getRepoData().observe(viewLifecycleOwner, Observer {
            Log.e("size final", it.size.toString())
        })
        mainActivityViewModel.getApiData()
            .observe(viewLifecycleOwner, Observer { mainActivityViewModel.saveData(it)
                lateinit var rowsdata : MutableList<RowModel>

                    rowsdata = it.rows

                     //val adapter = ItemAdapter(rows, MainActivity::class)
                    context?.let{val adapter = ItemAdapter(rowsdata, context!!)
                        recyclerListView.adapter = adapter}



            })
//        mainActivityViewModel.getRowData().observe(viewLifecycleOwner, Observer {
//            it.forEach {
//                Log.e("data", it.title)
//            }
//        })
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()

    }


}

