package org.example

class Team(val name: String) {
    // Colección privada de jugadores
    private val jugadores: MutableList<Player> = mutableListOf()

    // Versión de solo lectura expuesta públicamente
    val plantilla: List<Player>
        get() = jugadores.toList()

    // El val plantilla solo se puede modificar por medio de la private var jugadores
    fun seleccJugador(jugador: Player) {
        if (jugadores.size < 5) {
            jugadores.add(jugador)
            println("${jugador.nombre} fichado correctamente para $name")
        } else {
            println("No se puede seleccionar más jugadores. Límite de 5 jugadores alcanzado para ${name}")
        }
    }

    fun promedioAtaque(): Double{
        var promedio = 0.0
        for (i in 0 until 5){
            val player = this.plantilla.get(i)
            val ataque = (player.habilidades.tiro + player.habilidades.definicion)/2
            promedio += ataque
        }
        return promedio/5
    }

    fun promedioDefensa(): Double{
        var promedio = 0.0
        for (i in 0 until 5){
            val player = this.plantilla.get(i)
            val defensa = (player.habilidades.defensa + player.habilidades.bloqueo)/2
            promedio += defensa
        }
        return promedio/5
    }

    override fun toString(): String {
        return "$plantilla"
    }

    fun equipoSisitante(nombre: String): Team{
        val equipo = Team(nombre)
        equipo.seleccJugador(Player(16, "Pancho", 1.95, PlayerPosition.PIVOT, PlayerSkills(80, 87, 85, 92, 95)))
        equipo.seleccJugador(Player(19, "Checho", 1.80, PlayerPosition.ALA_PIVOT, PlayerSkills(80, 57, 60, 62, 70)))
        equipo.seleccJugador(Player(16, "juanb", 1.95, PlayerPosition.ALERO, PlayerSkills(62, 73, 73, 52, 65)))
        equipo.seleccJugador(Player(15, "rami", 1.80, PlayerPosition.ESCOLTA, PlayerSkills(90, 80, 78, 75, 80)))
        equipo.seleccJugador(Player(16, "yo", 1.80, PlayerPosition.BASE, PlayerSkills(86, 77, 80, 62, 80)))
        return equipo
    }
}