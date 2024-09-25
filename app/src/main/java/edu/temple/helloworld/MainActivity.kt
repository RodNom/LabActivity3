package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameEditTextView = findViewById<TextView>(R.id.nameEditText)
        displayTextView = findViewById(R.id.displayTextView)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (nameEditTextView.text.isEmpty()){
                nameEditTextView.setError("Please enter your name")
            }
            else {
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }
        }


    }
}