package com.hyperclock.prashant.simplemultiscreenapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    static final ArrayList<Song> songsArrayList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.songs_lv);
        songsArrayList.add(new Song("Beat It", "michael jackson", "Pop", R.drawable.song_one, getResources().getString(R.string.beat_it_lyrics)));
        songsArrayList.add(new Song("Rap God", "eminem", "Rap", R.drawable.song_two, getResources().getString(R.string.rap_god_lyrics)));
        songsArrayList.add(new Song("Boulevard of broken dreams", "green day", "Rock", R.drawable.song_three, getResources().getString(R.string.boulevard_of_broken_dreams_lyrics)));

        SongAdapter adapter = new SongAdapter(getApplicationContext(), songsArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, songsArrayList.get(position).getmName() + " sung by " + songsArrayList.get(position).getmArtist(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
