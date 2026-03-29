package org.example

/**
 * League - Representa una liga de basketball completa
 *
 * Maneja múltiples equipos, genera el calendario de partidos,
 * simula una temporada completa y crea la tabla de posiciones.
 */
class League(val nombre: String) {

    // Lista privada de equipos de la liga
    private val equipos: MutableList<Team> = mutableListOf()

    // Lista privada con todos los partidos de la temporada
    private val calendario: MutableList<Match> = mutableListOf()

    // Versiones públicas de solo lectura
    val listaEquipos: List<Team>
        get() = equipos.toList()

    val calendarioPartidos: List<Match>
        get() = calendario.toList()

    /**
     * agregarEquipos - Añade varios equipos a la liga
     *
     * @param teams lista de equipos a agregar
     */
    fun agregarEquipos(teams: MutableList<Team>) {
        for (team in teams) {
            equipos.add(team)
        }
    }

    /**
     * generarCalendario - Crea todos los partidos de la temporada
     *
     * Hace que cada equipo juegue contra todos los demás.
     * Por ejemplo, si hay 4 equipos, se generan 12 partidos:
     * - A vs B, A vs C, A vs D
     * - B vs A, B vs C, B vs D
     * - C vs A, C vs B, C vs D
     * - D vs A, D vs B, D vs C
     */
    fun generarCalendario() {
        calendario.clear() // Limpiamos el calendario anterior si existe

        // Hacemos que cada equipo juegue contra todos los demás
        for (local in listaEquipos) {
            for (visitante in listaEquipos) {
                // Un equipo no puede jugar contra sí mismo
                if (local != visitante) {
                    calendario.add(Match(local, visitante))
                }
            }
        }
    }

    // Tabla donde guardamos los resultados: [nombre, victorias, derrotas]
    val tablaDePosiciones: MutableList<MutableList<String>> = mutableListOf()

    /**
     * jugarTemporada - Simula todos los partidos de la temporada
     *
     * Juega todos los partidos del calendario y crea la tabla
     * de posiciones ordenada por victorias.
     *
     * @param simulador el MatchSimulator que ejecutará cada partido
     */
    fun jugarTemporada(simulador: MatchSimulator) {
        tablaDePosiciones.clear()

        // Simulamos cada partido del calendario
        for (fecha in 0 until calendarioPartidos.size) {
            println("Partido ${fecha + 1}")
            simulador.simularPartido(calendarioPartidos[fecha])
        }

        // Creamos la tabla con los resultados de cada equipo
        for (equipo in listaEquipos) {
            val resultado: MutableList<String> = mutableListOf(
                equipo.name,
                "${equipo.victorias}",
                "${equipo.derrotas}"
            )
            tablaDePosiciones.add(resultado)
        }

        // Ordenamos por victorias (de mayor a menor)
        tablaDePosiciones.sortByDescending { it[1].toInt() }
    }

    /**
     * mostrarTabla - Muestra la tabla de posiciones en pantalla
     *
     * Imprime una tabla bonita con la posición, nombre del equipo,
     * victorias (V) y derrotas (D) de cada equipo.
     */
    fun mostrarTabla() {
        println("""  
            ═════════════════════════════════════
            ▓        TABLA DE POSICIONES        ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())

        println("═══════════════════════════════════════════════")
        println("|  POS  | EQUIPO                  |  V  |  D  |")

        // Mostramos cada equipo en orden de posición
        for (i in 0 until tablaDePosiciones.size) {
            println("|   ${i + 1}   | ${tablaDePosiciones[i][0]}   | " +
                    "${tablaDePosiciones[i][1]}  | ${tablaDePosiciones[i][2]}  |")
            println("═══════════════════════════════════════════════")
        }
    }
}