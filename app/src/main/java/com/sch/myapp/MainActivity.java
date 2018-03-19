package com.sch.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.annotations.SerializedName;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

class Foo {
    @SerializedName("field")
    private String field;

    public String getField() {
        return field;
    }
}