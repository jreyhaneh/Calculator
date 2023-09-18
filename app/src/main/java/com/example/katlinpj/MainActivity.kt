package com.example.katlinpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    var f1=false
    var f2=false
    var f3=false
    var list2= mutableListOf<Int>()

    var adad=0

    var num1=0
    var num2=0
    var finally=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val button1=findViewById<Button>(R.id.button1)
val button2=findViewById<Button>(R.id.button2)
val button3=findViewById<Button>(R.id.button3)
val button4=findViewById<Button>(R.id.button4)
val button5=findViewById<Button>(R.id.button5)
val button6=findViewById<Button>(R.id.button6)
val button7=findViewById<Button>(R.id.button7)
val button8=findViewById<Button>(R.id.button8)
val button9=findViewById<Button>(R.id.button9)
val button10=findViewById<Button>(R.id.button10)
val button13=findViewById<Button>(R.id.button13)
val button12=findViewById<Button>(R.id.button12)
val button11=findViewById<Button>(R.id.button11)
val button14=findViewById<Button>(R.id.button14)
val buttonreset=findViewById<Button>(R.id.button)

        val textviwe=findViewById<TextView>(R.id.textView)

        button1.setOnClickListener {
        list2.add(button1.text.toString().toInt())
            adad=number(list2).toInt()
           textviwe.setText("$adad")
}
        button2.setOnClickListener {
       list2.add(button2.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button3.setOnClickListener {
        list2.add(button3.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button4.setOnClickListener {
        list2.add(button4.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button5.setOnClickListener {
        list2.add(button5.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button6.setOnClickListener {
        list2.add(button6.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button7.setOnClickListener {
        list2.add(button7.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button8.setOnClickListener {
        list2.add(button8.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button9.setOnClickListener {
        list2.add(button9.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }
        button10.setOnClickListener {
        list2.add(button10.text.toString().toInt())
            adad=number(list2).toInt()
            textviwe.setText("$adad")
        }

        button13.setOnClickListener {
            textviwe.setText(button13.text)

            if(f2==true||f1==true) {
                Toast.makeText(this, "invalid", Toast.LENGTH_LONG)
            }
            else{
            num1=number(list2).toInt()
            list2.clear()
            f3=true}
}
        button12.setOnClickListener {
            textviwe.setText(button12.text)

            if(f1==true||f3==true){
                Toast.makeText(this,"invalid",Toast.LENGTH_LONG)
            }
            else{
            num1=number(list2).toInt()
            list2.clear()
            f2=true}
}
        button11.setOnClickListener {
            textviwe.setText(button11.text)

            if(f3==true||f2==true){
                Toast.makeText(this,"invalid",Toast.LENGTH_LONG)
            }
            else{
            num1=number(list2).toInt()
            list2.clear()
            f1=true}
}




            button14.setOnClickListener {

               if (f1==true) {
                   num2 = number(list2).toInt()
                   finally=num1*num2
               }

                if (f2==true){

                    num2 = number(list2).toInt()
                    finally=num1+num2
                }

                if (f3==true){

                    num2 = number(list2).toInt()
                    finally=num1-num2
                }

                textviwe.setText("$finally ")
            }

        buttonreset.setOnClickListener {
            list2.clear()
            textviwe.setText(" ")
            f1=false
            f2=false
            f3=false
        }



    }

    fun number(list: List<Int>):Double{
        var sum=0.0
        var length=0
        var length2=0.0

        length= (list.size)-1
        length2=length.toDouble()

        for (i in list){
            sum +=pow(10.0,length2) *i
            length2--
        }
        return sum
    }

}