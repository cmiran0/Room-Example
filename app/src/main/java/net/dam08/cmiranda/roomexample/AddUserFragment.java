package net.dam08.cmiranda.roomexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AddUserFragment extends Fragment {
    private EditText userId, userName, userEmail;
    private Button btnSave;

    public AddUserFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        userId = view.findViewById(R.id.txt_id);
        userName = view.findViewById(R.id.txt_name);
        userEmail = view.findViewById(R.id.txt_email);
        btnSave = view.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userid = userId.getText().toString();
                String username = userName.getText().toString();
                String useremail = userEmail.getText().toString();

                User user = new User(userid,username,useremail);


                MainActivity.myAppDataBase.myDao().addUser(user);
                Toast.makeText(getActivity(), "OK", Toast.LENGTH_SHORT).show();
                userId.setText("");
                userName.setText("");
                userEmail.setText("");
            }
        });
        return view;
    }


}
