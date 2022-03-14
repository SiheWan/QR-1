package com.example.qrhunter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {
    SharedData appData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // get the name of the user and show on the top
        //SharedData appData = (SharedData) getApplication();
        //TextView userName = findViewById(R.id.userName);
        //userName.setText(appData.getUsername());
        //Intent intent = getIntent();
       // String searchName= (String)intent.getStringExtra()getExtras("username");

        appData = (SharedData) getApplication();
        String searchName = appData.getSearchname();
        TextView textView = (TextView) findViewById(R.id.txtUsername);
        textView.setText(searchName);

        final Button codeButton = findViewById(R.id.btnUserCode);
        codeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, UserCode.class);
                startActivity(intent);
            }
        });

        final Button backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        EditText email = findViewById(R.id.emailEdit);
        Button edit = findViewById(R.id.edit_button);
    }

}