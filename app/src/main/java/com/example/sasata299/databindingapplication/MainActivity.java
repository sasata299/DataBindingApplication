package com.example.sasata299.databindingapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sasata299.databindingapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setFirstName("Test");
        user.setLastName("User");

        binding.setUser(user);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                user.setFirstName("aaa");
            }
        });
    }
}
