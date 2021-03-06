package com.beoptimist.android.adhkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class page221 extends AppCompatActivity {

    Button button;
    View left,right;
    ImageButton back;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page221);

        back = findViewById(R.id.back);
        button = findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page221.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter += 1;
                if (counter == 3) {
                    Intent intent = new Intent(page221.this, page222.class);
                    startActivity(intent);
                }
                display(counter);
            }
        });

        left = findViewById(R.id.view_left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page221.this, page222.class);
                startActivity(intent);
            }
        });
        right = findViewById(R.id.view_right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page221.this, page220.class);
                startActivity(intent);
            }
        });
    }
    private void display(int number) {
        TextView TextView = findViewById(R.id.counter);
        TextView.setText("" + number);
    }
}
