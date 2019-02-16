package com.example.ramishelh.whatever;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button checkButton = findViewById(R.id.checkButton);
        final TextView result = findViewById(R.id.result);
        final TextView label = findViewById(R.id.label);
        final EditText input = findViewById(R.id.input);


        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // you do your stuff here


                String inputText = input.getText().toString();
                String labelText = label.getText().toString();

                if(inputText.equals(labelText)) {
                    result.setText("True");
                    result.setTextColor(Color.parseColor("#008000"));
                } else {
                    result.setText("False");
                    result.setTextColor(Color.parseColor("#ff0000"));
                }

            }
        });



    }
}
