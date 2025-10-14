package org.example

import kotlin.math.roundToInt

fun main(){
    val ataqueLocal = 100
    val ataqueVisitante = 100
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
        posibleMarcadorVisitante.add(ataqueVisitante+15)
        posibleMarcadorVisitante.add(ataqueVisitante-15)
        posibleMarcadorLocal.add(ataqueLocal+15)
        posibleMarcadorLocal.add(ataqueLocal-15)
    }
    posibleMarcadorLocal.sort()
    posibleMarcadorVisitante.sort()
    println(posibleMarcadorLocal)
    println(posibleMarcadorVisitante)
}