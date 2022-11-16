package com.zebrano.introductiontoclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zebrano.introductiontoclasses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingObj : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingObj = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingObj.root)

        // constructor without params
        val user = User()
        user.id = "000000"
        user.age = 23
        user.name = "Homp"

        user.logInfo()

        user.addAge(37)
        user.logInfo()

        fun foo(param : Int) : Int {
            return param + 10
        }

        // constructor with params
        var userConstr = UserConstruct("Jurt", "000001", 38)



    }
}