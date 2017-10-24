package com.example.asus.math1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DisplayMetrics metrics = new DisplayMetrics();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int DeviceTotalWidth = metrics.widthPixels;
        int DeviceTotalHeight = metrics.heightPixels;
        Button add = (Button)findViewById(R.id.add1);
        Button add2 = (Button)findViewById(R.id.add2);
        Button minus1 = (Button)findViewById(R.id.minus1);
        Button minus2 = (Button)findViewById(R.id.minus2);

        add.setTextSize(DeviceTotalWidth/60);
        add2.setTextSize(DeviceTotalWidth/60);
        minus1.setTextSize(DeviceTotalWidth/60);
        minus2.setTextSize(DeviceTotalWidth/60);

        add.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent1 = new Intent(v.getContext(), addition1.class);
                        startActivity(myIntent1);;
                    }
                }
        );
        add2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent2 = new Intent(v.getContext(), addition2.class);
                        startActivity(myIntent2);
                    }
                }
        );
        minus1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent3 = new Intent(v.getContext(), subtraction1.class);
                        startActivity(myIntent3);
                    }
                }
        );
        minus2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent4 = new Intent(v.getContext(), subtraction2.class);
                        startActivity(myIntent4);
                    }
                }
        );

    }
}
