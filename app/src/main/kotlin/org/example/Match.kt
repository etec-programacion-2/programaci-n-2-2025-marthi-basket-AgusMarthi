package org.example

/**
 * Match - Representa un partido entre dos equipos
 *
 * Guarda qué equipos juegan (local y visitante) y el marcador del partido.
 * El marcador se modifica cuando se simula el partido.
 */
class Match(
    val equipoLocal: Team,       // Equipo que juega de local
    val equipoVisitante: Team    // Equipo que juega de visitante
) {
    // Los puntos son privados para que solo se modifiquen desde esta clase
    private var puntosLocal: Int = 0
    private var puntosVisitante: Int = 0

    // Propiedades públicas de solo lectura para ver los puntos
    val marcadorL: Int
        get() = puntosLocal

    val marcadorV: Int
        get() = puntosVisitante

    /**
     * toString - Muestra qué equipos juegan
     *
     * retorna String con formato "Equipo A vs Equipo B"
     */
    override fun toString(): String {
        return "${equipoLocal.name} vs ${equipoVisitante.name}"
    }

    /**
     * modificarPuntos - Cambia el marcador del partido
     *
     * Esta función es usada por MatchSimulator para establecer
     * el resultado final después de simular el partido.
     *
     * pl son los puntos del equipo local
     * pv son los puntos del equipo visitante
     */
    fun modificarPuntos(pl: Int, pv: Int) {
        puntosLocal = pl
        puntosVisitante = pv
    }
}