package org.example

class Match (
    val equipoLocal: Team,
    val equipoVisitante: Team
) {
    private val puntosLocal : Int = 0
    private val puntosVisitante : Int = 0

    val marcadorL : Int
        get() = puntosLocal
    val marcadorV : Int
        get() = puntosVisitante

    fun simularPartido(){

    }
}