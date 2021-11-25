package com.example.silverparkhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Reserva extends AppCompatActivity
{

    ImageView botao_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        botao_voltar = findViewById(R.id.botao_voltar);

        botao_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Reserva.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}