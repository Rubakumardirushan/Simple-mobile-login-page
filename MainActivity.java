package com.example.newwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onsubmit(View view){
        EditText user=findViewById(R.id.editTextTextPersonName2);
        EditText pass =findViewById(R.id.editTextTextPassword);
        TextView text=findViewById(R.id.textView2);
        text.setText("hello "+user.getText().toString()+" login complete");
    }

}