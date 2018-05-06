package com.example.ashu.babypi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        webView=findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());


        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://10.1.201.162:5000");



    }
}
