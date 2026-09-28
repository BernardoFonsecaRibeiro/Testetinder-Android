package br.ulbra.tinder

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imgPerfil: ImageView

    private val imagens = arrayOf(
        R.drawable.loira
    )

    private var imagemAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imgPerfil = findViewById(R.id.imgPerfil)

        val areaEsquerda = findViewById<android.view.View>(R.id.areaEsquerda)
        val areaDireita = findViewById<android.view.View>(R.id.areaDireita)

        // Clique no lado esquerdo: imagem anterior
        areaEsquerda.setOnClickListener {
            imagemAtual--

            if (imagemAtual < 0) {
                imagemAtual = imagens.size - 1
            }

            imgPerfil.setImageResource(imagens[imagemAtual])
        }

        // Clique no lado direito: próxima imagem
        areaDireita.setOnClickListener {
            imagemAtual++

            if (imagemAtual >= imagens.size) {
                imagemAtual = 0
            }

            imgPerfil.setImageResource(imagens[imagemAtual])
        }
    }
}