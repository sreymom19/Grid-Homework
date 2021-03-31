package com.example.gridviewhomework.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gridviewhomework.R;
import com.example.gridviewhomework.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    List<Product> products;
    Context context;


    public ProductAdapter(List<Product> products,Context context){
        this.products=products;
        this.context=context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = null;
        if(v==null)
            v= LayoutInflater.from(context)
                    .inflate(R.layout.product_item_layout,viewGroup,false);
        else
            v=view;

        //bind data
        Product product=products.get(i);
        ImageView imageView=v.findViewById(R.id.imageView);
        TextView tvTittle=v.findViewById(R.id.tvTittle);
        TextView tvPrice=v.findViewById(R.id.tvPrice);
        Button btnAddToCart=v.findViewById(R.id.btnAddToCart);

        //set data
        imageView.setImageResource(product.getProductImage());
        tvTittle.setText(product.getProductTitle());
        tvPrice.setText("$"+product.getProductPrice());
        btnAddToCart.setOnClickListener(view1 -> {
            Toast.makeText(context, "Add to Cart"+i, Toast.LENGTH_SHORT).show();
        });

        return v;
    }
}
