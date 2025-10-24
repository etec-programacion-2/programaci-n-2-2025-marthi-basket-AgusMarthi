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

}