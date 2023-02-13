package com.example.piashop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Croptop_fragment: Fragment() {
    override  fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanState: Bundle?): View?{

        return inflater.inflate(R.layout.crop_top,container,false)
    }
}