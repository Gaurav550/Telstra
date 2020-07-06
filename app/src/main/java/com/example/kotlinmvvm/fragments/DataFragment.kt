package com.example.kotlinmvvm.fragments

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.kotlinassignment.models.Items
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.adapters.ItemAdapter
import com.example.kotlinmvvm.models.RowModel
import com.example.kotlinmvvm.viewmodels.MainActivityViewModel
import kotlin.collections.ArrayList


class DataFragment : Fragment() {

    private lateinit var mainActivityViewModel: MainActivityViewModel
    private lateinit var recyclerListView: RecyclerView
    private lateinit var swipeLayout: SwipeRefreshLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityViewModel =
            ViewModelProviders.of(activity!!).get(MainActivityViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = LayoutInflater.from(container?.context)
            .inflate(R.layout.fragment_data, container, false)
        recyclerListView = view.findViewById(R.id.recyclerList)
        recyclerListView.layoutManager = LinearLayoutManager(activity)
        swipeLayout = view.findViewById(R.id.swipe_layout)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivityViewModel.getRepoData().observe(activity!!, Observer {
            Log.e("size final", it.size.toString())
        })


        if (isNetworkAvailable(context!!)) {
            mainActivityViewModel.getApiData()
                .observe(viewLifecycleOwner, Observer {
                    mainActivityViewModel.saveData(it)
                    lateinit var rows: MutableList<RowModel>

                    rows = it.rows

                    context?.let {
                        val adapter = ItemAdapter(rows, context!!)
                        recyclerListView.adapter = adapter
                    }


                })
        } else {
            updateData()

        }

        swipeLayout.setOnRefreshListener {
            var rowsdata: MutableList<RowModel> = ArrayList()
            rowsdata.clear()
            mainActivityViewModel.getApiData()
                .observe(viewLifecycleOwner, Observer {
                    mainActivityViewModel.saveData(it)

                    rowsdata = it.rows

                    context?.let {
                        val adapter = ItemAdapter(rowsdata, context!!)
                        recyclerListView.adapter = adapter
                    }


                })
            swipeLayout.isRefreshing = false
        }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val capabilities =
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                return true
            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                return true
            }
        }
        return false
    }

    private fun updateData() {
        mainActivityViewModel.getRowCount()
            ?.observe(this, androidx.lifecycle.Observer {
                if (it != null && it > 0) {
                    mainActivityViewModel.getItems()?.observe(this, Observer<List<Items>> { items ->
                        val adapter = ItemAdapter(items[0].rows, context!!)
                        recyclerListView.adapter = adapter
                    })
                } else {
                    Toast.makeText(context, "No Data available", Toast.LENGTH_LONG).show()
                }
            })
    }
}

