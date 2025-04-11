package com.example.project1.Activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.project1.Domain.QuestionModel
import com.example.project1.R
import com.example.project1.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val window: Window = this@MainActivity.window
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.grey)

        binding.apply{
            bottomMenu.setItemSelected(R.id.home)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.Board){
                    startActivity(Intent(this@MainActivity, LeaderActivity::class.java))
                }
            }

            singleBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList()))
                startActivity(intent)
            }
        }
    }

    private fun questionList(): MutableList<QuestionModel>{
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(QuestionModel(
            1,
            "Which planet is the largest in solar system?",
            "Earth",
            "Mars",
            "Moon",
            "Jupiter",
            "d",
            5,
            "q_1",
            null
            )
        )
        question.add(QuestionModel(
            2,
            "Which country is the largest in solar world by land area?",
            "Russia",
            "Usa",
            "China",
            "United Kingdom",
            "a",
            5,
            "q_2",
            null
            )
        )
        question.add(QuestionModel(
            3,
            "Which of the following substances is used as an anti-cancer medication in medical world?",
            "Chips",
            "Cannabis",
            "Sleep",
            "Vodka",
            "b",
            5,
            "q_3",
            null
            )
        )
        question.add(QuestionModel(
            4,
            "Which moon in the solar system solar has an atmosphere?",
            "Luna(Moon)",
            "Venus",
            "Phobos",
            "None of the above",
            "d",
            5,
            "q_4",
            null
        )
        )
        question.add(QuestionModel(
            5,
            "Which of the following symbols represents the chemical element with the atomic number 5?",
            "O",
            "H",
            "C",
            "N",
            "c",
            5,
            "q_5",
            null
        )
        )
        question.add(QuestionModel(
            6,
            "Who is created with inventing theather as we know it today ",
            "Shakespeare",
            "Arhur Miller",
            "Ashkouri",
            "Ancient Greeks",
            "d",
            5,
            "q_6",
            null
        )
        )
        question.add(QuestionModel(
            7,
            "Which is the largest ocean in the world?",
            "Pacific Ocean",
            "Atlantic ocean",
            "Indian ocean",
            "Arctic Ocean",
            "a",
            5,
            "q_7",
            null
        )
        )
        question.add(QuestionModel(
            8,
            "Which religions are among most practiced religions in the world?",
            "Islam, Christianity, Judaism",
            "Buddhism, Hinduism, Sikhism",
            "Zoroastrianism, Brahmanism, Yazdanism",
            "Taoism, Shintoism, Confucianism",
            "a",
            5,
            "q_8",
            null
        )
        )
        question.add(QuestionModel(
            9,
            "In which continent are the most independent countries located?",
            "Asia",
            "Europe",
            "Africa",
            "Americas",
            "c",
            9,
            "q_9",
            null
        )
        )
        question.add(QuestionModel(
            10,
            "Which ocean has the greatest average depth",
            "Pacific Ocean",
            "Atlantic ocean",
            "Indian ocean",
            "Southern Ocean",
            "d",
            5,
            "q_10",
            null
        )
        )
        return question
    }
}
