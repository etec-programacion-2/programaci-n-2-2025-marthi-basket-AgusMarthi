package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

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
        val promedioPuntosLocal = (partido.equipoLocal.promedioAtaque()/partido.equipoVisitante.promedioDefensa() + 0.05) * 100
        val ataqueLocal = promedioPuntosLocal.roundToInt()
        val promedioPuntosVisita = (partido.equipoVisitante.promedioAtaque()/partido.equipoLocal.promedioDefensa()) * 100
        val ataqueVisitante = promedioPuntosVisita.roundToInt()
        val posibleMarcadorLocal : MutableList<Int> = mutableListOf()
        val posibleMarcadorVisitante : MutableList<Int> = mutableListOf()
        if (ataqueLocal > ataqueVisitante) {
            posibleMarcadorLocal.add(ataqueLocal+10)
            posibleMarcadorLocal.add(ataqueLocal-20)
            posibleMarcadorVisitante.add(ataqueLocal-10)
            posibleMarcadorVisitante.add(ataqueVisitante-10)
        } else if(ataqueLocal < ataqueVisitante){
            posibleMarcadorVisitante.add(ataqueVisitante+10)
            posibleMarcadorVisitante.add(ataqueVisitante-20)
            posibleMarcadorLocal.add(ataqueLocal-10)
            posibleMarcadorLocal.add(ataqueVisitante-10)
        } else {
            posibleMarcadorVisitante.add(ataqueVisitante+10)
            posibleMarcadorVisitante.add(ataqueVisitante-10)
            posibleMarcadorLocal.add(ataqueLocal+10)
            posibleMarcadorLocal.add(ataqueLocal-10)
        }
        posibleMarcadorLocal.sort()
        posibleMarcadorVisitante.sort()
        println(posibleMarcadorLocal)
        println(posibleMarcadorVisitante)

        puntosLocal = Random.nextInt(posibleMarcadorLocal[0], posibleMarcadorLocal[1])
        puntosVisitante = Random.nextInt(posibleMarcadorVisitante[0], posibleMarcadorVisitante[1])
    }

}