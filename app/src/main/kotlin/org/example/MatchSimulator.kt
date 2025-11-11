package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

class MatchSimulator{

    fun simularPartido(partido: Match){
        val promedioPuntosLocal = (partido.equipoLocal.promedioAtaque()/partido.equipoVisitante.promedioDefensa() + 0.05) * 100
        val ataqueLocal = promedioPuntosLocal.roundToInt()
        val promedioPuntosVisita = (partido.equipoVisitante.promedioAtaque()/partido.equipoLocal.promedioDefensa()) * 100
        val ataqueVisitante = promedioPuntosVisita.roundToInt()
        val posibleMarcadorLocal : MutableList<Int> = mutableListOf()
        val posibleMarcadorVisitante : MutableList<Int> = mutableListOf()
        var ganador = ""
        when {
            ataqueLocal > ataqueVisitante -> {
                posibleMarcadorLocal.add(ataqueLocal + 10)
                posibleMarcadorLocal.add(ataqueLocal - 20)
                posibleMarcadorVisitante.add(ataqueLocal - 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 10)
            }
            ataqueLocal < ataqueVisitante -> {
                posibleMarcadorVisitante.add(ataqueVisitante + 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 20)
                posibleMarcadorLocal.add(ataqueLocal - 10)
                posibleMarcadorLocal.add(ataqueVisitante - 10)
            }
            else -> {
                posibleMarcadorVisitante.add(ataqueVisitante + 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 10)
                posibleMarcadorLocal.add(ataqueLocal + 10)
                posibleMarcadorLocal.add(ataqueLocal - 10)
            }
        }
        posibleMarcadorLocal.sort()
        posibleMarcadorVisitante.sort()

        val puntosL = Random.nextInt(posibleMarcadorLocal[0], posibleMarcadorLocal[1])
        val puntosV = Random.nextInt(posibleMarcadorVisitante[0], posibleMarcadorVisitante[1])

        partido.modificarPuntos(puntosL, puntosV)

        when {
            puntosL < puntosV -> {
                partido.equipoVisitante.victorias++
                partido.equipoLocal.derrotas++
                ganador = partido.equipoVisitante.name.uppercase()
            }
            puntosL > puntosV -> {
                partido.equipoVisitante.derrotas++
                partido.equipoLocal.victorias++
                ganador = partido.equipoLocal.name.uppercase()
            }
            else -> {
                this.simularPartido(partido)
                return
            }

        }
        println("${partido.equipoLocal.name} | ${partido.marcadorL}\n============================\n${partido.equipoVisitante.name} | ${partido.marcadorV} \n\n El equipo ganador es: $ganador")
    }
}