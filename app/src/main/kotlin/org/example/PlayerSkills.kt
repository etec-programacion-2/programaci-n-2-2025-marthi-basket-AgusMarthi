package org.example

/**
 * PlayerSkills - Guarda las habilidades de un jugador
 *
 * Usamos "data class" porque nos da funciones automáticas como:
 * - comparar jugadores fácilmente
 * - copiar y modificar habilidades
 * - mostrar info de forma ordenada
 *
 * Cada habilidad va de 50 (mínimo profesional) a 100 (perfecto)
 */
data class PlayerSkills(
    // Usamos "var" para poder mejorar las habilidades con entrenamientos
    var tiro: Int,          // Precisión en tiros lejanos
    var defensa: Int,       // Capacidad defensiva
    var velocidad: Int,     // Rapidez del jugador
    var bloqueo: Int,       // Habilidad para bloquear tiros
    var definicion: Int     // Efectividad cerca del aro
) {
    // Verificamos que todas las habilidades estén entre 50 y 100
    // Si no, el programa muestra un error
    init {
        require(tiro in 50..100) {
            "El valor de tiro debe estar entre 50 y 100, pero se recibió: $tiro"
        }
        require(defensa in 50..100) {
            "El valor de defensa debe estar entre 50 y 100, pero se recibió: $defensa"
        }
        require(velocidad in 50..100) {
            "El valor de velocidad debe estar entre 50 y 100, pero se recibió: $velocidad"
        }
        require(bloqueo in 50..100) {
            "El valor de bloqueo debe estar entre 50 y 100, pero se recibió: $bloqueo"
        }
        require(definicion in 50..100) {
            "El valor de definición debe estar entre 50 y 100, pero se recibió: $definicion"
        }
    }

    // Muestra las habilidades de forma ordenada
    override fun toString(): String {
        return "Habilidades: Tiro = $tiro | Defensa = $defensa | Velocidad = $velocidad | Bloqueo = $bloqueo | Definición = $definicion"
    }
}