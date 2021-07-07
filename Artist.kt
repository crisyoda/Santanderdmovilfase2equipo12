package AppMusic

class Artist {


    var isOn = false

    //method
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getTurn(){
        val turnMode = if(isOn) "No" else "Yes"
        println("Do you want to play this song? $turnMode ")
    }

}
