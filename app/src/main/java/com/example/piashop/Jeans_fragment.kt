package com.example.piashop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Jeans_fragment: Fragment() {
    override  fun onCreateView(inflater: LayoutInflater, container:ViewGroup?, savedInstanState: Bundle?):View?{
        return inflater.inflate(R.layout.jeans,container,false)
    }
}