package com.example.madhu.navigation_project;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
    String[] menu;
    DrawerLayout dLayout;
    ListView dList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        menu = new String[]{"Home","Android","Windows","Linux","Raspberry Pi","WordPress","Videos","Contact Us"};
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        dList = (ListView) findViewById(R.id.left_drawer);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);

        dList.setAdapter(adapter);
        dList.setSelector(android.R.color.holo_blue_dark);

        dList.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {

                dLayout.closeDrawers();
                Bundle args = new Bundle();
                args.putString("Menu", menu[position]);
                Fragment detail = new details_fragment();
                detail.setArguments(args);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, detail).commit();

            }

        });
    }



}