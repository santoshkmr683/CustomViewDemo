package com.example.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements CustomViewListener {

    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomView = (CustomView) findViewById(R.id.custom_view_id);
        mCustomView.setOnClickListener(new CustomViewListener() {
            @Override
            public void onClickOnText() {
                Log.d("CLICKED","Text clicked"+mCustomView.editTextGetValue().toString());

            }

            @Override
            public void onClickOnImage() {

            }
        });
    }

    @Override
    public void onClickOnText() {

    }

    @Override
    public void onClickOnImage() {

    }
}
