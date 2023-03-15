package com.labs.javalab4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4_var1);

            String[] strArray = new String[250];
            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = "Число №" + (i + 1);
            }

            ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strArray);
            ((ListView) findViewById(R.id.LVR)).setAdapter((adapter));

        }
}
