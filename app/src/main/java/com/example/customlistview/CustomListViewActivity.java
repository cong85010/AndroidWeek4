package com.example.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {
    private List<Product> listProduct;
    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_gridview);
        listView = findViewById(R.id.idListView);
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Nồi Com Dien", "TC"));
        listProduct.add(new Product(2, "Xe máy móc", "TC 1"));
        listProduct.add(new Product(3, "Thực Phẩm", "TC 1"));
        listProduct.add(new Product(4, "Sách Nha Tu Tong", "TC 2"));
        listProduct.add(new Product(5, "Sách Nha Dau Tu", "TC 3"));
        listProduct.add(new Product(6, "Ca cau 4", "TC 3"));
        listProduct.add(new Product(7, "Ca cau 4", "TC 3"));
        listProduct.add(new Product(8, "Ca cau 4", "TC 3"));

        ProductAdapter productAdapter = new ProductAdapter(this, R.layout.item_gridview, listProduct);
        listView.setAdapter(productAdapter);


    }
}
