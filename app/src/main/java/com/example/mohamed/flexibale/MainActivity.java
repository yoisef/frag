package com.example.mohamed.flexibale;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragmentA.communicator{

    fragmentA f1;
    fragmentB f2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      f1=  (fragmentA)manager.findFragmentById(R.id.fragment);
        f1.setcommunicator(this);
    }

    @Override
    public void respond(int index) {
        f2=  (fragmentB) manager.findFragmentById(R.id.fragment2);

        if (f2!=null && f2.isVisible())
        {
            f2.changedata(index);
        }
        else
        {
            Intent intent=new Intent(this,Anotheractivity.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }

    }
}
