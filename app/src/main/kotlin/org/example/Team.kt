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

    fun promedioAtaque(equipo: Team): Double{
        val promedio = 0.0
        for (i in 0 until 5){
            var player = equipo.plantilla.get(i)
            var ataque = (player.habilidades.tiro + player.habilidades.definicion)/2
            promedio + ataque
        }
        return promedio/5
    }

    fun promedioDefensa(){

    }

    override fun toString(): String {
        return "$plantilla"
    }
}