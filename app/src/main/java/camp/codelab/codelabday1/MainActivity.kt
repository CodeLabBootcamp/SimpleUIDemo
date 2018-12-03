package camp.codelab.codelabday1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            calculate(it)
        }

        minusButton.setOnClickListener {
            calculate(it)
        }

        mulButton.setOnClickListener {
            calculate(it)
        }

        divButton.setOnClickListener {
            calculate(it)
        }

    }

    fun calculate(clickedButton: View) {

        val number1String: String = number1EditText.text.toString()
        val number2String: String = number2EditText.text.toString()

        if (number1String.isNotEmpty() && number2String.isNotEmpty()) {

            val number1 = number1String.toFloat()
            val number2 = number2String.toFloat()

            val result: Float

            when (clickedButton.id) {

                plusButton.id -> {
                    result = number1 + number2
                }

                minusButton.id -> {
                    result = number1 - number2
                }

                mulButton.id -> {
                    result = number1 * number2
                }

                divButton.id -> {
                    if (number2 == 0f) {
                        Toast.makeText(this, getString(R.string.number_2_cannot_be_zero), Toast.LENGTH_SHORT).show()
                        result = 0f
                    } else {
                        result = number1 / number2
                    }
                }

                else -> {
                    result = 0f
                }
            }

            resultTextView.text = result.toString()


        } else {
            Toast.makeText(this, getString(R.string.numbers_cannot_be_empty), Toast.LENGTH_SHORT).show()
            resultTextView.text = ""
        }

    }


}
