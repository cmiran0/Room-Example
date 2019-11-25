package net.dam08.cmiranda.roomexample;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {
    private TextView txtInfo;

    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);
        txtInfo = view.findViewById(R.id.textView);
        List<User> users = MainActivity.myAppDataBase.myDao().getUsers();
        String info = "";
        for (User u : users) {
            info += "\n\nId: " + u.getId() + "\nName: " + u.getName() + "\nEmail: " + u.getEmail();
        }
        txtInfo.setText(info);
        return view;
    }

}
