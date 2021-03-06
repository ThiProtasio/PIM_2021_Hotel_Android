package com.example.silverparkhotel;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ThirdActivity4 extends AppCompatActivity
{

    ImageView down_arrow;
    ScrollView third_scrollview;
    Animation from_bottom;
    Button botao_reservar;

    @RequiresApi (api = Build.VERSION_CODES.KITKAT)

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third4);

        botao_reservar = findViewById(R.id.botao_reservar);
        down_arrow = findViewById(R.id.down_arrow);
        third_scrollview = findViewById(R.id.third_scrollview);
        from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        down_arrow.setAnimation(from_bottom);
        third_scrollview.setAnimation(from_bottom);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        botao_reservar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intentReservar = new Intent(ThirdActivity4.this, Reserva.class);
                startActivity(intentReservar);
            }
        });

        down_arrow.setOnClickListener(new View.OnClickListener()
        {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ThirdActivity4.this, SecondActivity4.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(down_arrow, "quarto_simples_transition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(ThirdActivity4.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });


    }
}