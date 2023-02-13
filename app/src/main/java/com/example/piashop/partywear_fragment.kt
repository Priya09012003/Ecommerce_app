package com.example.piashop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class partywear_fragment: Fragment() {
    override  fun onCreateView(inflater: LayoutInflater, container:ViewGroup?, savedInstanState: Bundle?):View?{

        return inflater.inflate(R.layout.partywear,container,false)
    }
}