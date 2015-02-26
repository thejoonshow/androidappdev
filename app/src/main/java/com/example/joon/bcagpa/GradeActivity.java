package com.example.joon.bcagpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Joon on 2/11/2015.
 */
public class GradeActivity extends ActionBarActivity {
    private String[] login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        login = getIntent().getStringArrayExtra(Intent.EXTRA_USER);
    }
}
