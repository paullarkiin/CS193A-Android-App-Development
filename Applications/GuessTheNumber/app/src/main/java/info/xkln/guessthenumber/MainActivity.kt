package info.xkln.guessthenumber

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val r = Random(1000)
    private val genNum = r.nextInt(1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Random", "The random number is: $genNum")


        checkGuessbutton.setOnClickListener {

            if(editTextUserGuessNumber.text.toString().isNotEmpty()){
                val valueToCheck: Int = editTextUserGuessNumber.text.toString().toInt()

                if(valueToCheck == genNum){
                    hintText.setText("Congrats You Guessed Correctly!")
                } else if(valueToCheck > genNum) {
                    hintText.setText("Your guess is too high.")
                }
                else {
                    hintText.setText("Your guess is too low")
                }
            } else {
                val dialogBuilder = AlertDialog.Builder(this)
                dialogBuilder.setMessage("Please chose a Number between 1 and 1000")
                    .setCancelable(false)
                    .setNegativeButton("OK", DialogInterface.OnClickListener {
                            dialog, id -> dialog.cancel()
                    })
                val alert = dialogBuilder.create()
                alert.setTitle("Message")
                alert.show()
            }
            }

        }
}