package com.example.varun.fragadder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Varun on 1/8/2018.
 */

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        Button button = view.findViewById(R.id.btnpurple);
        TextView tv2 = view.findViewById(R.id.tv2);
        Bundle rbundle = getArguments();

//      if(rbundle.getInt("done")==1)
//      {
        if (rbundle.get("s") != null) {
            tv2.setText((CharSequence) rbundle.get("s"));
        }
//      }
//      else{
        tv2.setText("Click the button below to see text on your favourite colour background");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.container4, new Fragment4()).commit();

            }
        });
 //        }
        return view;
    }

}
