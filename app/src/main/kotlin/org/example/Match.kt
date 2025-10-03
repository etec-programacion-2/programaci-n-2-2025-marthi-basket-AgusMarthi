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

    fun simularPartido(partido : Match){
        val ataqueLocal = partido.equipoLocal.promedioAtaque()/partido.equipoVisitante.promedioDefensa() + 0.05
        val ataqueVisitante = partido.equipoVisitante.promedioAtaque()/partido.equipoLocal.promedioDefensa()
        val diferencia = (ataqueLocal - ataqueVisitante) * 10


    }



}