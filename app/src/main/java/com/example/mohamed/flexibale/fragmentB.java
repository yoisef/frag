package com.example.mohamed.flexibale;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mohamed on 30/10/2017.
 */

public class fragmentB extends Fragment {
    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragb,container,false);
        text=view.findViewById(R.id.texo);
        return view;
    }
    public void changedata(int index)
    {
        Resources res=getResources();
       String[]az= res.getStringArray(R.array.description);
        text.setText(az[index]);
    }
}
