package me.osama.flutternativeapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*
import io.flutter.facade.Flutter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab.setOnClickListener { navigateFlutter() }
    }


    private fun navigateFlutter() {
        val tx = supportFragmentManager.beginTransaction()
        tx.replace(R.id.container, Flutter.createFragment("route1"))
        tx.commit()
    }
}
