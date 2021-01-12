package com.yoking.fourth_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.yoking.MultiScreen_app.ORDER";
    public void onPlaceOrderClick(View view){
        //when clicked new Activity is to be opened
        //Intent-->Object which helps in binding while running app
        //WHat is intention of the app?like helps in communication between two components
        //like one activity to other activity
        //Build an intent to open another activity
        Intent intent=new Intent(this,OrderActivity.class);
        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);
        EditText editText3=findViewById(R.id.editText3);
        String message=editText1.getText().toString()+", "+editText2.getText().toString()+" & "
                +editText3.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}