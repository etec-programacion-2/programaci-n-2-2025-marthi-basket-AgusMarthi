package org.example

class League (val nombre : String) {
    private val equipos : MutableList<Team> = mutableListOf<Team>()
    private val calendario : MutableList<Match> = mutableListOf<Match>()
    val listaEquipos: List<Team>
        get() = equipos.toList()

    val calendarioPartidos: List<Match>
        get() = calendario.toList()

    fun generarCalendario(){
        for (local in 0 until calendarioPartidos.size){
            for (visitante in 0 until calendarioPartidos.size){
                if (local != visitante){

                }
            }
        }
    }

}