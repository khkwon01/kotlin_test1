package com.khk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.set
import kotlinx.android.synthetic.main.at1_layout.*



class at1 : AppCompatActivity() {

    var i_count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.at1_layout)

        /*
        i_count = num1.text.toString().toInt()
        Toast.makeText(this, i_count, Toast.LENGTH_SHORT).show()

         */

        btn_inc1.setOnClickListener {
            i_count = num1.text.toString().toInt()
            i_count = i_count + 1

            num1.setText("${i_count}")

            toastShort("${i_count}")

        }

    }
}
