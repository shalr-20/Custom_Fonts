package com.tweak.customfonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView hin,eng,jap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        hin = findViewById(R.id.hindi);
        eng = findViewById(R.id.english);
        jap = findViewById(R.id.japanese);

        Typeface hinFont=Typeface.createFromAsset(getAssets(), "fonts/hindi.ttf");
        hin.setTypeface(hinFont);

        Typeface engFont=Typeface.createFromAsset(getAssets(),"fonts/english.ttf");
        eng.setTypeface(engFont);

        Typeface japFont=Typeface.createFromAsset(getAssets(), "fonts/japanese.ttf");
        jap.setTypeface(japFont);
    }
}