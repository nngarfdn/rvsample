package com.android.rvsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private FruitAdapter fruitAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits.add(new Fruit("Apel","Biru"));
        fruits.add(new Fruit("Jeruk","Biru"));
        fruits.add(new Fruit("Mangga","Biru"));
        fruits.add(new Fruit("Semangka","Biru"));

        fruitAdapter = new FruitAdapter(this, fruits);
        recyclerView = findViewById(R.id.recycler_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(fruitAdapter);

    }
}