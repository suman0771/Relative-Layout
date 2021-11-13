package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var radioButton: RadioButton
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val button = findViewById<Button>(R.id.button)
        val checkbox = findViewById<CheckBox>(R.id.checkBox2)
        val editText = findViewById<EditText>(R.id.editTex)

        radioGroup.clearCheck()

        editText.setOnClickListener {
            radioGroup.clearCheck();
        }

        button.setOnClickListener {

            if (!checkbox.isChecked) {
                Toast.makeText(this, "Please select the checkbox", Toast.LENGTH_LONG).show()
            } else {
                val setId: Int = radioGroup.checkedRadioButtonId
                radioButton = findViewById(setId)
                val out1: String = radioButton.text.toString()
                Toast.makeText(this, out1, Toast.LENGTH_LONG).show()
            }

        }
    }
}