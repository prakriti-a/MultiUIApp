package com.prakriti.multiuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener,
        RatingBar.OnRatingBarChangeListener, RadioGroup.OnCheckedChangeListener {
    // listeners for different buttons / UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cb1 = findViewById(R.id.cb1);
        CheckBox cb2 = findViewById(R.id.cb2);
        CheckBox cb3 = findViewById(R.id.cb3);
        CheckBox cb4 = findViewById(R.id.cb4);
        CheckBox cb5 = findViewById(R.id.cb5);
        CheckBox cb6 = findViewById(R.id.cb6);
        CheckBox cb7 = findViewById(R.id.cb7);

        SeekBar seekbar = findViewById(R.id.seekbar);
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton rb1 = findViewById(R.id.rb1);
        RadioButton rb2 = findViewById(R.id.rb2);
        RadioButton rb3 = findViewById(R.id.rb3);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        cb6.setOnCheckedChangeListener(this);
        cb7.setOnCheckedChangeListener(this);

        seekbar.setOnSeekBarChangeListener(this);

        ratingBar.setNumStars(5);
        ratingBar.setOnRatingBarChangeListener(this);

        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // compound btn as multiple can be checked
        if(isChecked)
            Toast.makeText(this, buttonView.getText() + " is checked!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//        Toast.makeText(this, progress + "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, "Seekbar started!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, seekBar.getProgress() + "", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        Toast.makeText(this, "Rating given: " + rating, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Toast.makeText(this, "Item selected!", Toast.LENGTH_SHORT).show();
    }
}