package info.xkln.wowclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // example that _, works in in kotlin if it not used  _ == to not being used we
        // dont care about this variable.
        //classeslist.setOnItemClickListener { _,_,_,_ ->
       // }

        classeslist.setOnItemClickListener { list, item, index, id ->
            val id = when (index) {
                0 -> R.drawable.druid
                1 -> R.drawable.monk
                2 -> R.drawable.paladin
                else -> R.drawable.deathknight
            }
            wowClasses.setImageResource(id)

        }




    }

    fun radioButtonsClick(view: View){

        when (view) {
            rb_dk -> wowClasses.setImageResource(R.drawable.deathknight)
            rb_monk -> wowClasses.setImageResource(R.drawable.monk)
            rb_paladin -> wowClasses.setImageResource(R.drawable.paladin)
            rb_druid -> wowClasses.setImageResource(R.drawable.druid)
        }
    }
}
