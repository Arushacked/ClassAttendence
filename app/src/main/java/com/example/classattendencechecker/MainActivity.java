package com.example.classattendencechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Problem(Error in Edit text Casting :- Saying that we are doing the casting on a null object!)

    EditText username = (EditText ) findViewById( R.id.usernameEditText);
    String name = username.getText().toString();
    public final static String MESSAGE_KEY ="ganeshannt.senddata.message_key";
    public void start(View view,String name){
        Intent page = new  Intent(getBaseContext() , start.class);
        page.putExtra(MESSAGE_KEY,name);
        startActivity(page);
        Log.i("Info", "Button Pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
