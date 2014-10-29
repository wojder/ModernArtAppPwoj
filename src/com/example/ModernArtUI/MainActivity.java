package com.example.ModernArtUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
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

                AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
                LayoutInflater inflater = this.getLayoutInflater();
                builder
//                        .setMessage(R.string.builder_message)
                          .setPositiveButton(R.string.positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        startActivity(new Intent(MainActivity.this,WebActivity.class));
                    }
                }).setNegativeButton(R.string.negative, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                     }
                })
                  .setView(inflater.inflate(R.layout.dialog_view, null));
                AlertDialog alert = builder.create();
                alert.show();

                Button buttonNeg = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
                buttonNeg.setBackgroundColor(Color.parseColor("#A41900"));

                Button buttonPos = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                buttonPos.setBackgroundColor(Color.parseColor("#A41900"));

                return true;

            default:
                return false;
        }
    }
}
