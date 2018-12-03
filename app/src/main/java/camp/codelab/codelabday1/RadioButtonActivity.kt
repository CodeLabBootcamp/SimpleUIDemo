package camp.codelab.codelabday1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)




        calculateButton.setOnClickListener {

            val number1String = number1EditText.text.toString()
            val number2String = number2EditText.text.toString()

            if (number1String.isNotEmpty() && number2String.isNotEmpty()) {

                val number1 = number1String.toFloat()
                val number2 = number2String.toFloat()

                var result = 0f

                when (operationRadioGroup.checkedRadioButtonId) {
                    plusRadioButton.id -> {
                        result = number1 + number2
                    }
                    minusRadioButton.id -> {
                        result = number1 - number2
                    }
                    mulRadioButton.id -> {
                        result = number1 * number2
                    }
                    divRadioButton.id -> {
                        if (number2 == 0f) {
                            Toast.makeText(this, R.string.number_2_cannot_be_zero, Toast.LENGTH_SHORT).show()
                            result = 0f
                        } else {
                            result = number1 / number2
                        }
                    }
                }

                resultTextView.text = result.toString()


            } else {
                Toast.makeText(this, R.string.numbers_cannot_be_empty, Toast.LENGTH_SHORT).show()
                resultTextView.text = ""
            }

        }


        operationRadioGroup.setOnCheckedChangeListener { group, checkedId ->

            resultTextView.text = ""

        }

    }
}
