package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView First = (TextView)findViewById(R.id.menu_item_1);
        String First1 = First.getText().toString();
        Log.v("MainActivity",First1);

        TextView Sec = (TextView)findViewById(R.id.menu_item_2);
        String Sec1 = Sec.getText().toString();
        Log.v("MainActivity",Sec1);

        TextView Third = (TextView)findViewById(R.id.menu_item_3);
        String Third1 = Third.getText().toString();
        Log.v("MainActivity",Third1);
    }
}