package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MediaPlayer mediaPlayer = MediaPlayer.create(this , R.raw.music);
//        mediaPlayer.start();
//        MediaPlayer mediaPlayer = new MediaPlayer();
//        try {
//            mediaPlayer.setDataSource("https://socialdance.stanford.edu/music/Durang_Lancers_5.m4a");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                Toast.makeText(MainActivity.this, "Song Prepared", Toast.LENGTH_SHORT).show();
//                mediaPlayer.start();
//                seekBar.setMax(mediaPlayer.getDuration());
//                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                         if (b){
//                             mediaPlayer.seekTo(i);
//                         }
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar) {
//
//                    }
//                });
//                mediaPlayer.prepareAsync();
                MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
                seekBar = findViewById(R.id.seekBar2);
                seekBar.setMax(mediaPlayer.getDuration());
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        if(b){
                            mediaPlayer.seekTo(i);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

                button = findViewById(R.id.button);
                button2 = findViewById(R.id.button2);
//                button.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        mediaPlayer.start();
//                    }
//                });
//                button2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        mediaPlayer.pause();
//                    }
//                });
        button.setOnClickListener(view -> {
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
                button.setText("Play");
            }
            else{
                mediaPlayer.start();
                button.setText("Pause");
            }
        });
            }
    }
