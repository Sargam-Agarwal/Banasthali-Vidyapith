package com.sargam.banasthalicollege.banasthalividyapith;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView mBottomNavBar = findViewById(R.id.bottom_nav_bar);
        mBottomNavBar.setOnNavigationItemSelectedListener(this);
        fragment = new Fragment();
        fragment = new NoticesFragment();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        int id = item.getItemId();

        switch(id){

            case R.id.notices_menu_item :
                fragment = new NoticesFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                break;

            case R.id.qa_menu_item :
                fragment = new QAFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                break;

            case R.id.talent_menu_item :
                fragment = new TalentFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                break;

            case R.id.sell_menu_item :
                fragment = new SellFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                break;

            case R.id.search_menu_item :
                fragment = new SearchFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
                break;


        }
        return true;
    }
}
