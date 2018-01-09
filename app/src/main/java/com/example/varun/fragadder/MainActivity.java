package com.example.varun.fragadder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.container1, new Fragment1()).commit();
    }


    @Override
    public void changeText() {
        Bundle bundle = new Bundle();
        Fragment1 a = new Fragment1();
        String s ="This is mmy fav colour";
        bundle.putString("s",s);
        bundle.putInt("done",1);
        a.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container1,a).commit();
    }
}
