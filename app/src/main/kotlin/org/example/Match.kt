package org.example

import kotlin.math.roundToInt

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
        val partido = this
        val ataqueLocal = (partido.equipoLocal.promedioAtaque()/partido.equipoVisitante.promedioDefensa() + 0.05) * 100
        val ataqueVisitante = (partido.equipoVisitante.promedioAtaque()/partido.equipoLocal.promedioDefensa()) * 100
        val posibleMarcadorLocal : MutableList<Int> = mutableListOf(ataqueLocal.roundToInt())
        val posibleMarcadorVisitante : MutableList<Int> = mutableListOf(ataqueVisitante.roundToInt())
        if (ataqueLocal < ataqueVisitante) {
            posibleMarcadorLocal.addFirst(ataqueLocal.roundToInt()-30)
            posibleMarcadorVisitante.addFirst(ataqueLocal.roundToInt()-10)
        } else{
            posibleMarcadorLocal.addFirst(ataqueVisitante.roundToInt()-10)
            posibleMarcadorVisitante.add(ataqueLocal.roundToInt()+10)
        }


    }

}