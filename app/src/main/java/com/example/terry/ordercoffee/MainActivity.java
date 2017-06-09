package com.example.terry.ordercoffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Continue(View V)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

        startActivity(intent);
    }

     public void Cancel(View v){
         finish();
     }

}
