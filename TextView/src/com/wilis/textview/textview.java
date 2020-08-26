package com.wilis.textview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class textview extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView t=(TextView)findViewById(R.id.tulisan);
        t.setText("Ini adalah tulisan dengan widget TextView");
    }
}