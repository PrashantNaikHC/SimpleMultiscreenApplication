package com.hyperclock.prashant.simplemultiscreenapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    static final ArrayList<Song> songsArrayList = new ArrayList<>();


    //@BindView(R.id.songs_lv) ListView listView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.songs_lv);

        songsArrayList.add(new Song("Beat It", "michael jackson", "Pop", R.drawable.song_one));
        songsArrayList.add(new Song("Rap God", "eminem", "Rap", R.drawable.song_two));
        songsArrayList.add(new Song("Boulevard of broken dreams", "green day", "Rock", R.drawable.song_three));

        SongAdapter adapter = new SongAdapter(getApplicationContext(), songsArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //nothing
            }
        });

    }


}
