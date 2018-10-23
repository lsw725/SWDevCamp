package com.swdevcamp.jun.swdevcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,LoadingActivity.class);
        startActivity(intent);

        RecyclerView recyclerView = findViewById(R.id.data_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);



        ArrayList<DataCardItem> items = new ArrayList<>();
        PersonalDataCardAdapter adapter = new PersonalDataCardAdapter(getApplicationContext(),items,R.layout.activity_main);
        items.add(new DataCardItem(R.drawable.capture1,"capture1"));
        items.add(new DataCardItem(R.drawable.capture1,"capture2"));
        items.add(new DataCardItem(R.drawable.capture1,"capture3"));
        items.add(new DataCardItem(R.drawable.capture1,"capture4"));

        recyclerView.setAdapter(adapter);
    }
}
