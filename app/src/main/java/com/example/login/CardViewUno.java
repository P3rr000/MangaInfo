package com.example.login;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardViewUno extends Activity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardviewuno);

        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("Berserk"));
        elements.add(new ListElement("One Punch Man"));
        elements.add(new ListElement("Vagabond"));
        elements.add(new ListElement("Dragon Ball Super"));
        elements.add(new ListElement("Rikudo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}