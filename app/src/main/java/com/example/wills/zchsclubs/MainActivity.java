package com.example.wills.zchsclubs;

import android.widget.RadioButton;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        // @Override
        //  public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        // });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    //ListScroll variables
    ListView listView;
    ArrayList<String> myData;
    ArrayAdapter<String> myArrayAdapter;
    TextView myTextView;

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_home) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new FirstFragment())
                    .commit();
        }
        else if (id == R.id.nav_catalogue) {
            Intent myIntent = new Intent(MainActivity.this, ListScroll.class);
            startActivity(myIntent);
        }
        else if (id == R.id.nav_quiz) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new Question1())
                    .commit();
            View title = findViewById(R.id.Title);
            title.setVisibility(View.GONE);
            View about = findViewById(R.id.about);
            about.setVisibility(View.GONE);
            View logo = findViewById(R.id.imageView);
            logo.setVisibility(View.GONE);
            View codeon = findViewById(R.id.codeon);
            codeon.setVisibility(View.GONE);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }










    //**************************************************************************************
    //Quiz implementation
    //**************************************************************************************


    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q1o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q1o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q1o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q2o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q2o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q2o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q3o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q3o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q3o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q4o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q4o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q4o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q5o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q5o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q5o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q6o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q6o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q6o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q6o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q7o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q7o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q7o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q7o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q8o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q8o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q8o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q8o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q9o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q9o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q9o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q9o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }
    public void onRadioButtonClicked10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        boolean nextClicked = false;

        //check if the 'next' button has been clicked;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q10o1:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q10o2:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q10o3:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
            case R.id.q10o4:
                if (checked && nextClicked) {
                    //algorithm implementation
                    break;
                }
        }
    }

    public void onClick1(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next1:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question2())
                        .commit();
        }
    }
    public void onClick2(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next2:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question3())
                        .commit();
        }
    }
    public void onClick3(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next3:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question4())
                        .commit();
        }
    }
    public void onClick4(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next4:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question5())
                        .commit();
        }
    }
    public void onClick5(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next5:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question6())
                        .commit();
        }
    }
    public void onClick6(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next6:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question7())
                        .commit();
        }
    }
    public void onClick7(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next7:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question8())
                        .commit();
        }
    }
    public void onClick8(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next8:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question9())
                        .commit();
        }
    }
    public void onClick9(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.next9:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question10())
                        .commit();
        }
    }

    public void revOnClick2(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back2:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question1())
                        .commit();
        }
    }
    public void revOnClick3(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back3:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question2())
                        .commit();
        }
    }
    public void revOnClick4(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back4:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question3())
                        .commit();
        }
    }
    public void revOnClick5(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back5:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question4())
                        .commit();
        }
    }
    public void revOnClick6(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back6:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question5())
                        .commit();
        }
    }
    public void revOnClick7(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back7:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question6())
                        .commit();
        }
    }
    public void revOnClick8(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back8:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question7())
                        .commit();
        }
    }
    public void revOnClick9(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back9:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question8())
                        .commit();
        }
    }
    public void revOnClick10(View view){
        FragmentManager fragmentManager = getFragmentManager();

        switch (view.getId()) {
            case R.id.back10:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new Question9())
                        .commit();
        }
    }


    public void submit(View view){
        switch (view.getId()) {
            case R.id.next10:
                Intent myIntent = new Intent(MainActivity.this, DisplayResults.class);
                startActivity(myIntent);
        }
    }



    public ArrayList<String> getResults(int countervar1, int countervar2, int countervar3, int countervar4, int dayofweek){
        ArrayList<String> results = new ArrayList<String>();
        //algorithm implementation
        return results;
    }


}