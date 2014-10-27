package com.example.ModernArtUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    WebView webview;
    String url = "http://www.google.pl";
   String str = "fuck it";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_settings2:

//                Dialog dialog = new Dialog(MainActivity.this);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setMessage(R.string.builder_message).setPositiveButton(R.string.positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        startActivity(new Intent(MainActivity.this,MenuActivity.class));

//                            webview = (WebView) findViewById(R.layout.webview);
//                            webview.setWebViewClient(new NewWebViewClient());
//                            webview.getSettings().setJavaScriptEnabled(true);
//                            webview.loadUrl(url);

                    }
                })

                        .setNegativeButton(R.string.negative, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }

                        })
                        .setTitle(R.string.builder_title);
                AlertDialog alert = builder.create();
//               builder.create();
                alert.show();
                return true;


//               Dialog dialog = new Dialog(MainActivity.this);
//
//               dialog.setContentView(R.layout.maindialog);
//
//               Window window = dialog.getWindow();
//               window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
//               window.setGravity(Gravity.CENTER);
//               dialog.show();
//               return true;
            default:
                return false;
        }
    }




//    //create context menu
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
//        super.onCreateContextMenu(menu, v, menuInfo);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.test_menu, menu);
//            }
//
//    public boolean onContextItemSelected(MenuItem item){
//
//        switch (item.getItemId()) {
//
//            case R.id.action_settings2:
//                startDialog();
//                return true;
//            default: return false;
//        }
//    }
}
