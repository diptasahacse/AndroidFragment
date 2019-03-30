package com.example.user.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewid);
        String [] membername = getResources().getStringArray(R.array.member);
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,membername);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        if(position == 0)
        {
            Fragment fragment;
            fragment = new DiptaFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();

        }
        else if(position == 1)
        {
            Fragment fragment;
            fragment = new KeyaFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();

        }
        else if(position == 2)
        {
            Fragment fragment;
            fragment = new AmareshFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();

        }
        else if(position == 3)
        {
            Fragment fragment;
            fragment = new ShusmitaFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();

        }
        else if(position == 4)
        {
            Fragment fragment;
            fragment = new AditiFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();

        }




    }
}
