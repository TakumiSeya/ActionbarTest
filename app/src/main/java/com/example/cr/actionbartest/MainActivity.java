package com.example.cr.actionbartest;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("タイトルを変更する");
        button.setOnClickListener(this);

        setContentView(button);
    }

    @Override
    public void onClick(View v) {
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Hello, ActionBar!!");
        actionBar.setSubtitle("and, subtitle!!");
    }
}
