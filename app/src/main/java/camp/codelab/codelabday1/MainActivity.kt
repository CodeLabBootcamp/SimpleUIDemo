package camp.codelab.codelabday1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginButton.setOnClickListener {

            val username = usernameEditText.text
            val password = passwordEditText.text

            val message = "Username: $username\nPassword: $password"

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        }

    }
}
