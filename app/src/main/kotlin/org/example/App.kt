package org.example

fun main() {
    // ============================================
    // LOS ANGELES LAKERS
    // ============================================
    val lebron = Player(39, "LeBron James", 2.06, PlayerPosition.ALERO, PlayerSkills(89, 78, 82, 75, 92))
    val anthony = Player(31, "Anthony Davis", 2.08, PlayerPosition.PIVOT, PlayerSkills(78, 88, 70, 92, 85))
    val austin = Player(25, "Austin Reaves", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(82, 72, 80, 65, 84))
    val dangelo = Player(28, "D'Angelo Russell", 1.93, PlayerPosition.BASE, PlayerSkills(85, 68, 78, 62, 83))
    val rui = Player(26, "Rui Hachimura", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 74, 75, 72, 78))

    val lakers = Team("Los Angeles Lakers   ")
    lakers.seleccJugadores(mutableListOf(lebron, anthony, austin, dangelo, rui))

    // ============================================
    // GOLDEN STATE WARRIORS
    // ============================================
    val steph = Player(36, "Stephen Curry", 1.88, PlayerPosition.BASE, PlayerSkills(97, 65, 85, 55, 95))
    val klay = Player(34, "Klay Thompson", 1.98, PlayerPosition.ESCOLTA, PlayerSkills(86, 70, 76, 68, 88))
    val draymond = Player(34, "Draymond Green", 1.98, PlayerPosition.ALA_PIVOT, PlayerSkills(65, 87, 72, 85, 74))
    val wiggins = Player(29, "Andrew Wiggins", 2.01, PlayerPosition.ALERO, PlayerSkills(78, 74, 80, 72, 79))
    val kuminga = Player(21, "Jonathan Kuminga", 2.01, PlayerPosition.PIVOT, PlayerSkills(75, 70, 82, 74, 76))

    val warriors = Team("Golden State Warriors")
    warriors.seleccJugadores(mutableListOf(steph, klay, draymond, wiggins, kuminga))

    // ============================================
    // BOSTON CELTICS
    // ============================================
    val jayson = Player(26, "Jayson Tatum", 2.03, PlayerPosition.ALERO, PlayerSkills(90, 75, 80, 74, 89))
    val jaylen = Player(27, "Jaylen Brown", 1.98, PlayerPosition.ESCOLTA, PlayerSkills(86, 76, 84, 72, 87))
    val kristaps = Player(28, "Kristaps Porzingis", 2.21, PlayerPosition.PIVOT, PlayerSkills(84, 74, 70, 86, 82))
    val jrue = Player(34, "Jrue Holiday", 1.93, PlayerPosition.BASE, PlayerSkills(76, 85, 78, 70, 80))
    val white = Player(28, "Derrick White", 1.93, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 79, 76, 72, 81))

    val celtics = Team("Boston Celtics       ")
    celtics.seleccJugadores(mutableListOf(jayson, jaylen, kristaps, jrue, white))

    // ============================================
    // DENVER NUGGETS
    // ============================================
    val jokic = Player(29, "Nikola Jokic", 2.11, PlayerPosition.PIVOT, PlayerSkills(88, 82, 68, 85, 94))
    val jamal = Player(27, "Jamal Murray", 1.93, PlayerPosition.BASE, PlayerSkills(87, 70, 80, 65, 86))
    val mpj = Player(25, "Michael Porter Jr.", 2.08, PlayerPosition.ALERO, PlayerSkills(86, 72, 75, 70, 84))
    val gordon = Player(28, "Aaron Gordon", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(74, 78, 76, 80, 77))
    val kcp = Player(31, "Kentavious Caldwell-Pope", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(76, 82, 78, 72, 79))

    val nuggets = Team("Denver Nuggets       ")
    nuggets.seleccJugadores(mutableListOf(jokic, jamal, mpj, gordon, kcp))

    // ============================================
    // PHOENIX SUNS
    // ============================================
    val kevin = Player(35, "Kevin Durant", 2.08, PlayerPosition.ALERO, PlayerSkills(92, 74, 78, 82, 91))
    val devin = Player(27, "Devin Booker", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(90, 68, 82, 65, 89))
    val bradley = Player(32, "Bradley Beal", 1.93, PlayerPosition.BASE, PlayerSkills(85, 66, 84, 62, 83))
    val jusuf = Player(33, "Jusuf Nurkic", 2.11, PlayerPosition.PIVOT, PlayerSkills(70, 80, 65, 82, 74))
    val grayson = Player(29, "Grayson Allen", 1.93, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 72, 76, 68, 80))

    val suns = Team("Phoenix Suns         ")
    suns.seleccJugadores(mutableListOf(kevin, devin, bradley, jusuf, grayson))

    // ============================================
    // MILWAUKEE BUCKS
    // ============================================
    val giannis = Player(29, "Giannis Antetokounmpo", 2.11, PlayerPosition.ALA_PIVOT, PlayerSkills(86, 84, 82, 88, 89))
    val dame = Player(34, "Damian Lillard", 1.88, PlayerPosition.BASE, PlayerSkills(91, 65, 82, 60, 90))
    val khris = Player(33, "Khris Middleton", 2.01, PlayerPosition.ALERO, PlayerSkills(82, 74, 76, 72, 83))
    val brook = Player(35, "Brook Lopez", 2.13, PlayerPosition.PIVOT, PlayerSkills(74, 78, 60, 88, 76))
    val malik = Player(27, "Malik Beasley", 1.93, PlayerPosition.ESCOLTA, PlayerSkills(80, 66, 78, 64, 79))

    val bucks = Team("Milwaukee Bucks      ")
    bucks.seleccJugadores(mutableListOf(giannis, dame, khris, brook, malik))

    // ============================================
    // PHILADELPHIA 76ERS
    // ============================================
    val joel = Player(30, "Joel Embiid", 2.13, PlayerPosition.PIVOT, PlayerSkills(90, 78, 70, 86, 89))
    val tyrese = Player(24, "Tyrese Maxey", 1.88, PlayerPosition.BASE, PlayerSkills(86, 68, 88, 62, 84))
    val tobias = Player(31, "Tobias Harris", 2.03, PlayerPosition.ALERO, PlayerSkills(78, 74, 76, 72, 79))
    val kelly = Player(32, "Kelly Oubre Jr.", 2.01, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 70, 80, 68, 77))
    val demar = Player(34, "De'Anthony Melton", 1.88, PlayerPosition.ESCOLTA, PlayerSkills(74, 76, 78, 70, 76))

    val sixers = Team("Philadelphia 76ers   ")
    sixers.seleccJugadores(mutableListOf(joel, tyrese, tobias, kelly, demar))

    // ============================================
    // DALLAS MAVERICKS
    // ============================================
    val luka = Player(25, "Luka Doncic", 2.01, PlayerPosition.BASE, PlayerSkills(92, 72, 80, 70, 91))
    val kyrie = Player(32, "Kyrie Irving", 1.88, PlayerPosition.ESCOLTA, PlayerSkills(89, 66, 84, 62, 88))
    val derrick = Player(25, "Derrick Jones Jr.", 1.98, PlayerPosition.ALERO, PlayerSkills(72, 74, 82, 76, 74))
    val pj = Player(29, "P.J. Washington", 2.01, PlayerPosition.ALA_PIVOT, PlayerSkills(74, 72, 75, 74, 75))
    val derek = Player(26, "Dereck Lively II", 2.16, PlayerPosition.PIVOT, PlayerSkills(68, 76, 70, 82, 70))

    val mavericks = Team("Dallas Mavericks     ")
    mavericks.seleccJugadores(mutableListOf(luka, kyrie, derrick, pj, derek))

    // ============================================
    // MIAMI HEAT
    // ============================================
    val jimmy = Player(34, "Jimmy Butler", 2.01, PlayerPosition.ALERO, PlayerSkills(84, 82, 80, 76, 85))
    val bam = Player(26, "Bam Adebayo", 2.06, PlayerPosition.PIVOT, PlayerSkills(76, 84, 75, 85, 80))
    val tyler = Player(24, "Tyler Herro", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(85, 66, 78, 62, 83))
    val terry = Player(35, "Terry Rozier", 1.85, PlayerPosition.BASE, PlayerSkills(82, 70, 80, 65, 81))
    val haywood = Player(24, "Haywood Highsmith", 1.93, PlayerPosition.ALA_PIVOT, PlayerSkills(70, 76, 75, 74, 72))

    val heat = Team("Miami Heat           ")
    heat.seleccJugadores(mutableListOf(jimmy, bam, tyler, terry, haywood))

    // ============================================
    // LOS ANGELES CLIPPERS
    // ============================================
    val kawhi = Player(32, "Kawhi Leonard", 2.01, PlayerPosition.ALERO, PlayerSkills(88, 85, 78, 80, 89))
    val paul = Player(33, "Paul George", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(86, 80, 78, 76, 87))
    val james = Player(35, "James Harden", 1.96, PlayerPosition.BASE, PlayerSkills(87, 68, 78, 65, 86))
    val russell = Player(35, "Russell Westbrook", 1.91, PlayerPosition.ESCOLTA, PlayerSkills(78, 72, 88, 70, 80))
    val ivica = Player(31, "Ivica Zubac", 2.13, PlayerPosition.PIVOT, PlayerSkills(72, 76, 65, 82, 74))

    val clippers = Team("Los Angeles Clippers ")
    clippers.seleccJugadores(mutableListOf(kawhi, paul, james, russell, ivica))

    // ============================================
    // CLEVELAND CAVALIERS
    // ============================================
    val darius = Player(27, "Darius Garland", 1.85, PlayerPosition.BASE, PlayerSkills(85, 66, 82, 60, 84))
    val donovan = Player(28, "Donovan Mitchell", 1.85, PlayerPosition.ESCOLTA, PlayerSkills(88, 70, 86, 68, 87))
    val evan = Player(26, "Evan Mobley", 2.11, PlayerPosition.PIVOT, PlayerSkills(74, 80, 75, 84, 77))
    val jarrett = Player(26, "Jarrett Allen", 2.06, PlayerPosition.ALA_PIVOT, PlayerSkills(72, 78, 70, 85, 75))
    val max = Player(22, "Max Strus", 1.96, PlayerPosition.ALERO, PlayerSkills(78, 70, 76, 68, 79))

    val cavaliers = Team("Cleveland Cavaliers  ")
    cavaliers.seleccJugadores(mutableListOf(darius, donovan, evan, jarrett, max))

    // ============================================
    // NEW YORK KNICKS
    // ============================================
    val jalen = Player(24, "Jalen Brunson", 1.88, PlayerPosition.BASE, PlayerSkills(87, 70, 82, 65, 86))
    val julius = Player(29, "Julius Randle", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(82, 74, 76, 75, 83))
    val rj = Player(24, "RJ Barrett", 1.98, PlayerPosition.ALERO, PlayerSkills(78, 72, 78, 70, 79))
    val mitchell = Player(26, "Mitchell Robinson", 2.13, PlayerPosition.PIVOT, PlayerSkills(68, 78, 70, 86, 72))
    val donte = Player(27, "Donte DiVincenzo", 1.93, PlayerPosition.ESCOLTA, PlayerSkills(76, 74, 78, 70, 78))

    val knicks = Team("New York Knicks      ")
    knicks.seleccJugadores(mutableListOf(jalen, julius, rj, mitchell, donte))

    // ============================================
    // NBA
    // ============================================
    val nba = League("NBA 2024")
    nba.agregarEquipos(mutableListOf(lakers, warriors, celtics, nuggets, suns, bucks, sixers, mavericks, heat, clippers, cavaliers, knicks))

    // ============================================
    // REAL MADRID
    // ============================================
    val campazzo = Player(32, "Facundo Campazzo", 1.81, PlayerPosition.BASE, PlayerSkills(85, 78, 88, 65, 87))
    val causeur = Player(36, "Fabien Causeur", 1.95, PlayerPosition.ESCOLTA, PlayerSkills(82, 74, 76, 68, 80))
    val muse = Player(24, "Dzanan Musa", 2.06, PlayerPosition.ALERO, PlayerSkills(86, 72, 78, 70, 84))
    val poirier = Player(30, "Vincent Poirier", 2.13, PlayerPosition.PIVOT, PlayerSkills(74, 82, 70, 85, 76))
    val tavares = Player(31, "Walter Tavares", 2.21, PlayerPosition.PIVOT, PlayerSkills(70, 88, 65, 92, 75))

    val realMadrid = Team("Real Madrid          ")
    realMadrid.seleccJugadores(mutableListOf(campazzo, causeur, muse, poirier, tavares))

    // ============================================
    // FC BARCELONA
    // ============================================
    val laprovittola = Player(34, "Nicolás Laprovíttola", 1.90, PlayerPosition.BASE, PlayerSkills(86, 72, 80, 65, 84))
    val abrines = Player(30, "Álex Abrines", 1.98, PlayerPosition.ESCOLTA, PlayerSkills(84, 75, 78, 70, 82))
    val kalinic = Player(32, "Nikola Kalinić", 2.03, PlayerPosition.ALERO, PlayerSkills(78, 76, 74, 72, 79))
    val vesely = Player(34, "Jan Veselý", 2.13, PlayerPosition.PIVOT, PlayerSkills(76, 78, 72, 80, 77))
    val satoransky = Player(32, "Tomáš Satoranský", 2.01, PlayerPosition.ALA_PIVOT, PlayerSkills(80, 74, 76, 70, 78))

    val barcelona = Team("FC Barcelona         ")
    barcelona.seleccJugadores(mutableListOf(laprovittola, abrines, kalinic, vesely, satoransky))

    // ============================================
    // BASKONIA
    // ============================================
    val howard = Player(29, "Marcus Howard", 1.80, PlayerPosition.BASE, PlayerSkills(88, 68, 85, 60, 86))
    val marinkovic = Player(26, "Vanja Marinković", 1.98, PlayerPosition.ESCOLTA, PlayerSkills(85, 70, 76, 65, 83))
    val raad = Player(22, "Khalifa Diop", 2.11, PlayerPosition.PIVOT, PlayerSkills(72, 78, 70, 82, 74))
    val mille = Player(24, "Matt Costello", 2.08, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 74, 72, 76, 77))
    val daniel = Player(25, "Daniel Diez", 2.03, PlayerPosition.ALERO, PlayerSkills(75, 72, 74, 70, 76))

    val baskonia = Team("Baskonia             ")
    baskonia.seleccJugadores(mutableListOf(howard, marinkovic, daniel, mille, raad))

    // ============================================
    // VALENCIA BASKET
    // ============================================
    val jones = Player(26, "Chris Jones", 1.88, PlayerPosition.BASE, PlayerSkills(82, 76, 80, 68, 81))
    val rivero = Player(30, "Jasiel Rivero", 2.06, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 74, 76, 75, 79))
    val lopez = Player(28, "Josep Puerto", 1.98, PlayerPosition.ALERO, PlayerSkills(76, 72, 74, 70, 77))
    val davies = Player(32, "Brandon Davies", 2.08, PlayerPosition.PIVOT, PlayerSkills(74, 78, 72, 80, 76))
    val neville = Player(29, "Jared Harper", 1.80, PlayerPosition.ESCOLTA, PlayerSkills(84, 68, 82, 62, 83))

    val valencia = Team("Valencia Basket      ")
    valencia.seleccJugadores(mutableListOf(jones, rivero, lopez, davies, neville))


    // ============================================
    // UNICAJA MÁLAGA
    // ============================================
    val perry = Player(27, "Kendrick Perry", 1.83, PlayerPosition.BASE, PlayerSkills(84, 70, 80, 65, 82))
    val brizuela = Player(30, "Darío Brizuela", 1.88, PlayerPosition.ESCOLTA, PlayerSkills(83, 68, 78, 62, 81))
    val tyson = Player(26, "Tyson Carter", 1.93, PlayerPosition.ALERO, PlayerSkills(80, 70, 75, 68, 79))
    val osetkowski = Player(26, "Dylan Osetkowski", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 76, 74, 74, 77))
    val will = Player(33, "Will Thomas", 2.03, PlayerPosition.PIVOT, PlayerSkills(72, 78, 70, 80, 75))

    val unica = Team("Unicaja Málaga       ")
    unica.seleccJugadores(mutableListOf(perry, brizuela, tyson, osetkowski, will))

    // ============================================
    // LENOVO TENERIFE
    // ============================================
    val huertas = Player(41, "Marcelo Huertas", 1.91, PlayerPosition.BASE, PlayerSkills(82, 74, 85, 65, 84))
    val fitipaldo = Player(33, "Bruno Fitipaldo", 1.83, PlayerPosition.ESCOLTA, PlayerSkills(80, 70, 78, 62, 80))
    val doornekamp = Player(38, "Aaron Doornekamp", 2.01, PlayerPosition.ALERO, PlayerSkills(76, 74, 72, 70, 78))
    val sherma = Player(35, "Gio Shermadini", 2.13, PlayerPosition.PIVOT, PlayerSkills(74, 82, 70, 85, 77))
    val salin = Player(33, "Sasu Salin", 1.91, PlayerPosition.ALA_PIVOT, PlayerSkills(79, 68, 76, 65, 79))

    val tenerife = Team("Lenovo Tenerife      ")
    tenerife.seleccJugadores(mutableListOf(huertas, fitipaldo, doornekamp, sherma, salin))

    // ============================================
    // GRAN CANARIA
    // ============================================
    val ferran = Player(25, "Ferran Bassas", 1.83, PlayerPosition.BASE, PlayerSkills(80, 68, 78, 62, 79))
    val albicy = Player(34, "Andrew Albicy", 1.78, PlayerPosition.ESCOLTA, PlayerSkills(78, 74, 76, 70, 78))
    val shurna = Player(34, "John Shurna", 2.03, PlayerPosition.ALERO, PlayerSkills(76, 72, 74, 68, 77))
    val balcerowski = Player(24, "Aleksander Balcerowski", 2.15, PlayerPosition.PIVOT, PlayerSkills(74, 78, 70, 82, 75))
    val slaught = Player(36, "AJ Slaughter", 1.91, PlayerPosition.ALA_PIVOT, PlayerSkills(81, 68, 78, 64, 80))

    val granCanaria = Team("Gran Canaria         ")
    granCanaria.seleccJugadores(mutableListOf(ferran, albicy, shurna, balcerowski, slaught))

    // ============================================
    // JOVENTUT BADALONA
    // ============================================
    val guille = Player(30, "Guillem Vives", 1.91, PlayerPosition.BASE, PlayerSkills(80, 72, 78, 68, 79))
    val feliz = Player(28, "Andrés Feliz", 1.88, PlayerPosition.ESCOLTA, PlayerSkills(82, 70, 80, 65, 81))
    val brodziansky = Player(30, "Vladimir Brodziansky", 2.10, PlayerPosition.ALA_PIVOT, PlayerSkills(78, 76, 72, 76, 77))
    val tomic = Player(37, "Ante Tomic", 2.17, PlayerPosition.PIVOT, PlayerSkills(74, 80, 70, 84, 76))
    val busquets = Player(24, "Pep Busquets", 1.98, PlayerPosition.ALERO, PlayerSkills(76, 70, 75, 68, 77))

    val joven = Team("Joventut Badalona    ")
    joven.seleccJugadores(mutableListOf(guille, feliz, brodziansky, tomic, busquets))

    // ============================================
    // SURNE BILBAO BASKET
    // ============================================
    val adam = Player(28, "Adam Smith", 1.85, PlayerPosition.BASE, PlayerSkills(82, 70, 80, 65, 82))
    val alex = Player(29, "Alex Reyes", 2.01, PlayerPosition.ALERO, PlayerSkills(78, 72, 74, 70, 78))
    val killeya = Player(29, "Tomeu Killeya-Jones", 2.08, PlayerPosition.PIVOT, PlayerSkills(74, 78, 72, 80, 76))
    val nic = Player(32, "Nicola Radicevic", 1.96, PlayerPosition.ESCOLTA, PlayerSkills(80, 68, 78, 64, 79))
    val sergio = Player(31, "Sergio Llorente", 1.85, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 70, 75, 68, 76))

    val bilbao = Team("Surne Bilbao Basket  ")
    bilbao.seleccJugadores(mutableListOf(adam, nic, alex, killeya, sergio))

    // ============================================
    // UCAM MURCIA
    // ============================================
    val sant = Player(32, "Dylan Ennis", 1.88, PlayerPosition.BASE, PlayerSkills(84, 70, 82, 65, 83))
    val thad = Player(27, "Thaddus McFadden", 1.88, PlayerPosition.ESCOLTA, PlayerSkills(82, 68, 80, 62, 81))
    val nemanja = Player(29, "Nemanja Radovic", 2.03, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 76, 74, 74, 77))
    val simon = Player(28, "Simon Birgander", 2.08, PlayerPosition.PIVOT, PlayerSkills(74, 80, 70, 82, 75))
    val hackett = Player(25, "Howard Sant-Roos", 2.01, PlayerPosition.ALERO, PlayerSkills(78, 72, 76, 70, 78))

    val murcia = Team("UCAM Murcia          ")
    murcia.seleccJugadores(mutableListOf(sant, thad, nemanja, simon, hackett))

    // ============================================
    // CASADEMONT ZARAGOZA
    // ============================================
    val jahlon = Player(28, "Jahlon Blaine", 1.91, PlayerPosition.BASE, PlayerSkills(80, 70, 78, 65, 79))
    val justin = Player(33, "Justinian Jessup", 1.98, PlayerPosition.ESCOLTA, PlayerSkills(82, 68, 80, 64, 81))
    val boris = Player(29, "Boris Tisma", 2.03, PlayerPosition.ALERO, PlayerSkills(76, 72, 74, 70, 77))
    val hans = Player(25, "Hans Vanwijn", 2.06, PlayerPosition.ALA_PIVOT, PlayerSkills(74, 76, 74, 75, 76))
    val mark = Player(31, "Mark Smith", 1.96, PlayerPosition.PIVOT, PlayerSkills(72, 78, 70, 80, 75))

    val zaragoza = Team("Casademont Zaragoza  ")
    zaragoza.seleccJugadores(mutableListOf(jahlon, justin, boris, hans, mark))

    // ============================================
    // BAXI MANRESA
    // ============================================
    val dan = Player(30, "Dani Pérez", 1.88, PlayerPosition.BASE, PlayerSkills(80, 70, 78, 65, 79))
    val brancou = Player(25, "Brancou Badio", 1.91, PlayerPosition.ESCOLTA, PlayerSkills(82, 68, 80, 62, 81))
    val juanpi = Player(28, "Juanpi Vaulet", 1.98, PlayerPosition.ALERO, PlayerSkills(78, 72, 76, 70, 78))
    val mart = Player(27, "Martín Kravish", 2.08, PlayerPosition.PIVOT, PlayerSkills(74, 78, 72, 80, 76))
    val marc = Player(29, "Marcis Steinbergs", 2.06, PlayerPosition.ALA_PIVOT, PlayerSkills(76, 74, 74, 74, 77))

    val manresa = Team("Baxi Manresa         ")
    manresa.seleccJugadores(mutableListOf(dan, brancou, juanpi, mart, marc))

    // ============================================
    // LIGA ACB
    // ============================================
    val acb = League("Liga Endesa ACB 2024")
    acb.agregarEquipos(mutableListOf(realMadrid, barcelona, baskonia, valencia, unica, tenerife, granCanaria, joven, bilbao, murcia, zaragoza, manresa))

    val comienzo = Start(listOf(nba,acb))
    comienzo.menuPrincipal()
}
