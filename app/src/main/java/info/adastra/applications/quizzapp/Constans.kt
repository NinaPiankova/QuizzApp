package info.adastra.applications.quizzapp

object Constans {

    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to",
            R.drawable.flag1,
            "Argentina",
            "Italia",
            "Bangladesh",
            "Turkey",
            "Finland",
            1
        )
        val que2 = Question(
            1,
            "What country does this flag belong to",
            R.drawable.flag2,
            "Arabia",
            "Italia",
            "Bangladesh",
            "Turkey",
            "Finland",
            1
        )

        val que3 = Question(
            1,
            "What country does this flag belong to",
            R.drawable.flag2,
            "Arabia",
            "Italia",
            "Avstria",
            "Turkey",
            "Finland",
            3
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList
    }
}