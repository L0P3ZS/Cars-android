package com.example.cartas.data

import com.example.cartas.R
import com.example.cartas.model.RecyclearData





class DataSource {
    fun loadAffirmations():List<RecyclearData>{
        return listOf<RecyclearData>(
            RecyclearData(R.string.titel1,R.drawable.imagen3),
            RecyclearData(R.string.titel2,R.drawable.images8),
            RecyclearData(R.string.titel3,R.drawable.descarga5),
            RecyclearData(R.string.titel4,R.drawable.imagen10),
            RecyclearData(R.string.titel5,R.drawable.images),
            RecyclearData(R.string.titel6,R.drawable.laravel),
            RecyclearData(R.string.titel7,R.drawable.im),
            RecyclearData(R.string.titel8,R.drawable.jav),
        )
    }
}