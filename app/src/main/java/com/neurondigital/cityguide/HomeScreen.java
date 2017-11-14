package com.neurondigital.cityguide;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
    ImageButton button_shoping,button_home,button_donate;



    Button button_search,button_donat ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);



//        mywebview = (WebView) findViewById(R.id.webView1);
//        mywebview.setWebViewClient(new MyWebViewClient());
//
//        String url="http://d24.co.in/";
//        mywebview.getSettings().setJavaScriptEnabled(true);
//        mywebview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
//        mywebview.loadUrl(url);



        button_donat=(Button)findViewById(R.id.button_dnt);
        button_search=(Button)findViewById(R.id.btn_search);

       // button_shoping=(ImageButton)findViewById(R.id.imageButton_shpng);
//        button_home=(ImageButton)findViewById(R.id.imageButton_home);
        //button_donate=(ImageButton)findViewById(R.id.imageButton_donate);



        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,MainActivity.class));
            }
        });

//        button_home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        button_shoping.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(HomeScreen.this,NewsFragment.class));
//
//            }
//        });

        button_donat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,Donate.class));

            }
        });



//        private class MyWebViewClient extends WebViewClient {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                progressDialog = new ProgressDialog(HomeScreen.this);
//                progressDialog.setMessage("Please wait ...");
//                progressDialog.setProgressStyle(90);
//                progressDialog.show();
//            }
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                if (progressDialog != null) {
//                    progressDialog.dismiss();
//                }
//            }
//        }




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
