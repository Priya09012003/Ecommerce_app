package com.example.piashop.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piashop.R

class saree_fragment:Fragment() {
    override  fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanState: Bundle?): View?{

        return inflater.inflate(R.layout.saree,container,false)
    }
}