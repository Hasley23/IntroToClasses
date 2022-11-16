package com.zebrano.introductiontoclasses

import android.util.Log

class User() {
    var name: String? = null
    var id: String? = null
    var age: Int = 0

    fun addAge(incStep: Int){
        this.age = this.age + incStep
    }
    fun logInfo(){
        Log.d("User class log", "User name: ${this.name}; user id: ${this.id}; user age: ${this.age}")
    }



}