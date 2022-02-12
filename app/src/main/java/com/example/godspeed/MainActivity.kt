
package com.example.godspeed

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

    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
    //aumentar o icone de home e colocar no centro, estilo app MyVodafone
}