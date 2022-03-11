package com.example.viikko74;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.text.Editable;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText inText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textField);
        inText = findViewById(R.id.inputField);
        inText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                text.setText(inText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}