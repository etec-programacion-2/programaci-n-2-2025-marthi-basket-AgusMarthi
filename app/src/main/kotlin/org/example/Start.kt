package org.example

/**
 * Start - Clase principal que maneja toda la interfaz del simulador
 *
 * Es la encargada de mostrar los menús y permitir al usuario
 * interactuar con el juego de forma fácil y ordenada.
 *
 * Contiene todos los menús necesarios para:
 * - Elegir entre simular un partido o una liga completa
 * - Seleccionar la liga donde jugar
 * - Elegir los equipos que van a jugar
 * - Volver a jugar o salir del simulador
 */
class Start(val leagues: List<League>) {

    // Variables que cambian según las decisiones del usuario
    var opcion: String? = null       // Guarda la opción elegida en cada menú
    var liga = League("")            // Liga seleccionada por el usuario
    var equipoL = Team("")           // Equipo local seleccionado
    var equipoV = Team("")           // Equipo visitante seleccionado

    /**
     * leer - Función privada para simplificar la lectura de inputs
     *
     * En lugar de escribir readLine() cada vez, solo llamamos leer()
     */
    private fun leer() {
        opcion = readLine()
    }

    /**
     * menuPrincipal - Pantalla de bienvenida del juego
     *
     * Muestra el logo del simulador en ASCII art y espera
     * que el usuario presione ENTER para comenzar.
     */
    fun menuPrincipal() {
        // Arte ASCII del título del juego
        println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + """    
            ═══════════════════════════════════════════════════════
                ██████╗  █████╗ ███████╗██╗  ██╗███████╗████████╗
                ██╔══██╗██╔══██╗██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝
                ██████╔╝███████║███████╗█████╔╝ █████╗     ██║   
                ██╔══██╗██╔══██║╚════██║██╔═██╗ ██╔══╝     ██║   
                ██████╔╝██║  ██║███████║██║  ██╗███████╗   ██║   
                ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝   ╚═╝   
                
                           S I M U L A D O R   P R O
            ═══════════════════════════════════════════════════════
            
                             🏀 Presiona ENTER 🏀
    
        """.trimIndent())

