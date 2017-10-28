package com.neurondigital.cityguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeSearch extends AppCompatActivity {


    AppCompatActivity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search);
    }


    public void changeFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFragment, fragment);
        transaction.commit();
        activity.invalidateOptionsMenu();
    }

    /**
     * On back pressed, always go to home fragment before closing
     */
    @Override
    public void onBackPressed() {
        //if stack has items left
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            //get current fragment
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.mainFragment);

            //only close if in CategoryFragment else go to CategoryFragment
            if (fragment instanceof SearchFragment) {
                finish();
            } else {
                changeFragment(new SearchFragment());
            }
        } else {
            super.onBackPressed();
        }
    }

}

