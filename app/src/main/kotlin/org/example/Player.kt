package org.example
// Creo la clase Player con varias variables de tipo val como parámetros,
// y entre ellas se encuentran la enum class PlayerPosition y la data class PlayerSkills,
// demostrando composición donde Player "tiene-una" posición y "tiene-unas" habilidades
import kotlin.random.Random
class Player(
    val edad : Int,
    val nombre : String,
    val altura : Double,
    val posicion : PlayerPosition,
    val habilidades : PlayerSkills
) {
    fun entrenar(habilidad: String){
        val mejora = Random.nextInt(1, 6)
        println("$nombre entrena $habilidad () y mejora $mejora puntos")
        println("Habilidades antes de la mejora: $habilidades")
        when(habilidad.lowercase()) {
            "tiro" -> habilidades.tiro = minOf(habilidades.tiro + mejora, 100)
            "defensa" -> habilidades.defensa = minOf(habilidades.defensa + mejora, 100)
            "velocidad" -> habilidades.velocidad = minOf(habilidades.velocidad + mejora, 100)
            "bloqueo" -> habilidades.bloqueo = minOf(habilidades.bloqueo + mejora, 100)
            "definicion" -> habilidades.definicion = minOf(habilidades.definicion + mejora, 100)
            else -> println("Habilidad '$habilidad' no reconocida")
        }
        println("Habilidades despues de la mejora: $habilidades")
    }
    override fun toString(): String {
        val promedio = (habilidades.definicion + habilidades.tiro + habilidades.defensa + habilidades.velocidad + habilidades.bloqueo)/5
        return "\n-- Nombre = $nombre | Edad = $edad | Altura = $altura | Posición = $posicion\n${habilidades.toString()} | Promedio = $promedio"
    }
}