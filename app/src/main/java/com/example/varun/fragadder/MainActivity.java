package com.example.varun.fragadder;

import android.app.Fragment;
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
        Fragment1 a = new Fragment1();
        String s ="This is my fav colour";

        Bundle bundle = new Bundle();
        bundle.putString("s",s);
        bundle.putInt("done",1);

        a.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.container1,a).commit();
    }

    @Override
    public void createAndAddFragment4() {
        Fragment4 b=new Fragment4();
        getSupportFragmentManager().beginTransaction().replace(R.id.container4, b).commit();

    }
}
