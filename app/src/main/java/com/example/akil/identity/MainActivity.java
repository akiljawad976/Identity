package com.example.akil.identity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name,roll,batch;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        name = (EditText)findViewById(R.id.editText1);
        roll = (EditText)findViewById(R.id.editText2);
        batch = (EditText)findViewById(R.id.editText3);
        btn = (Button)findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam = name.getText().toString();
                String rol = roll.getText().toString();
                String bat = batch.getText().toString();

                Toast tost = Toast.makeText(getApplicationContext(),"My Name is "+nam+" My Roll Number "+rol+" My Batch "+bat,Toast.LENGTH_LONG);
                tost.show();
            }
        });
    }
}
