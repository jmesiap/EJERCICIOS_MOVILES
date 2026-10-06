package com.jimpsoft.dashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jimpsoft.dashboard.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /********************************************************************/
        mostrarDashboardActivity()

    }

    fun mostrarDashboardActivity(){
        binding.btnLogin.setOnClickListener {
            val correoUsuario = binding.etEmail.text.toString().trim()
            if(correoUsuario.isEmpty()){
                Toast.makeText(this, "Debe ingresar un correo", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra(DashboardActivity.CORREO_LOGIN, correoUsuario)
                startActivity(intent)
                finish()
            }
        }
    }
}