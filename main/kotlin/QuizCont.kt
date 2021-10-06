import java.io.File


object QuizCont {

    var list = mutableListOf<Quest>()

    val fileName = "C:\\Users\\csiki.daniel\\Documents\\AndroidProgramozas\\Quiz\\src\\main\\resources\\Quiz"
    fun init() {
        var quest1 : Quest

        var questions = File(fileName).useLines { it.toList() }
        for(i in 0..questions.size step (5)){

            
        }
    }
}


