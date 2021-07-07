package AppMusic

//Object-Oriented Programming II - Session 4

open class Lucidity (val name: String, val strength:Int) :Any() {

    protected var direction: String ="PREVIOUS" //show a previous song

    protected fun changeDirection(){ //previous --> play
        direction = if (direction=="PLAY") "PREVIOUS" else "PLAY"
        println("$name coming soon! $direction")
    }

    protected fun play(){ //song is playing
        println("$name PLAYING")
    }

    open fun collision(collider: String){ //action to show a song -- collision --object
        when(collider){
            "Lucidity" -> play()
            "Elephant" -> changeDirection()
        }
    }
}