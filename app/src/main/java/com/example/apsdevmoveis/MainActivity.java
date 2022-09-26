package com.example.apsdevmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Dice dice = new Dice();

    public void clearAll (View view){
        dice.clearAll();

        TextView amountView = findViewById(R.id.dices_amount);
        amountView.setText(String.valueOf(dice.getAmount()));

        TextView resultsView = findViewById(R.id.roll_result);
        resultsView.setText("Role os dados para ver os resultados");

        TextView hitsView = findViewById(R.id.hits);
        hitsView.setText(String.valueOf(dice.getHits()));
    }

    public void increaseDices (View view) {
        if (dice.getAmount() < 5) {
            dice.increaseDices();
        }

        TextView amountView = findViewById(R.id.dices_amount);
        amountView.setText(String.valueOf(dice.getAmount()));
    }

    public void decreaseDices (View view){
        if (dice.getAmount() > 1) {
            dice.decreaseDices();
        }

        TextView amountView = findViewById(R.id.dices_amount);
        amountView.setText(String.valueOf(dice.getAmount()));
    }

    public void roll(View view){
        int[] rolls = dice.roll();

        TextView resultsView = findViewById(R.id.roll_result);
        resultsView.setText(Arrays.toString(rolls));

        TextView hitsView = findViewById(R.id.hits);
        hitsView.setText(String.valueOf(dice.getHits()));
    }
}