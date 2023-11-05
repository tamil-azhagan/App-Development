package com.example.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText unit;
    private TextView answer;
    private Button btnkg;

    private Button btng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        unit=(EditText)findViewById(R.id.input);
        btnkg=(Button)findViewById(R.id.btnConvertKg);
        btng=(Button)findViewById(R.id.btnConvertgram);
        answer=(TextView)findViewById(R.id.ans);

        btnkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double input_gram=Double.parseDouble(unit.getText().toString());
                    double ans_kg=input_gram/1000;
                    answer.setText("Value in Kilogram:"+Double.toString(ans_kg)+"kg");
                }
                catch(Exception e)
                {}
            }
        });

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double input_kg = Double.parseDouble(unit.getText().toString());
                    double ans_gram = input_kg * 1000;
                    answer.setText("Value in Grams: " + Double.toString(ans_gram) + "g");
                }
                catch(Exception e)
                {}
            }
        });
    }
}
