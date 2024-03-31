package com.example.navigationbar_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationBarView nav = findViewById(R.id.bottom_navigation);

        NavigationBarView.OnItemSelectedListener listener = new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.item_1){

                    // type code here!
                    Toast.makeText(MainActivity.this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }

                else if (item.getItemId() == R.id.item_2){

                    //type code here!
                    Toast.makeText(MainActivity.this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }

                else return false;
            }
        };

        nav.setOnItemSelectedListener(listener);

    }

}