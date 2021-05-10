package com.toor.viewgroups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)

        val signInButton = findViewById<MaterialButton>(R.id.signInButton)

        signInButton.setOnClickListener() {
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this, "whoops not a valid  username or password", Toast.LENGTH_LONG)
                    .show()

            } else {
                if (email.toString() == "toor@gmail.com" && password.toString() == "root") {
                    val intent = Intent(this, ListActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}


