package za.co.varsitycollege.st10481692.imad_practicum_exam_st10481692

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val display = findViewById<Button>(R.id.display)
        val average = findViewById<Button>(R.id.average)
        val exitButton = findViewById<Button>(R.id.average)


        display.setOnClickListener(){
            "No Friends In The Industry Rap Playlist Drake 5"
            "N 2 Deep Rap Playlist Drake 5"
            "Burning Blue Memories Playlist Mariah the scientist 4"
            "Revenge Memories Playlist Mariah the scientist 4"
            "Dont Miss Best Love Playlist King Von 3"
            "Waynes story Best love Playlist King Von 3"
            "TGIF Dance song Playlist Glorilla 2"
            "Typa Dance song Playlist Glorilla 2"
        }
        average.setOnClickListener(){
            fun main() {
                val numbers = mutableListOf<Double>()

                println("Enter numbers one by one. Type 'done' to finish:")

                while (true) {
                    print("Enter number: ")
                    val input = readLine()

                    if (input.equals("done", ignoreCase = true)) {
                        break
                    }

                    try {
                        val number = input?.toDouble()
                        if (number != null) {
                            numbers.add(number)
                        }
                    } catch (e: NumberFormatException) {
                        println("Invalid input. Please enter a valid number or type 'done'.")
                    }
                }

                if (numbers.isNotEmpty()) {
                    val sum = numbers.sum()
                    val average = sum / numbers.size
                    println("Average of the entered numbers: $average")
                } else {
                    println("No numbers were entered.")
                }
            }
        }
        exitButton.setOnClickListener {
            finishAffinity() }
    }
}