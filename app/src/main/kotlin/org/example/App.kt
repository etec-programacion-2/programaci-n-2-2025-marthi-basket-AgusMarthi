package org.example

fun main(){
    val pancho = Player(16, "Pancho", 1.95, PlayerPosition.PIVOT, PlayerSkills(80, 87, 85, 92, 95))
    val checho = Player(19, "Checho", 1.80, PlayerPosition.ALA_PIVOT, PlayerSkills(80, 57, 60, 62, 70))
    val juanb = Player(16, "juanb", 1.95, PlayerPosition.ALERO, PlayerSkills(62, 73, 73, 52, 65))
    val rami = Player(15, "rami", 1.80, PlayerPosition.ESCOLTA, PlayerSkills(90, 80, 78, 75, 80))
    val yo = Player(16, "yo", 1.80, PlayerPosition.BASE, PlayerSkills(86, 77, 80, 62, 80))
    val unc = Team("UNCuyo")
    unc.seleccJugador(pancho)
    unc.seleccJugador(checho)
    unc.seleccJugador(juanb)
    unc.seleccJugador(rami)
    unc.seleccJugador(yo)

    println(unc.promedioAtaque(unc))
}