
package com.example.godspeed

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.godspeed.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val newsFragment = NewsFragment()
    private val teamFragment = TeamFragment()
    private val carFragment = CarFragment()
    private val resultsFragment = ResultsFragment()


    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_car -> replaceFragment(carFragment)
                R.id.ic_news -> replaceFragment(newsFragment)
                R.id.ic_results -> replaceFragment(resultsFragment)
                R.id.ic_team -> replaceFragment(teamFragment)
            }
            true
        }

        val actionBar: ActionBar? = actionBar
        actionBar?.setBackgroundDrawable(getDrawable(R.drawable.action_bar_bg))
        //ToDo: Check why background of action bar not green. Check Themes file and check theme

    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
    //ToDo: Aumentar o icone de home e colocar no centro, estilo app MyVodafone
}