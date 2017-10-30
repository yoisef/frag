package com.example.mohamed.flexibale;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mohamed on 30/10/2017.
 */

public class fragmentA extends Fragment implements AdapterView.OnItemClickListener {
    ListView list;
    communicator comma;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fraga,container,false);
        view.findViewById(R.id.liste);
        ArrayAdapter ad= ArrayAdapter.createFromResource(getActivity(),R.array.items,android.R.layout.simple_list_item_1);
        list.setAdapter(ad);
        list.setOnItemClickListener(this);
        return view;
    }




    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comma.respond(i);

    }

    public interface communicator{
        public void respond(int index);
    }
    public void setcommunicator(communicator c)
    {
        this.comma=c;
    }
}
