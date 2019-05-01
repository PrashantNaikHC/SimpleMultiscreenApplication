package com.hyperclock.prashant.simplemultiscreenapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayingNow extends AppCompatActivity {

    String mSongName, mSongArtist, mSongGenre;
    int mSongImage;

    @BindView(R.id.artist_name_tv)
    TextView songArtist;

    @BindView(R.id.genre_name_tv)
    TextView songGenre;

    @BindView(R.id.song_name_tv)
    TextView songName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        getIncomingIntent();

        TextView songArtist = findViewById(R.id.artist_name_tv);
        TextView songGenre = findViewById(R.id.genre_name_tv);
        TextView songName = findViewById(R.id.song_name_tv);
        ImageView songBackgroundImage = findViewById(R.id.song_background_iv);

        songName.setText(mSongName);
        songArtist.setText(mSongArtist);
        songGenre.setText(mSongGenre);
        songBackgroundImage.setImageResource(mSongImage);

        //bind the view using butterknife
        ButterKnife.bind(this);
    }

    @OnClick(R.id.next_btn)
    public void next() {

    }

    @OnClick(R.id.previous_btn)
    public void previous() {

    }

    @OnClick(R.id.pause_btn)
    public void pause() {

    }

    public void getIncomingIntent() {
        mSongName = getIntent().getStringExtra("song_name");
        mSongArtist = getIntent().getStringExtra("song_artist");
        mSongGenre = getIntent().getStringExtra("song_genre");
        mSongImage = getIntent().getIntExtra("song_image", 1);
        Log.d("this", "getIncomingIntent: " + mSongName + mSongArtist + mSongGenre);
    }
}
