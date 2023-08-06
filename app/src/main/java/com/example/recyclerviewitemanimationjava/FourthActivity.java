package com.example.recyclerviewitemanimationjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewitemanimationjava.Adapter.PlaceAdapter1;
import com.example.recyclerviewitemanimationjava.Adapter.PlaceAdapter4;
import com.example.recyclerviewitemanimationjava.Model.Place;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Place> placeList;
    PlaceAdapter4 placeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        recyclerView = findViewById(R.id.recyclerView);
        placeList = new ArrayList<>();
        placeList.add(new Place(R.drawable.img1,"Taj Mahal"));
        placeList.add(new Place(R.drawable.img2,"Eiffel Tower"));
        placeList.add(new Place(R.drawable.img3,"Christ The Redeemer"));
        placeList.add(new Place(R.drawable.img4,"The Great Pyramid of Giza"));
        placeList.add(new Place(R.drawable.img5,"Great Wall of China"));
        placeList.add(new Place(R.drawable.img6,"Colosseum"));
        placeList.add(new Place(R.drawable.img7,"Petra"));

        placeList.add(new Place(R.drawable.img1,"Taj Mahal"));
        placeList.add(new Place(R.drawable.img2,"Eiffel Tower"));
        placeList.add(new Place(R.drawable.img3,"Christ The Redeemer"));
        placeList.add(new Place(R.drawable.img4,"The Great Pyramid of Giza"));
        placeList.add(new Place(R.drawable.img5,"Great Wall of China"));
        placeList.add(new Place(R.drawable.img6,"Colosseum"));
        placeList.add(new Place(R.drawable.img7,"Petra"));

        placeList.add(new Place(R.drawable.img1,"Taj Mahal"));
        placeList.add(new Place(R.drawable.img2,"Eiffel Tower"));
        placeList.add(new Place(R.drawable.img3,"Christ The Redeemer"));
        placeList.add(new Place(R.drawable.img4,"The Great Pyramid of Giza"));
        placeList.add(new Place(R.drawable.img5,"Great Wall of China"));
        placeList.add(new Place(R.drawable.img6,"Colosseum"));
        placeList.add(new Place(R.drawable.img7,"Petra"));

        placeList.add(new Place(R.drawable.img1,"Taj Mahal"));
        placeList.add(new Place(R.drawable.img2,"Eiffel Tower"));
        placeList.add(new Place(R.drawable.img3,"Christ The Redeemer"));
        placeList.add(new Place(R.drawable.img4,"The Great Pyramid of Giza"));
        placeList.add(new Place(R.drawable.img5,"Great Wall of China"));
        placeList.add(new Place(R.drawable.img6,"Colosseum"));
        placeList.add(new Place(R.drawable.img7,"Petra"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        placeAdapter = new PlaceAdapter4(this, placeList);
        recyclerView.setAdapter(placeAdapter);
    }
}