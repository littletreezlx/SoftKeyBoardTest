package com.example.ford_macbookair_1.softkeyboardtest;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;

public class MyBaseInputConnection extends BaseInputConnection {

    public static String tx="";


    public MyBaseInputConnection(View targetView, boolean fullEditor) {
        super(targetView, fullEditor);
    }

    //输入法程序就是通过调用这个方法把最终结果输出来的
    @Override
    public boolean commitText(CharSequence text, int newCursorPosition) {
        tx = text.toString();
        return true;
    }
}
