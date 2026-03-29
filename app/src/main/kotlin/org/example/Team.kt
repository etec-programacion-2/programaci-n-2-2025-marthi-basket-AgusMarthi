package org.example

/**
 * Team - Representa un equipo de basketball
 *
 * Cada equipo tiene un nombre, jugadores (máximo 5) y lleva registro
 * de sus victorias y derrotas durante la temporada.
 */
class Team(val name: String) {

    var victorias = 0    // Cantidad de partidos ganados
    var derrotas = 0     // Cantidad de partidos perdidos

    // Lista privada de jugadores - solo se puede modificar desde esta clase
    private val jugadores: MutableList<Player> = mutableListOf()

    // Lista pública de solo lectura - otros pueden ver pero no modificar
    val plantilla: List<Player>
        get() = jugadores.toList()

    /**
     * seleccJugadores - Agrega varios jugadores al equipo
     *
     * Solo permite hasta 5 jugadores por equipo.
     * Si intentas agregar más, muestra un mensaje de error.
     *
     * players es la lista de jugadores a agregar
     */
    fun seleccJugadores(players: MutableList<Player>) {
        for (player in players) {
            if (jugadores.size < 5) {
                jugadores.add(player)
            } else {
                println("No se puede seleccionar más jugadores. Límite de 5 jugadores alcanzado para $name")
            }
        }
    }

    /**
     * promedioAtaque - Calcula la capacidad ofensiva del equipo
     *
     * Suma el promedio de tiro y definición de cada jugador,
     * luego divide entre 5 para obtener el promedio del equipo.
     *
     * retorna el promedio de ataque del equipo
     */
    fun promedioAtaque(): Double {
        var promedio = 0.0
        for (i in 0 until 5) {
            val player = this.plantilla[i]
            // Ataque = promedio entre tiro y definición
            val ataque = (player.habilidades.tiro + player.habilidades.definicion) / 2
            promedio += ataque
        }
        return promedio / 5
    }

    /**
     * promedioDefensa - Calcula la capacidad defensiva del equipo
     *
     * Suma el promedio de defensa y bloqueo de cada jugador,
     * luego divide entre 5 para obtener el promedio del equipo.
     *
     * retorna el promedio de defensa del equipo
     */
    fun promedioDefensa(): Double {
        var promedio = 0.0
        for (i in 0 until 5) {
            val player = this.plantilla[i]
            // Defensa = promedio entre defensa y bloqueo
            val defensa = (player.habilidades.defensa + player.habilidades.bloqueo) / 2
            promedio += defensa
        }
        return promedio / 5
    }

    /**
     * toString - Muestra toda la información del equipo
     *
     * Incluye el nombre, la lista completa de jugadores,
     * y los promedios ofensivos y defensivos del equipo.
     *
     * retorna un String con info completa del equipo
     */
    override fun toString(): String {
        return "\n ${this.name.uppercase()}\n\nPLANTILLA:\n $plantilla \n" +
                "--------------------------------------------------------------------------------------------------------\n" +
                " | PROMEDIO OFENSIVO: ${this.promedioAtaque()} | PROMEDIO DEFENSIVO: ${this.promedioDefensa()}"
    }
}