package com.example.loinguyen.webtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing WebView
        android.webkit.WebView wv = findViewById(R.id .web1);

        //Edited WebView Setting
        //Enable Javascript to work on the web page
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(false);
        wv.setScrollBarStyle(android.webkit.WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        wv.setScrollbarFadingEnabled(false);
        //wv.getSettings().setAllowContentAccess();
        //wv.getSettings().setAllowFileAccess();
        //wv.getSettings().setDatabaseEnabled();
        //wv.getSettings().setDomStorageEnabled();

        //Allow access between the javascript code with this code with identifier "Android"
        wv.addJavascriptInterface(new WebAppInterface(this),"Android");
        //Using chrome instead of default web browser, internet explore
        wv.setWebChromeClient(new android.webkit.WebChromeClient());
        //website for the app to load to
        wv.loadUrl("http://save-it-test.surge.sh/");
        //https://www.youtube.com/watch?v=9RwJeocTgJg
    }
}
