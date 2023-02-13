package com.example.piashop

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.piashop.model.Product
import com.example.piashop.model.kurti_fragment
import com.example.piashop.model.saree_fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
   // private lateinit var binding: ActivityMainBinding

    @SuppressLint("AppCompatMethod")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout,MainFragment())
            .commit()
        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.actionHome ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,MainFragment())
                        .commit()
                }
                R.id.jeans ->{

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,Jeans_fragment())
                        .commit()
                    d("priya", "jeans was pressed!")
                }

                R.id.kurtis -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,kurti_fragment())
                        .commit()
                    d("priya", "kurtis was pressed!")
                }
                R.id.Crop_tops ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, Croptop_fragment())
                        .commit()
                    d("priya","croptops was pressed!")
                }

                R.id.sarees ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,saree_fragment())
                        .commit()
                    d("priya","sarees was pressed!")
                }

                R.id.party_wear ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,partywear_fragment())
                        .commit()
                    d("priya","party_wear was pressed!")
                }
                R.id.actionHome ->d("priya","settings was pressed!")
            }
            it.isChecked = true
            drawerlayout.closeDrawers()
            true
        }

        supportActionBar?.apply {

            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.baseline_menu_24);

        }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        drawerlayout.openDrawer(GravityCompat.START)
        return true
    }

}





