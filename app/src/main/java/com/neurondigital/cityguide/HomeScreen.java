package com.neurondigital.cityguide;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.BaseSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.SearchResultListener;
import ir.mirrajabi.searchdialog.core.Searchable;

public class HomeScreen extends AppCompatActivity {
//    AppCompatActivity activity;
    ImageButton imageButton1;
    Button button_search;
//    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        button_search=(Button)findViewById(R.id.btn_search);

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,MainActivity.class));
            }
        });

//        editText=(EditText)findViewById(R.id.mainFragment);



    }





//    public void changeFragment(Fragment fragment) {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.mainFragment, fragment);
//        transaction.commit();
//        activity.invalidateOptionsMenu();
//    }
//
//    public void onBackPressed() {
//        //if stack has items left
//        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
//            //get current fragment
//            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.mainFragment);
//
//            //only close if in CategoryFragment else go to CategoryFragment
//            if (fragment instanceof SearchFragment) {
//                finish();
//            } else {
//                changeFragment(new SearchFragment());
//            }
//        } else {
//            super.onBackPressed();
//        }
//    }
}
