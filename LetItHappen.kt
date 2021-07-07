package AppMusic

// Polymorphism - Session 4

class LetItHappen: Lucidity ("LetItHappen", 2) {

    private var state = "Next Song"

    override fun collision(collider: String){
        when(collider){
            "Lucidity" -> {
                state = "coming soon!"
                println("Let It Happen $state")
            }
            "Lucidity" -> changeDirection()
        }

}

}

