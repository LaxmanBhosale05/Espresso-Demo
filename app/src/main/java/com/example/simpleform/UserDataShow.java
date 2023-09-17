package com.example.simpleform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

public class UserDataShow extends AppCompatActivity {

    private TextView t;
    DatabaseHelper db = new DatabaseHelper(this);
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data_show);

        t = findViewById(R.id.showUsers);
        t.setMovementMethod(new ScrollingMovementMethod());

        List<User> users_data = db.getAllUsers();

        for (User u : users_data) {
            String log = "User is added Successfully";
            text = text + log;
        }
        t.setText(text);
    }
}