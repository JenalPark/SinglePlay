package com.tacademy.singleplay.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tacademy.singleplay.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConcertFragment extends Fragment {


    public ConcertFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_concert, container, false);
    }

}
