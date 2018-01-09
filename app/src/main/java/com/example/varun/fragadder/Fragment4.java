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

public class Fragment4 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4,container,false);
        TextView tv3, tv4;
        tv3 = view.findViewById(R.id.tv3);
        tv3.setText("This is your fav colour");
        tv4 = view.findViewById(R.id.tv4);
        tv4.setText("Click the button below to know my fav colour");
        Button btnred = view.findViewById(R.id.btnred);
        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Communicator communicator = (Communicator) getActivity();

            }
        });
        return view;
    }
}
