package com.example.customlistview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomGridViewActivity extends AppCompatActivity {
    private List<ProductNew> listProduct;
    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_gridview);
        gridView = findViewById(R.id.idGridview);
        listProduct = new ArrayList<ProductNew>();
        listProduct.add(new ProductNew(1, "Nồi Com Dien", 20000, 30));
        listProduct.add(new ProductNew(2, "Nồi Com Dien1 ", 20000, 30));
        listProduct.add(new ProductNew(3 ,"Nồi Com Dien 2", 20000, 30));
        listProduct.add(new ProductNew(4, "Nồi Com Dien 3", 20000, 30));
        listProduct.add(new ProductNew(5, "Nồi Com Dien 4", 20000, 30));


        ProductAdapterNew productAdapter = new ProductAdapterNew(this, R.layout.item_gridview, listProduct);
        gridView.setAdapter(productAdapter);


    }
}
