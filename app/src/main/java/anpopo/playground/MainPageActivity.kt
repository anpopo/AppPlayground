package anpopo.playground

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainPageActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)


        val username = "anpopo"

        AlertDialog.Builder(this)
            .setTitle("Welcome")
            .setMessage(
                """
                환영합니다.
                ${username} 의 세계입니다.
            """.trimIndent()
            )
            .setPositiveButton("확인") { _, _ -> }
            .create()
            .show()

    }
}