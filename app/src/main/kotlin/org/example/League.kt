package org.example

class League (val nombre : String) {
    private val equipos : MutableList<Team> = mutableListOf<Team>()
    private val calendario : MutableList<Match> = mutableListOf<Match>()
    val listaEquipos: List<Team>
        get() = equipos.toList()

    val calendarioPartidos: List<Match>
        get() = calendario.toList()

    fun agregarEquipos(teams: MutableList<Team>){
        for (team in teams){
            equipos.add(team)
        }
    }

    fun generarCalendario(){
        calendario.clear() // Limpiar calendario existente
        for (local in listaEquipos) {
            for (visitante in listaEquipos) {
                if (local != visitante) {
                    calendario.add(Match(local, visitante))
                }
            }
        }
    }

    val tablaDePosiciones : MutableList<MutableList<String>> = mutableListOf()

    fun jugarTemporada(simulador: MatchSimulator) {
        tablaDePosiciones.clear()
        for (fecha in 0 until calendarioPartidos.size) {
            println("Partido ${fecha+1}")
            simulador.simularPartido(calendarioPartidos[fecha])
        }
        for (equipo in listaEquipos) {
            val resultado: MutableList<String> = mutableListOf(equipo.name, "${equipo.victorias}", "${equipo.derrotas}")
            tablaDePosiciones.add(resultado)
        }
        tablaDePosiciones.sortByDescending { it[1].toInt() }
    }
    fun mostrarTabla(){
        println("""  
            ═════════════════════════════════════
            ▓        TABLA DE POSICIONES        ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())
        println("═══════════════════════════════════════════════")
        println("|  POS  | EQUIPO                  |  V  |  D  |")
        for (i in 0 until tablaDePosiciones.size){
            println("|   ${i+1}   | ${tablaDePosiciones[i][0]}   | ${tablaDePosiciones[i][1]}  | ${tablaDePosiciones[i][2]}  |")
            println("═══════════════════════════════════════════════")
        }
    }

}