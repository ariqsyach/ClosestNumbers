package com.example.test

class GamePresenter (val view: GameView){
    val data = Game()

    val angka = Array{1..9}
    fun randomNumber{
        val hasilRandom = angka.random()
        data.hasil = hasilRandom
        view.hasilHitung(data)
    }
}