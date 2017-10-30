package com.example.mohamed.flexibale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Anotheractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotheractivity);

        Intent intent=getIntent();
       int index= intent.getIntExtra("index",0);
        fragmentB f2= (fragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if (f2!=null)
        f2.changedata(index);
    }
}
