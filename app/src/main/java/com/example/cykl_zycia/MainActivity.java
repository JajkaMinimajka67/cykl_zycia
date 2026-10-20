package com.example.cykl_zycia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button buttonPlus, buttonMinus;
    TextView textViev;

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
        if (savedInstanceState != null) {
            punkty = savedInstanceState.getInt("PUNKTY",0);
        }

        buttonPlus = findViewById(R.id.button);
        buttonMinus = findViewById(R.id.button2);
        textViev = findViewById(R.id.textvievpunkty);
        textViev.setText(punkty+"");

        buttonPlus.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textViev.setText(String.valueOf(punkty));
                    }
                }
        );
        buttonMinus.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        punkty--;
                        textViev.setText(String.valueOf(punkty));
                    }
                }
        );
        Log.i("Czas", "wywolana metoda onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Czas", "wywolana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Czas", "wywolana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Czas", "wywolana metoda onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Czas", "wywolana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Czas", "wywolana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Czas", "wywolana metoda onDestroy");
    }
    // NIE WOLNO WYWOLYWAC METOD CYKLU ZYCIA AKTYWNOSCI !!!
    // https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pl

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Czas", "wywolana metoda onSave");
        outState.putInt("PUNKTY", punkty);
    }
}