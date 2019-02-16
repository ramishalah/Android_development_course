package com.example.ramishelh.whatever;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton = findViewById(R.id.rollButton);
        final TextView result = findViewById(R.id.resultTextView);
        final SeekBar seekBar = findViewById(R.id.seekBar);
        final Button goButton = findViewById(R.id.goToActivity);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do your stuff here

                int randomNumber = (int) ((Math.random() * seekBar.getProgress()) + 1);

                result.setText(randomNumber +"");
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // you go to the next activity here

                goFunction();

            }
        });

    }

    private void goFunction(){
        Intent k = new Intent(this, Main2Activity.class);
        startActivity(k);
    }


}
