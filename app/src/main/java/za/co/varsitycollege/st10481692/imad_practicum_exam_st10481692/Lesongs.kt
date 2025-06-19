package za.co.varsitycollege.st10481692.imad_practicum_exam_st10481692

import android.content.Intent
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
        val songs = findViewById<TextView>(R.id.songs)
        val songname = findViewById<EditText>(R.id.songname)
        val artistname = findViewById<EditText>(R.id.arstistname)
        val rating = findViewById<EditText>(R.id.rating)
        val comments = findViewById<EditText>(R.id.comments)
        val nxtbtn = findViewById<Button>(R.id.nxtbtn)
        val extbtn = findViewById<Button>(R.id.extbtn)

        add.setOnClickListener(){
            val songname = songs.text.toString()
            val artistname = artistname.text.toString()
            val rating = rating.text.toString()
            val comments = comments.text.toString()

            val add = when (songname) {
                "No Friends In The Industry" -> "Rap Playlist"
                "Burning Blue" -> "Memories Playlist"
                "Dont Miss" -> "Best Love Playlist"
                "TGIF" -> "Dance song Playlist"
                else -> "Invalid Prompt"
            }
            val add = when (artistname) {
                "Drake" -> "Rap Playlist"
                "Mariah the scietist" -> "Memories playlist"
                "King Von" -> "Best LOve Song"
                "TGIF" -> "Dance song playlist"
                else -> "Invalid Prompt"




            }
            nxtbtn.setOnClickListener {
                val intent = Intent(this, detailed::class.java)
                startActivity(intent)}

            extbtn.setOnClickListener {
                finishAffinity() }




        }


    }
}