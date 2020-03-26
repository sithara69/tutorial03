package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    public Fragment fragment1, fragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view) {


        if (view == findViewById(R.id.btn1)) {
            fragment1 = new Fragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment1);
            ft.commit();
        }
        if (view == findViewById(R.id.btn2)) {
            fragment2 = new Fragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment2);
            ft.commit();


        }
    }

}
