package AppMusic


fun main() {

   println("PLAYLIST")
   println()
   songs.forEach { println(it) }
   println()
   println()


   print("Enter your song (write Elephant):  ")
   val stringInput = readLine()
   println()
   println()

   //Class,Object,Constructor
   val myAlbum = Album("Tame Impala","Alternative, Indie, Psychedelic","2012", "Lonerism")


   println()
   //named arguments - Example:2012
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   println()
   //named arguments /Example: 2015
   //val currents = Album("Tame Impala","Alternative, Indie, Psychedelic","2015", "Currents")


   println()
   println()

   val artist = Artist()
   artist.getTurn()
   artist.turnOn()
   artist.getTurn()

   println()
   println()

      //Getters, Setters, Visibility modifiers
      var elephant = Elephant()


     println("You have ${elephant.getLives()}")
     println()

   for(i in 1..13){ //songs to listen to..
      elephant.collision("Expectation")
      println("Now ${elephant.getLives()}")
   }

   println()
   println()
   ////Object-Oriented Programming II
   //val nextSong = Lucidity("Lucidity",2)

   //Polymorphism & Inheritance
   val nextSong = Expectation("Expectation",2)
   nextSong.collision("Elephant") // collision - show a different song
   nextSong.collision("Lucidity") // collision - show a different song

   //Polymorphism
   val nextSong2 = LetItHappen()
   nextSong2.collision("Lucidity")



}





