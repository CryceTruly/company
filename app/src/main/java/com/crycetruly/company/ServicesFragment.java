package com.crycetruly.company;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {
private ListView listView;
private String [] services={"Web design","Systems Development","Website Mentenance","Linux Server Admintration",
        "Windows Server Adminstration","Penetration Testing"};


    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_services, container, false);

        listView=view.findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,services));

        return view;
    }

}
