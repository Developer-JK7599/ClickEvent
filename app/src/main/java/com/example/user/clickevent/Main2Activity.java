package com.example.user.clickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        web=findViewById(R.id.web_id);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        Intent i = getIntent();
       String str_fule = i.getStringExtra("fule");
       String str_sch = i.getStringExtra("sch");
       String str_hsp = i.getStringExtra("hsp");
       String str_puc = i.getStringExtra("puc");

        web.loadUrl(str_fule);
        web.loadUrl(str_sch);
        web.loadUrl(str_hsp);
        web.loadUrl(str_puc);
    }
}
