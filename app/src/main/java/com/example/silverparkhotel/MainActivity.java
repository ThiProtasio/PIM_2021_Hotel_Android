package com.example.silverparkhotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    CardView cardView, cardView2, cardView3, cardView4;
    ImageView imageView;
    TextView textView, textView2, textView3, textView4, textView5, boas_vindas;
    Animation anim_from_button, anim_from_top, anim_from_left;

    @TargetApi(Build.VERSION_CODES.KITKAT)

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardview);
        cardView2 = findViewById(R.id.cardview2);
        cardView3 = findViewById(R.id.cardview3);
        cardView4 = findViewById(R.id.cardview4);
        imageView = findViewById(R.id.imageview);
        textView = findViewById(R.id.primeirotexto);
        textView2 = findViewById(R.id.textview2);
        textView3 = findViewById(R.id.textview3);
        textView4 = findViewById(R.id.textview4);
        textView5 = findViewById(R.id.textview5);
        boas_vindas = findViewById(R.id.boas_vindas);

        anim_from_button = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);

        cardView.setAnimation(anim_from_button);
        cardView2.setAnimation(anim_from_button);
        cardView3.setAnimation(anim_from_button);
        textView.setAnimation(anim_from_top);
        textView2.setAnimation(anim_from_top);
        textView3.setAnimation(anim_from_top);
        textView4.setAnimation(anim_from_top);
        textView5.setAnimation(anim_from_top);
        boas_vindas.setAnimation(anim_from_left);

        cardView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secondActivity);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent secondActivity2 = new Intent(MainActivity.this, SecondActivity2.class);
                startActivity(secondActivity2);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent secondActivity3 = new Intent(MainActivity.this, SecondActivity3.class);
                startActivity(secondActivity3);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent secondActivity4 = new Intent(MainActivity.this, SecondActivity4.class);
                startActivity(secondActivity4);
            }
        });

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

    }
}