package com.example.gridviewhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gridviewhomework.model.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Product p1 = new Product(1, "1","2",1f);
    }
}