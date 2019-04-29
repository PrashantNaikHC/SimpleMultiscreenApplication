package com.hyperclock.prashant.simplemultiscreenapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayingNow extends AppCompatActivity {

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

        //bind the view using butterknife
        ButterKnife.bind(this);

    }

}
