package org.example

class Start (val leagues : List<League>){

    var opcion : String? = null
    var liga = League("")
    var equipoL = Team("")
    var equipoV = Team("")

    private fun leer(){ opcion=readLine() }

    fun menuPrincipal(){
        println("""
    
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
        leer()

        menuJugar()

    }
    fun menuJugar(){
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

        when {
            opcion == "1" ->{
                menuLiga()
                menuEquipoL()
                menuEquipoV()
                MatchSimulator().simularPartido(Match(equipoL,equipoV))
                println("  \n ¿JUGAR DE NUEVO?\n ")
                print("\n (S/N) >> ")
                leer()
                if (opcion.toString().lowercase() == "s"){
                    menuJugar()
                }
                else gameOver()
            }
            opcion == "2" ->{
                menuLiga()
                liga.generarCalendario()
                liga.jugarTemporada(MatchSimulator())
                liga.mostrarTabla()
                println("  \n ¿JUGAR DE NUEVO?\n ")
                print("\n (S/N) >> ")
                leer()
                if (opcion.toString().lowercase() == "s"){
                    menuJugar()
                }
                else gameOver()
            }
            opcion.toString().lowercase() == "x" ->{
                gameOver()
            }
            else -> {
                println("\n- Por favor seleccione una opción correcta -\n")
                menuJugar()
            }
        }
    }


    fun menuLiga(){
        println("  SELECCIONA UNA LIGA\n ---------------------\n")
        val numLigas = leagues.size

        for (i in 0 until numLigas){
            println(" ${i + 1}. ${leagues[i].nombre.uppercase()}")
        }

        println(" x -  VOLVER")
        print("\n>> ")
        leer()

        if (opcion.toString().lowercase() == "x"){
            menuJugar()
        }

        for (x in 0 until numLigas){
            if (opcion == "${x+1}"){
                liga = leagues[x]
                return
            }
        }
        println("\n- Por favor seleccione una opción correcta -\n")
        menuLiga()

    }


    fun menuEquipoL() {
        println("""  
            ═════════════════════════════════════
            ▓       ELIGE EL EQUIPO LOCAL       ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())
        val numEquipos = liga.listaEquipos.size

        for (i in 0 until numEquipos) {
            println(" ${i + 1} -  ${liga.listaEquipos[i].name} - Ofensiva: ${liga.listaEquipos[i].promedioAtaque()} - Defensiva: ${liga.listaEquipos[i].promedioDefensa()}")
        }

        println(" X -  VOLVER")
        print("\n>> ")
        leer()

        if (opcion.toString().lowercase() == "x") {
            menuJugar()
        }

        for (x in 0 until numEquipos) {
            if (opcion == "${x + 1}") {
                println("\n${liga.listaEquipos[x]}\n")
                equipoL = liga.listaEquipos[x]
                return
            }
        }
        println("\n- Por favor seleccione una opción correcta -\n")
        menuEquipoL()
    }

    fun menuEquipoV(){
        println("""  
            ═════════════════════════════════════
            ▓     ELIGE EL EQUIPO VISITANTE     ▓                                          
            ═════════════════════════════════════
            
            
        """.trimMargin())
        val numEquipos = liga.listaEquipos.size

        for (i in 0 until numEquipos){
            println(" ${i + 1} -  ${liga.listaEquipos[i].name} - Ofensiva: ${liga.listaEquipos[i].promedioAtaque()} - Defensiva: ${liga.listaEquipos[i].promedioDefensa()}")
        }

        println(" X -  VOLVER")
        print("\n>> ")
        leer()

        for (x in 0 until numEquipos){
            if (opcion == "${x+1}"){

                if (equipoL != liga.listaEquipos[x]) {
                    println("\n${liga.listaEquipos[x]}\n")
                    equipoV = liga.listaEquipos[x]
                    return
                }
            }
        }
        println("\n- Por favor seleccione una opción correcta -\n")
        menuEquipoV()
    }
    fun gameOver(){
        println("""
    
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓                                                     ▓
            ▓          ██████╗  █████╗ ███╗   ███╗███████╗        ▓
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
            ▓                ★ THANKS FOR PLAYING! ★              ▓
            ▓                                                     ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
    
                """)
    }
}

