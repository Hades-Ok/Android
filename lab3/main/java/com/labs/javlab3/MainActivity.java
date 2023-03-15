package com.labs.javlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SeekBar)findViewById(R.id.seekBar2)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                View btn = findViewById(R.id.button2);
                btn.setX(progress/100.f*seekBar.getWidth()-btn.getWidth()/2.f);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    public void onSwitchClick(View view){
        boolean checked = ((Switch) view).isChecked();
        findViewById(R.id.button3).setVisibility(checked?View.VISIBLE:View.GONE);
    }
    public void onEditText_click_setBtnText(View view){
        ((Button)findViewById(R.id.button2)).setText(((EditText)view).getText());
    }

}