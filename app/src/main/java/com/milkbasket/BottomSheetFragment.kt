package com.milkbasket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet_fragment.*
import kotlinx.android.synthetic.main.cart_items.*

class BottomSheetFragment : BottomSheetDialogFragment() {

   private var milkAdapter = MilkAdapter(mutableListOf())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.bottomsheet_fragment, container, false)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = milkAdapter
            return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString("Hello",headText.text.toString())
        headText.text = text

    }
}