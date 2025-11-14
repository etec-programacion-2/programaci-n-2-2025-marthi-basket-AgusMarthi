package org.example

import kotlin.random.Random

/**
 * Player - Representa a un jugador de basketball
 *
 * Guarda toda la información del jugador: datos personales, posición y habilidades.
 * Esto se llama "composición" porque Player "tiene una" posición y "tiene unas" habilidades.
 */
class Player(
    val edad: Int,                      // Edad del jugador
    val nombre: String,                 // Nombre del jugador
    val altura: Double,                 // Altura en metros
    val posicion: PlayerPosition,       // Posición en la cancha (BASE, ESCOLTA, etc.)
    val habilidades: PlayerSkills       // Las 5 habilidades del jugador
) {
    /**
     * entrenar - Mejora una habilidad específica del jugador
     *
     * Simula un entrenamiento donde el jugador mejora entre 1 y 5 puntos
     * en la habilidad elegida. El máximo es 100.
     *
     * habilidad es el nombre de la habilidad a entrenar ("tiro", "defensa", etc.)
     */
    fun entrenar(habilidad: String) {
        // Genera un número aleatorio entre 1 y 5 para la mejora
        val mejora = Random.nextInt(1, 6)

        println("$nombre entrena $habilidad y mejora $mejora puntos")
        println("Habilidades antes de la mejora: $habilidades")

        // Según la habilidad elegida, la mejoramos sin pasar de 100
        when(habilidad.lowercase()) {
            "tiro" -> habilidades.tiro = minOf(habilidades.tiro + mejora, 100)
            "defensa" -> habilidades.defensa = minOf(habilidades.defensa + mejora, 100)
            "velocidad" -> habilidades.velocidad = minOf(habilidades.velocidad + mejora, 100)
            "bloqueo" -> habilidades.bloqueo = minOf(habilidades.bloqueo + mejora, 100)
            "definicion" -> habilidades.definicion = minOf(habilidades.definicion + mejora, 100)
            else -> println("Habilidad '$habilidad' no reconocida")
        }

        println("Habilidades después de la mejora: $habilidades")
    }

    /**
     * toString - Muestra la información completa del jugador
     *
     * Calcula el promedio de todas las habilidades y muestra
     * todos los datos del jugador de forma ordenada.
     *
     * @return String con toda la info del jugador
     */
    override fun toString(): String {
        // Calculamos el promedio de las 5 habilidades
        val promedio = (habilidades.definicion + habilidades.tiro +
                habilidades.defensa + habilidades.velocidad +
                habilidades.bloqueo) / 5

        return "-- Nombre = $nombre | Edad = $edad | Altura = $altura | Posición = $posicion\n${habilidades.toString()} | Promedio = $promedio \n"
    }
}