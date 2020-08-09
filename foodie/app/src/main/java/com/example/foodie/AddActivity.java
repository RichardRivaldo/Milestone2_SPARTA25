package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        if (getIntent().hasExtra("com.example.foodie.yes")) {
            TextView tv = (TextView) findViewById(R.id.textView2);
            String text = getIntent().getExtras().getString("com.example.foodie.yes");
            tv.setText(text);


        }
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddActivity.this, MainActivity.class));
                //EditText foodInput = (EditText) findViewById(R.id.foodInput);
               // String input = foodInput.getText().toString();

               // Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
               // startIntent.putExtra("com.example.foodie.SOMETHING", input);
                //startActivity(startIntent);
            }
        });
    }
}