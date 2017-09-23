package com.example.arturmusayelyan.intentforesultexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class B extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        String message=editText.getText().toString();
        intent.putExtra("Kay",message);
        setResult(RESULT_OK,intent);
        finish();
    }
}
