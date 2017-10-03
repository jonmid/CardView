package com.jonmid.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.id_img_picasso);

        Picasso.with(this).load("https://www.adslzone.net/app/uploads/2017/08/donde-ver-futbol-temporada-2017-2018.jpg").into(imageView);
    }
}
