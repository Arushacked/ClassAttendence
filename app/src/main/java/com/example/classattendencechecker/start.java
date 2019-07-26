package com.example.classattendencechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class start extends AppCompatActivity {
    //Problem(Error in TExt text Casting :- Saying that we are doing the casting on a null object!)

    TextView intro = (TextView) findViewById(R.id.textView);
    public final static String MESSAGE_KEY ="ganeshannt.senddata.message_key";
    String username = "";
    public void add(View view){
        Intent start = new Intent(getBaseContext(),MainActivity.class);
        startActivity(start);
        Toast.makeText(this, "Added", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent intent = getIntent();
        username = intent.getStringExtra(MESSAGE_KEY);
        intro.setText("Hello "+ username);
    }
}
