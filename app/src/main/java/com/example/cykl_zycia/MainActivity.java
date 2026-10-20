package com.example.cykl_zycia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button buttonPlus, buttonMinus;
    View textViev;

    int punkty = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonPlus = findViewById(R.id.button);
        buttonMinus = findViewById(R.id.button2);
        textViev = findViewById(R.id.textvievpunkty);

        buttonPlus.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        punkty++;
                        TextView.setText(String.valueOf(punkty));
                    }
                }
        );
    }
}