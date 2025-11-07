package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

class Match (
    val equipoLocal: Team,
    val equipoVisitante: Team
) {
    private var puntosLocal : Int = 0
    private var puntosVisitante : Int = 0

    val marcadorL: Int
        get() = puntosLocal

    val marcadorV: Int
        get() = puntosVisitante

    override fun toString(): String {
        return ("${equipoLocal.name} vs ${equipoVisitante.name}")
    }
    fun modificarPuntos(pl: Int, pv: Int){
        puntosLocal = pl
        puntosVisitante = pv
    }
}