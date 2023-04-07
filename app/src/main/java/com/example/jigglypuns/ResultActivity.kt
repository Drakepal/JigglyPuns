package com.example.jigglypuns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val lv = findViewById<View>(R.id.animationView) as LottieAnimationView

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tvName.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQuestions = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your score is $correctQuestions out of $totalQuestions"

        lv!!.setAnimation(R.raw.confetti)
        lv!!.playAnimation()

        btnFinish.setOnClickListener {

            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }
}