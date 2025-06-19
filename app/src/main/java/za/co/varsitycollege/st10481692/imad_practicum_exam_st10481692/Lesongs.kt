package za.co.varsitycollege.st10481692.imad_practicum_exam_st10481692

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lesongs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lesongs)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val add = findViewById<Button>(R.id.add)
        val Songs = findViewById<TextView>(R.id.Songs)
        val songname = findViewById<EditText>(R.id.songname)
        val artistname = findViewById<EditText>(R.id.artistname)
        val rating = findViewById<EditText>(R.id.rating)
        val comments = findViewById<EditText>(R.id.comments)

        add.setOnClickListener(){

        }


    }
}