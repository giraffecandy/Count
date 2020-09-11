package app.babachan.count

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0
        numberTextView.text = "0"


        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()

            if (number % 3 == 0 && number != 0) {
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }

        }

        minusButton.setOnClickListener {
            number -= 1
            numberTextView.text = number.toString()

            if (number % 3 == 0 && number != 0) {
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }

        }

        clearButton.setOnClickListener {
            numberTextView.text = "0"
        }


    }
}
