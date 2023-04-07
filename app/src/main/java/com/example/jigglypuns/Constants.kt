package com.example.jigglypuns

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

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

        val que2 = Questions(
            2,
            "What Pokemon does Dracula like most?",
            R.drawable.koffing,
            "Koffin",
            "Ivysaur",
            "Prince Charmander",
            "Wynaut",
            1
        )
        questionsList.add(que2)
        val que3 = Questions(
            3,
            "Which Pokemon could also be a pirate?",
            R.drawable.arbok,
            "Arrrrrr-bok",
            "Charizard",
            "Chikorita",
            "Wynaut",
            1
        )
        questionsList.add(que3)
        val que4 = Questions(
            4,
            "I asked my dad why a grown man would play Pokemon Go? He said, ",
            R.drawable.wynaut,
            "Hitmonlee",
            "Mewtwo",
            "Wynaut",
            "Zaptos",
            3
        )
        questionsList.add(que4)
        val que5 = Questions(
            5,
            "Why did the Squirtle cross the ocean?",
            R.drawable.squirtle,
            "Because it was there.",
            "He was hot.",
            "To get to the other tide.",
            "To play pika-boo.",
            3
        )
        questionsList.add(que5)
        val que6 = Questions(
            6,
            "Why can't you blindfold a Pokemon?",
            R.drawable.pikachu,
            "Because it's going to Pikachu!",
            "Ekans see clearly now, the rain has gone",
            "They can't see it time can fly",
            "Wynaut try",
            1
        )
        questionsList.add(que6)
        val que7 = Questions(
            7,
            "What do you call a Weedle who does stunts on a motorcycle?",
            R.drawable.weedle,
            "A LightBulbasaur",
            "Kakuna Rattata",
            "The Great Gastly",
            "Weedle Knievel",
            4
        )
        questionsList.add(que7)
        val que8 = Questions(
            8,
            "What did the judge say when a Skuntank came into the court?",
            R.drawable.skuntank,
            "I see you've bitten off more than you can pikachu",
            "I should've kept my big meowth shut",
            "Odor in the court",
            "The Pokeball's in your court",
            3
        )
        questionsList.add(que8)
        val que9 = Questions(
            9,
            "What do you call Meowth's reflection?",
            R.drawable.meowth,
            "A copycat",
            "Keep your Meowth shut",
            "This is a real cat-has-trophy",
            "Watch out for the tree, it has bark",
            1
        )
        questionsList.add(que9)
        val que10 = Questions(
            10,
            "What happened when Bulbasaur accidentally hurt himself?",
            R.drawable.bulbasaur,
            "He cried",
            "He was Bulbasore",
            "He said Wynaut",
            "He wasn't Drowzee anymore",
            2
        )

        questionsList.add(que10)

        return questionsList
    }
}