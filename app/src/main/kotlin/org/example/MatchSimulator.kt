package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

/**
 * MatchSimulator - Simula partidos de basketball
 *
 * Calcula el resultado de un partido basándose en las habilidades
 * de ambos equipos. El equipo con mejor ataque/defensa tiene más
 * probabilidad de ganar, pero hay algo de azar.
 */
class MatchSimulator {

    /**
     * simularPartido - Ejecuta la simulación de un partido completo
     *
     * CÓMO FUNCIONA:
     * 1. Calcula la fuerza de ataque de cada equipo
     * 2. Determina un rango de puntos posibles para cada uno
     * 3. Genera un resultado aleatorio dentro de esos rangos
     * 4. Actualiza victorias/derrotas
     * 5. Si hay empate, vuelve a simular hasta que haya ganador
     *
     * @param partido el partido a simular
     */
    fun simularPartido(partido: Match) {
        // Calculamos qué tan fuerte es el ataque local vs la defensa visitante
        // Le sumamos 0.05 al local para darle ventaja de localía
        val promedioPuntosLocal = (partido.equipoLocal.promedioAtaque() /
                partido.equipoVisitante.promedioDefensa() + 0.05) * 100
        val ataqueLocal = promedioPuntosLocal.roundToInt()

        // Calculamos qué tan fuerte es el ataque visitante vs la defensa local
        val promedioPuntosVisita = (partido.equipoVisitante.promedioAtaque() /
                partido.equipoLocal.promedioDefensa()) * 100
        val ataqueVisitante = promedioPuntosVisita.roundToInt()

        // Creamos listas para guardar los posibles marcadores
        val posibleMarcadorLocal: MutableList<Int> = mutableListOf()
        val posibleMarcadorVisitante: MutableList<Int> = mutableListOf()

        // Según quién tenga mejor ataque, ajustamos los rangos de puntos posibles
        when {
            // Si el local tiene mejor ataque, tiene más chances de anotar más
            ataqueLocal > ataqueVisitante -> {
                posibleMarcadorLocal.add(ataqueLocal + 10)
                posibleMarcadorLocal.add(ataqueLocal - 20)
                posibleMarcadorVisitante.add(ataqueLocal - 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 10)
            }
            // Si el visitante tiene mejor ataque, tiene más chances de anotar más
            ataqueLocal < ataqueVisitante -> {
                posibleMarcadorVisitante.add(ataqueVisitante + 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 20)
                posibleMarcadorLocal.add(ataqueLocal - 10)
                posibleMarcadorLocal.add(ataqueVisitante - 10)
            }
            // Si están parejos, ambos tienen el mismo rango
            else -> {
                posibleMarcadorVisitante.add(ataqueVisitante + 10)
                posibleMarcadorVisitante.add(ataqueVisitante - 10)
                posibleMarcadorLocal.add(ataqueLocal + 10)
                posibleMarcadorLocal.add(ataqueLocal - 10)
            }
        }

        // Ordenamos las listas para tener [mínimo, máximo]
        posibleMarcadorLocal.sort()
        posibleMarcadorVisitante.sort()

        // Generamos los puntos aleatorios dentro del rango calculado
        val puntosL = Random.nextInt(posibleMarcadorLocal[0], posibleMarcadorLocal[1])
        val puntosV = Random.nextInt(posibleMarcadorVisitante[0], posibleMarcadorVisitante[1])

        // Actualizamos el marcador del partido
        partido.modificarPuntos(puntosL, puntosV)

        // Determinamos el ganador y actualizamos las estadísticas
        val ganador: String
        when {
            // Visitante gana
            puntosL < puntosV -> {
                partido.equipoVisitante.victorias++
                partido.equipoLocal.derrotas++
                ganador = partido.equipoVisitante.name.uppercase()
            }
            // Local gana
            puntosL > puntosV -> {
                partido.equipoVisitante.derrotas++
                partido.equipoLocal.victorias++
                ganador = partido.equipoLocal.name.uppercase()
            }
            // Empate - simulamos de nuevo hasta que haya ganador
            else -> {
                this.simularPartido(partido)
                return
            }
        }

        // Mostramos el resultado final
        println("\n\n${partido.equipoLocal.name} | ${partido.marcadorL}\n" +
                "============================\n" +
                "${partido.equipoVisitante.name} | ${partido.marcadorV}\n\n" +
                "El equipo ganador es: $ganador")
    }

}
