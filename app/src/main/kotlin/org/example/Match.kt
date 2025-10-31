package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

class Match (
    val equipoLocal: Team,
    val equipoVisitante: Team
) {
    private var puntosLocal : Int = 0
    private var puntosVisitante : Int = 0

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

        puntosLocal = Random.nextInt(posibleMarcadorLocal[0], posibleMarcadorLocal[1])
        puntosVisitante = Random.nextInt(posibleMarcadorVisitante[0], posibleMarcadorVisitante[1])
        if (puntosLocal == puntosVisitante){
            this.simularPartido()
        }
        println("${equipoLocal.name} $marcadorL-$marcadorV ${equipoVisitante.name}")
    }

    override fun toString(): String {
        return ("${equipoLocal.name} vs ${equipoVisitante.name}")
    }

    /**
    val lakers = Team("Lakers")
    lakers.seleccJugador(Player(25, "LeBron", 2.06, PlayerPosition.ALERO, PlayerSkills(85, 75, 80, 70, 90)))
    lakers.seleccJugador(Player(30, "Anthony", 2.08, PlayerPosition.PIVOT, PlayerSkills(70, 85, 65, 90, 75)))
    lakers.seleccJugador(Player(22, "Austin", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(88, 72, 85, 65, 80)))
    lakers.seleccJugador(Player(26, "Rui", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 80, 75, 82, 77)))
    lakers.seleccJugador(Player(27, "D'Angelo", 1.85, PlayerPosition.BASE, PlayerSkills(90, 68, 82, 60, 85)))

    val bulls = Team("Bulls")
    bulls.seleccJugador(Player(16, "Pancho", 1.95, PlayerPosition.PIVOT, PlayerSkills(80, 87, 85, 92, 95)))
    bulls.seleccJugador(Player(19, "Checho", 1.80, PlayerPosition.ALA_PIVOT, PlayerSkills(80, 57, 60, 62, 70)))
    bulls.seleccJugador(Player(16, "Juanb", 1.95, PlayerPosition.ALERO, PlayerSkills(62, 73, 73, 52, 65)))
    bulls.seleccJugador(Player(15, "Rami", 1.80, PlayerPosition.ESCOLTA, PlayerSkills(90, 80, 78, 75, 80)))
    bulls.seleccJugador(Player(16, "Yo", 1.80, PlayerPosition.BASE, PlayerSkills(86, 77, 80, 62, 80)))

    val partido = Match(lakers, bulls)
    partido.simularPartido()

    */

}