package com.example.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by santosh on 23/8/17.
 */

public class CustomView extends LinearLayout implements View.OnClickListener {

    private CustomViewListener customViewListener;
    private EditText mTextView;
    private ImageView mImageView;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }


    private void init() {
        inflate(getContext(), R.layout.custom_layout, this);
        this.mTextView = findViewById(R.id.text_view);
        this.mImageView = findViewById(R.id.image_view);
        mTextView.setOnClickListener(this);
        mImageView.setOnClickListener(this);
    }

    public String editTextGetValue() {
        return mTextView.getText().toString();
    }

    public void setOnClickListener(CustomViewListener customViewListener) {
        this.customViewListener = customViewListener;
    }

    @Override
    public void onClick(View view) {
        customViewListener.onClickOnText();
    }
}
