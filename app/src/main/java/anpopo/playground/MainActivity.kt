package anpopo.playground

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private val passwordText: EditText by lazy {
        findViewById(R.id.passwordText)
    }

    private val entryButton: AppCompatButton by lazy {
        findViewById(R.id.entryButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        entryButton.setOnClickListener {
            val passwordSharedPreference = getSharedPreferences("password", Context.MODE_PRIVATE)
            val userPassword = passwordText.text.toString()

            if (passwordSharedPreference.getString("password", "1234").equals(userPassword)) {
                startActivity(Intent(this, MainPageActivity::class.java))
            } else {
                AlertDialog.Builder(this)
                    .setMessage("바보")
                    .setNegativeButton("돌아가기") { _, _ -> }
                    .create()
                    .show()
            }
        }


    }
}