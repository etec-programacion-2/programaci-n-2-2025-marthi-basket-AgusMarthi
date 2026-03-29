package org.example

/**
 * PlayerPosition - Enum class con las 5 posiciones del basketball
 *
 * ¿POR QUÉ USAR ENUM CLASS?
 * Una enum class es más eficiente y segura porque:
 * - Solo puedes usar los valores predefinidos (no puedes poner "ARQUERO" por error)
 * - El compilador te avisa si usas un valor incorrecto
 * - Es más fácil de mantener y modificar
 *
 * Cada posición tiene un número del 1 al 5 para identificarla.
 */
enum class PlayerPosition(val posicion: Int) {
    BASE(1),        // Point Guard - Armador, maneja el balón
    ESCOLTA(2),     // Shooting Guard - Escolta, tira de lejos
    ALERO(3),       // Small Forward - Alero, versátil
    ALA_PIVOT(4),   // Power Forward - Ala-Pívot, fuerza cerca del aro
    PIVOT(5)        // Center - Pívot, más alto, juega bajo el tablero
}