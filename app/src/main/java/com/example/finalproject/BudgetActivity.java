package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BudgetActivity extends AppCompatActivity {
    Button co,inc,hom,bud,login,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        co = findViewById(R.id.COst1);
        inc = findViewById(R.id.INcome1);
        bud = findViewById(R.id.BUdget1);
        hom = findViewById(R.id.REport1);
        login = findViewById(R.id.login3);
        exit = findViewById(R.id.exit3);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this, CostActivity.class));
            }
        });
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this, IncomeActivity.class));
            }
        });
        bud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this, BudgetActivity.class));
            }
        });
        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this,HomePageActivity.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this, LoginActivity.class));
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


    }
}