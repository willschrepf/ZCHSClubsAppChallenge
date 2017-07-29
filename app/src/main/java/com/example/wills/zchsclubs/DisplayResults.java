package com.example.wills.zchsclubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayResults extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayList<String> myData;
    ArrayAdapter<String> myArrayAdapter;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInsuranceState) {
        super.onCreate(savedInsuranceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.results);


        listView = (ListView) findViewById(R.id.clublistresults);
        myTextView = (TextView) findViewById(R.id.clubinformationresults);
        myData = new ArrayList<String>();


        for (int i = 0; i < 15; i++) {
            myData.add("Item" + (i + 1));
        }

        //the for loop is a placeholder for now, but what will really happen is:
        //myData = MainActivity.getResults()

        myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myData);

        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(this);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent(DisplayResults.this, MainActivity.class);
                startActivity(myIntent);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String myItemSelected;
        myItemSelected = (String) parent.getItemAtPosition(position).toString();
        myTextView.setText(myItemSelected + "Information");
    }
}
