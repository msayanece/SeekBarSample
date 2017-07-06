package com.example.admin.seekbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Toast.makeText(this, "onProgressChanged: "+progress, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, "onStartTrackingTouch", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, "onStopTrackingTouch", Toast.LENGTH_SHORT).show();
    }
}
