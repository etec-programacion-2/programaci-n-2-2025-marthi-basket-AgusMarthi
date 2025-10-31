package org.example

class League (val nombre : String) {
    private val equipos : MutableList<Team> = mutableListOf<Team>()
    private val calendario : MutableList<Match> = mutableListOf<Match>()
    val listaEquipos: List<Team>
        get() = equipos.toList()

    val calendarioPartidos: List<Match>
        get() = calendario.toList()

    fun generarCalendario(){
        for (local in 0 until listaEquipos.size){
            for (visitante in 0 until listaEquipos.size){
                if (local != visitante){
                    calendario.add(Match(listaEquipos[local], listaEquipos[visitante]))
                }
            }
        }
    }

    fun simularTemporada(){
        val tablaDePosiciones : MutableList<MutableList<String>> = mutableListOf()
        for (fecha in 0 until calendarioPartidos.size){
            val partido = calendarioPartidos[fecha]
            println(" $partido \n ${partido.simularPartido()}")

        }
    }

    fun generarTablaDePosiciones(){

    }

}