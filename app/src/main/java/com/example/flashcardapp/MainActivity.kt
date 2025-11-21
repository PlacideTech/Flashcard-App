package com.example.flashcardapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.view.View

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>( R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>( R.id.flashcard_answer)
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer3)
        val btsView = findViewById<Button>(R.id.BTS)

        flashcardAnswer.setOnClickListener{
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.my_Blanc_color, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.my_vert_color, null))
        }




    }
}

    