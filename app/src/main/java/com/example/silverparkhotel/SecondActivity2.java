package com.example.silverparkhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity
{

    ImageView second_back_arrow, second_arrow_up;
    TextView segundo_titulo, segundo_subtitulo, mais_detalhes;
    RatingBar second_ratingbar;

    Animation from_left, from_right, from_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        second_back_arrow = findViewById(R.id.second_back_arrow);
        second_arrow_up = findViewById(R.id.second_arrow_up);
        segundo_titulo = findViewById(R.id.segundo_titulo);
        segundo_subtitulo = findViewById(R.id.segundo_subtitulo);
        mais_detalhes = findViewById(R.id.mais_detalhes);
        second_ratingbar = findViewById(R.id.second_ratingbar);

        second_back_arrow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SecondActivity2.this, MainActivity.class);
                startActivity(intent);
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

        from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);
        from_right = AnimationUtils.loadAnimation(this, R.anim.anim_from_right);
        from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);

        second_back_arrow.setAnimation(from_left);
        segundo_titulo.setAnimation(from_right);
        segundo_subtitulo.setAnimation(from_right);
        second_ratingbar.setAnimation(from_left);
        second_arrow_up.setAnimation(from_bottom);
        mais_detalhes.setAnimation(from_bottom);

        second_arrow_up.setOnClickListener((view) -> {
            Intent intent = new Intent(SecondActivity2.this, ThirdActivity2.class);

            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(second_arrow_up, "quarto_simples_transition");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SecondActivity2.this, pairs);

            startActivity(intent, options.toBundle());
        } );



    }
}