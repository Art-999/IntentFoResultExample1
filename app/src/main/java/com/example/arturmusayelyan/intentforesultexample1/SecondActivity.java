package com.example.arturmusayelyan.intentforesultexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = (EditText) findViewById(R.id.editText);
    }


    public void onClick(View view) {
        //Intent intent=new Intent(getApplicationContext(),FirstActivity.class);
        Intent intent = getIntent();
        String message = editText.getText().toString();
        intent.putExtra(FirstActivity.KAY_1, message);
        setResult(RESULT_OK, intent);
        finish();
    }
}
