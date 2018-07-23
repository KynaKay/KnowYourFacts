package sg.edu.rp.knowyourfacts_p10;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    Button btnChangeColour;

    public Frag3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View fragmentView = inflater.inflate(R.layout.fragment_1, container, false);
        btnChangeColour = fragmentView.findViewById(R.id.btnColor);
        btnChangeColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomColour = new Random();
                fragmentView.setBackgroundColor(Color.rgb(randomColour.nextInt(256), randomColour.nextInt(256), randomColour.nextInt(256)));
            }
        });
        return fragmentView;
    }

}
