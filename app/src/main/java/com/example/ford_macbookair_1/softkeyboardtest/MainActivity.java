package com.example.ford_macbookair_1.softkeyboardtest;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final InputMethodManager inputMethodManager = (InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE);

        final ResultReceiver resultReceiver = new ResultReceiver(new Handler(){
            public void handleMessage(Message msg) {
            }
        });

        editText = findViewById(R.id.main_edt);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    editText.requestFocus();
//                    inputMethodManager.showSoftInput(editText,0,resultReceiver);
                } else {

                }
            }
        });



//        inputMethodManager.showSoftInput();



    }
}
