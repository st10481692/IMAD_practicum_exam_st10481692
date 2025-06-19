package za.co.varsitycollege.st10481692.imad_practicum_exam_st10481692

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val goButton = findViewById<Button>(R.id.goButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        goButton.setOnClickListener {
            val intent = Intent(this, Lesongs::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finishAffinity() }

        }
    }
