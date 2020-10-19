package com.example.tourtorome;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar toolbar;
    private DrawerLayout nav_drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav_drawer = findViewById(R.id.navigation_container);
        ActionBarDrawerToggle onToggle = new ActionBarDrawerToggle(this, nav_drawer, toolbar, R.string.Navigation_drawer_open, R.string.Navigation_drawer_close);
        nav_drawer.addDrawerListener(onToggle);
        onToggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);

        //Assigning Default Home Page
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.home);
        }
    }


    @Override
    public void onBackPressed() {
        if (nav_drawer.isDrawerOpen(GravityCompat.START)) {
            nav_drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new HomeFragment()).commit();
                toolbar.setTitle(R.string.home);
                break;
            case R.id.hotel:
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new HotelFragment()).commit();
                toolbar.setTitle(R.string.hotel);
                break;
            case R.id.cafe:
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new RestaurantFragment()).commit();
                toolbar.setTitle(R.string.cafe_amp_restaurant);
                break;
            case R.id.festival:
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, new FestivalFragment()).commit();
                toolbar.setTitle(R.string.event_and_festivals);
                break;

        }
        nav_drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}