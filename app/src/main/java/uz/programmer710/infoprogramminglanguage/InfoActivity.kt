package uz.programmer710.infoprogramminglanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_1.view.*
import uz.programmer710.infoprogramminglanguage.models.User

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        addData()
        addImage()

    }

    private fun addImage() {
        if (text_language.text.toString() == "Android") {
            image_info.setImageResource(R.drawable.android)
        }else if (text_language.text.toString() == "Java"){
            image_info.setImageResource(R.drawable.java)
        }else if (text_language.text.toString() == "Kotlin"){
            image_info.setImageResource(R.drawable.kotlin)
        }else if (text_language.text.toString() == "Python"){
            image_info.setImageResource(R.drawable.python)
        }else if (text_language.text.toString() == "MySQL"){
            image_info.setImageResource(R.drawable.mysql)
        }else if (text_language.text.toString() == "Php"){
            image_info.setImageResource(R.drawable.php)
        }
    }

    private fun addData() {
        val text1 = intent.getStringExtra("keyName")
        text_language.text = text1.toString()

        val text2 = intent.getStringExtra("keyInfo")
        text_Info.text = text2.toString()

    }

}