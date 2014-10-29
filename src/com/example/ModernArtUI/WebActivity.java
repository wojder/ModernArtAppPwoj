package com.example.ModernArtUI;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by wojder on 23.10.14.
 */
public class WebActivity extends Activity{

    WebView webview;
    private String url = "http:/www.moma.org";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new NewWebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }
}
