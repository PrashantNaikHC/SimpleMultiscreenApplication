package com.hyperclock.prashant.simplemultiscreenapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;

public class InfoActivity extends AppCompatActivity {

    private String mSongName, mSongArtist, mSongLyrics;
    private TextView songName, songLyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        getIncomingIntent();

        songName = findViewById(R.id.info_song_name_tv);
        songLyrics = findViewById(R.id.info_song_desc_tv);

        songName.setText(mSongName + " by " + mSongArtist);
        songLyrics.setText(mSongLyrics);
    }

    private void getIncomingIntent() {
        mSongName = getIntent().getStringExtra("song_name");
        mSongArtist = getIntent().getStringExtra("song_artist");
        mSongLyrics = getIntent().getStringExtra("song_lyrics");
    }
}
