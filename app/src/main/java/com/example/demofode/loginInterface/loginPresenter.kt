package com.example.demofode.loginInterface

class loginPresenter {
    var loginView: IloginView? = null
    fun LoginPresenter(loginView: IloginView) {
        this.loginView = loginView
    }
    fun login(){

    }
}