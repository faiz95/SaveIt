package com.example.loinguyen.webtest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

//this is another class created in the same project
public class WebAppInterface {
    private Context context;
    public WebAppInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String toast)
    {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public boolean checkSave(String[] paths, String[] undone)
    {
        if(paths != null && undone != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
