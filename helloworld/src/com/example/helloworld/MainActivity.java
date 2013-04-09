package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
//import android.util.Log;


public class MainActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastBtn=(Button) this.findViewById(R.id.Button02);
        toastBtn.setOnClickListener (new View.OnClickListener() {
    @Override
    public void onClick(View v) {
	    Toast.makeText(MainActivity.this, "¼´½«ÍË³ö", Toast.LENGTH_LONG).show();
                 }
         });
	}
    

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
