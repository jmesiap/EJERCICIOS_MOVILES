package com.jimpsoft.dashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jimpsoft.dashboard.databinding.ActivityDashboardBinding


class DashboardActivity : AppCompatActivity(){

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /***********************************************************/
        mostrarSaludo()
        activarBotonesListener()
    }

    fun activarBotonesListener() {
        binding.btnEdadCanina.setOnClickListener {
            startActivity(Intent(this, EdadCaninaActivity::class.java))
        }

        binding.btnSuperHeroes.setOnClickListener {
            startActivity(Intent(this, SuperHeroeMainActivity::class.java))
        }

        binding.btnPreguntas.setOnClickListener {
            Toast.makeText(this, "Aplicacion en construccion", Toast.LENGTH_LONG).show()
        }

        binding.btnSettings.setOnClickListener {
            Toast.makeText(this, "Aplicacion en construccion", Toast.LENGTH_LONG).show()
        }
        binding.btnFavorito.setOnClickListener {
            Toast.makeText(this, "Aplicacion en construccion", Toast.LENGTH_LONG).show()
        }
        binding.btnSalir.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }

    fun mostrarSaludo(){
        val correoRecibido = intent.getStringExtra(CORREO_LOGIN)
        if (!correoRecibido.isNullOrEmpty()) {
            binding.tvHola.text = getString(R.string.txt_dashboard_bienvenida, correoRecibido)
        }
    }

    companion object {
        const val CORREO_LOGIN = "com.jimpsoft.dashboard.CORREO_LOGIN"
    }
}