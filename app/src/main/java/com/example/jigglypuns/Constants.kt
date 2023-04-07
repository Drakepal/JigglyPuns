package com.example.jigglypuns

object Constants {

    fun getQuestions(): ArrayList<Questions> {

        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What do you call a Pikachu that can fix computers?",
            R.drawable.pikachu,
            "Geek-achu",
            "Pikaboo",
            "Vulfix-it",
            "Zaptos Intolerant",
            1
        )

        questionsList.add(que1)

        return questionsList
    }
}