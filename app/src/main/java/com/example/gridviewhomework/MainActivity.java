package com.example.gridviewhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.gridviewhomework.adapter.ProductAdapter;
import com.example.gridviewhomework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> products = new ArrayList<Product>();
    ProductAdapter productAdapter;
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        productAdapter = new ProductAdapter(products, this);
        gridView.setAdapter(productAdapter);

        getProducts();

    }

    private void getProducts() {
        for (int i = 0; i < 50; i++) {
            products.add(new Product(
                    R.drawable.fish,
                    "Salon Cambodia style" + i,
                    20f
            ));
            products.add(new Product(
                    R.drawable.mediterranean_salad,
                    "Salon Cambodia style" + i,
                    20f
            ));
            products.add(new Product(
                    R.drawable.pizza,
                    "Salon Cambodia style" + i,
                    20f
            ));
            products.add(new Product(
                    R.drawable.khmer_food,
                    "Salon Cambodia style" + i,
                    20f
            ));
        }
    }
}