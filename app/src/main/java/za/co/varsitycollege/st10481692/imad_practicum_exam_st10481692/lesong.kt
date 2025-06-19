package za.co.varsitycollege.st10481692.imad_practicum_exam_st10481692

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lesong : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lesong)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val add = findViewById<Button>(R.id.add)
        val songs = findViewById<TextView>(R.id.songs)
        val songname = findViewById<TextView>(R.id.songname)
        val artistname = findViewById<TextView>(R.id.arstistname)
        val rating = findViewById<TextView>(R.id.rating)
        val comments = findViewById<TextView>(R.id.comments)
        val nxtbtn = findViewById<Button>(R.id.nxtbtn)
        val extbtn = findViewById<Button>(R.id.extbtn)
        val usertxt = findViewById<EditText>(R.id.usertxt)

        add.setOnClickListener(){
           val usertxt = usertxt.text.toString()

            val add = when (usertxt){
                "No Friends In The Industry" -> "Rap Playlist"
                "Burning Blue" -> "Memories Playlist"
                "Dont Miss" -> "Best Love Playlist"
                "TGIF" ->"Dance song Playlist"
                "Drake" -> "Rap Playlist"
                "Mariah the scientist" -> "Memories Playlist"
                "King Von" -> "Best Love Playlist"
                "Glorilla" ->"Dance song Playlist"
                "5" -> "Rap Playlist"
                "4" -> "Memories Playlist"
                "3" -> "Best Love Playlist"
                "2" ->"Dance song Playlist"



                else -> "Invalid Promt"
            }


            }
            nxtbtn.setOnClickListener {
                val intent = Intent(this, detailed::class.java)
                startActivity(intent)}

            extbtn.setOnClickListener {
                finishAffinity() }




        }


    }

