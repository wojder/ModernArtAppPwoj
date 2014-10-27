package com.example.ModernArtUI;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by wojder on 27.10.14.
 */
public class NewWebViewClient extends WebViewClient {

private static final String TAG = "Hello NewWebClient";

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.i(TAG, "About to load: "+url);
        view.loadUrl(url);
        return true;
    }
}
