package org.example

fun main(){
    val pancho = Player(16, "Pancho", 1.95, PlayerPosition.PIVOT, PlayerSkills(80, 87, 85, 92, 95))
    val checho = Player(19, "Checho", 1.80, PlayerPosition.PIVOT, PlayerSkills(80, 57, 60, 62, 70))
    val dea = Player(16, "dea", 1.95, PlayerPosition.PIVOT, PlayerSkills(70, 87, 85, 92, 85))
    val sho = Player(19, "sho", 1.80, PlayerPosition.PIVOT, PlayerSkills(90, 57, 60, 62, 70))
    val excel = Player(19, "excel", 1.80, PlayerPosition.PIVOT, PlayerSkills(86, 57, 60, 62, 80))
    val unc = Team("UNCuyo")
    println(unc.toString())
}