        // Espera a que el usuario presione ENTER
        leer()
        // Lleva directamente al menú de jugar
        menuJugar()
    }

    /**
     * menuJugar - Menú principal con las opciones del juego
     *
     * Permite elegir entre:
     * 1. Simular un partido individual
     * 2. Simular una liga completa
     * X. Salir del juego
     */
    fun menuJugar() {
        // Muestra las opciones disponibles
        println("""
            ═══════════════════════════════════════════════════════
            |                     MENÚ PRINCIPAL                  |
            ───────────────────────────────────────────────────────
            
              🎮  1  │  Simular Partido Individual
              
              🏆  2  │  Simular Liga Completa
              
              ❌  X  │  Salir del Simulador
            
            ═══════════════════════════════════════════════════════""")
        print("\n>> ")
        leer()

        // Decide qué hacer según la opción elegida
        when {
            // Opción 1: Simular un solo partido
            opcion == "1" -> {
                menuLiga()                                      // Elige la liga
                menuEquipoL()                                   // Elige equipo local
                menuEquipoV()                                   // Elige equipo visitante
                MatchSimulator().simularPartido(Match(equipoL, equipoV))  // Simula el partido

                // Pregunta si quiere jugar de nuevo
                println("  \n ¿JUGAR DE NUEVO? ")
                print("\n (S/N) >> ")
                leer()
                if (opcion.toString().lowercase() == "s") {
                    menuJugar()     // Vuelve al menú principal
                } else {
                    gameOver()      // Termina el juego
                }
            }

            // Opción 2: Simular liga completa
            opcion == "2" -> {
                menuLiga()                          // Elige la liga
                liga.generarCalendario()            // Crea todos los partidos
                liga.jugarTemporada(MatchSimulator())  // Simula todos los partidos
                liga.mostrarTabla()                 // Muestra la tabla final

                // Pregunta si quiere jugar de nuevo
                println("  \n ¿JUGAR DE NUEVO?\n ")
                print("\n (S/N) >> ")
                leer()
                if (opcion.toString().lowercase() == "s") {
                    menuJugar()     // Vuelve al menú principal
                } else {
                    gameOver()      // Termina el juego
                }
            }

            // Opción X: Salir
            opcion.toString().lowercase() == "x" -> {
                gameOver()
            }

            // Si la opción no es válida
            else -> {
                println("\n- Por favor seleccione una opción correcta -\n")
                menuJugar()  // Vuelve a mostrar el menú
            }
        }
    }

    /**
     * menuLiga - Menú para elegir en qué liga jugar
     *
     * Muestra todas las ligas disponibles (NBA, ACB, etc.)
     * y permite al usuario elegir una.
     */
    fun menuLiga() {
        println("""  
            ═════════════════════════════════════
            ▓          ELIGE UNA LIGA           ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())

        val numLigas = leagues.size

        // Muestra todas las ligas disponibles con un número
        for (i in 0 until numLigas) {
            println(" ${i + 1} -  ${leagues[i].nombre.uppercase()}")
        }

        println(" x -  VOLVER")
        print("\n>> ")
        leer()

        // Si elige X, vuelve al menú anterior
        if (opcion.toString().lowercase() == "x") {
            menuJugar()
        }

        // Busca si la opción elegida corresponde a una liga
        for (x in 0 until numLigas) {
            if (opcion == "${x + 1}") {
                liga = leagues[x]
                return
            }
        }

        // Si la opción no es válida, vuelve a mostrar el menú
        println("\n- Por favor seleccione una opción correcta -\n")
        menuLiga()
    }

    /**
     * menuEquipoL - Menú para elegir el equipo LOCAL
     *
     * Muestra todos los equipos de la liga seleccionada
     * con sus promedios ofensivos y defensivos.
     */
    fun menuEquipoL() {
        println("""  
            ═════════════════════════════════════
            ▓       ELIGE EL EQUIPO LOCAL       ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())

        val numEquipos = liga.listaEquipos.size

        // Muestra cada equipo con sus estadísticas
        for (i in 0 until numEquipos) {
            println(" ${i + 1} -  ${liga.listaEquipos[i].name} - " +
                    "Ofensiva: ${liga.listaEquipos[i].promedioAtaque()} - " +
                    "Defensiva: ${liga.listaEquipos[i].promedioDefensa()}")
        }

        println("""
             X -  VOLVER""".trimIndent())
        print("\n>> ")
        leer()

        // Si elige X, vuelve al menú anterior
        if (opcion.toString().lowercase() == "x") {
            menuJugar()
        }

        // Busca si la opción elegida corresponde a un equipo
        for (x in 0 until numEquipos) {
            if (opcion == "${x + 1}") {
                println("\n${liga.listaEquipos[x]}\n")
                equipoL = liga.listaEquipos[x]
                return
            }
        }

        // Si la opción no es válida, vuelve a mostrar el menú
        println("\n- Por favor seleccione una opción correcta -\n")
        menuEquipoL()
    }

    /**
     * menuEquipoV - Menú para elegir el equipo VISITANTE
     *
     * Similar al menuEquipoL, pero verifica que no sea el mismo
     * equipo que el local (un equipo no puede jugar contra sí mismo).
     */
    fun menuEquipoV() {
        println("""  
            ═════════════════════════════════════
            ▓     ELIGE EL EQUIPO VISITANTE     ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())

        val numEquipos = liga.listaEquipos.size

        // Muestra cada equipo con sus estadísticas
        for (i in 0 until numEquipos) {
            println(" ${i + 1} -  ${liga.listaEquipos[i].name} - " +
                    "Ofensiva: ${liga.listaEquipos[i].promedioAtaque()} - " +
                    "Defensiva: ${liga.listaEquipos[i].promedioDefensa()}")
        }

        println(" X -  VOLVER")
        print("\n>> ")
        leer()

        // Busca si la opción elegida corresponde a un equipo
        for (x in 0 until numEquipos) {
            if (opcion == "${x + 1}") {
                // Verifica que no sea el mismo equipo que el local
                if (equipoL != liga.listaEquipos[x]) {
                    println("\n${liga.listaEquipos[x]}\n")
                    equipoV = liga.listaEquipos[x]
                    return
                }
            }
        }

        // Si la opción no es válida, vuelve a mostrar el menú
        println("\n- Por favor seleccione una opción correcta -\n")
        menuEquipoV()
    }

    /**
     * gameOver - Pantalla de despedida del juego
     *
     * Muestra un mensaje de agradecimiento en ASCII art
     * cuando el usuario decide salir del simulador.
     */
    fun gameOver() {
        println("""
    
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓                                                     ▓
            ▓           ██████╗  █████╗ ███╗   ███╗███████╗       ▓
            ▓          ██╔════╝ ██╔══██╗████╗ ████║██╔════╝       ▓
            ▓          ██║  ███╗███████║██╔████╔██║█████╗         ▓
            ▓          ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝         ▓
            ▓          ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗       ▓
            ▓           ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝       ▓
            ▓                                                     ▓
            ▓           ██████╗ ██╗   ██╗███████╗██████╗          ▓
            ▓          ██╔═══██╗██║   ██║██╔════╝██╔══██╗         ▓
            ▓          ██║   ██║██║   ██║█████╗  ██████╔╝         ▓
            ▓          ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗         ▓
            ▓          ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║         ▓
            ▓           ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝         ▓
            ▓                                                     ▓
            ▓               ★ THANKS FOR PLAYING! ★               ▓
            ▓                                                     ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
    
        """)
    }

}
