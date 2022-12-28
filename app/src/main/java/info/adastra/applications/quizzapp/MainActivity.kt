package info.adastra.applications.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private  var btnStart: Button? = null
    private var enName: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        enName = findViewById(R.id.et_name)

        btnStart?.setOnClickListener {

            if(enName!!.text.isEmpty()){

                Toast.makeText(this,
                    "Please, enter your name", Toast.LENGTH_LONG).show()
            } else{
                var intent: Intent = Intent(this, QuizQuestionActivity::class.java )
                startActivity(intent)
            }

        }


    }
}