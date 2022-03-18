package com.example.fooddelivery

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tv_edit_profile = findViewById<TextView>(R.id.tv_edit_profile)
        val img_next_main = findViewById<ImageView>(R.id.img_next_main)

        img_next_main.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        tv_edit_profile.setOnClickListener(View.OnClickListener {
            createDialog()
        })
    }
    private fun createDialog(){
        val tv_name_profile = findViewById<TextView>(R.id.tv_name)
        val tv_name = findViewById<TextView>(R.id.tv_profile_name)
        val tv_email = findViewById<TextView>(R.id.tv_profile_email)
        val tv_phone = findViewById<TextView>(R.id.tv_profile_phone)

        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog_profile)
        dialog.window?.setLayout((getResources().getDisplayMetrics().widthPixels*0.90).toInt(),(resources.displayMetrics.heightPixels * 0.70).toInt())

        val edt_name_update = dialog.findViewById<EditText>(R.id.edt_profile_update_name)
        val edt_email_update = dialog.findViewById<EditText>(R.id.edt_profile_update_email)
        val edt_phone_update = dialog.findViewById<EditText>(R.id.edt_profile_update_phone)
        val btn_cancel = dialog.findViewById<Button>(R.id.btn_profile_cancel)
        val btn_update = dialog.findViewById<Button>(R.id.btn_profile_update)

        edt_name_update.setText(tv_name.text.toString())
        edt_email_update.setText(tv_email.text.toString())
        edt_phone_update.setText(tv_phone.text.toString())

        btn_cancel.setOnClickListener(View.OnClickListener {
            dialog.dismiss()
        })
        btn_update.setOnClickListener(View.OnClickListener {
            tv_name_profile.setText(edt_name_update.text.toString())
            tv_name.setText(edt_name_update.text.toString())
            tv_email.setText(edt_email_update.text.toString())
            tv_phone.setText(edt_phone_update.text.toString())
            dialog.dismiss()
        })

        dialog.show()
    }
}