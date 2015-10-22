package com.timmyleahy.udacity.android.portfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        for (int buttonId :
                new int[]{R.id.spotifyStreamerButton, R.id.superDuoButton, R.id.buildItBiggerButton,
                        R.id.xyzReaderButton, R.id.capstoneButton}) {
            final Button buttonView = (Button) rootView.findViewById(buttonId);
            buttonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), String.format(getString(R.string.toastMessage), buttonView.getText()),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        return rootView;
    }


}
