package com.hyperclock.prashant.simplemultiscreenapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongAdapter extends ArrayAdapter<Song> {
    Context mContext;

    public SongAdapter(@NonNull Context context, int resource, Context mContext) {
        super(context, resource);
        this.mContext = mContext;
    }

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songName = (TextView) rootView.findViewById(R.id.listItem_songName_tv);
        songName.setText(currentSong.getmName());

        TextView genre = (TextView) rootView.findViewById(R.id.listItem_genre_tv);
        genre.setText(currentSong.getmGenre());

        TextView artistName = (TextView) rootView.findViewById(R.id.listItem_artistName_tv);
        artistName.setText(currentSong.getmArtist());

        ImageView play = (ImageView) rootView.findViewById(R.id.play_iv);
        ImageView info = (ImageView) rootView.findViewById(R.id.info_iv);
        final String name = currentSong.getmName();
        final String artist = currentSong.getmArtist();
        final String genrename = currentSong.getmGenre();
        final String lyrics = currentSong.getmLyrics();
        final int imageId = currentSong.getmImageId();
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlayingNow.class);
                intent.putExtra("song_name", name);
                intent.putExtra("song_artist", artist);
                intent.putExtra("song_genre", genrename);
                intent.putExtra("song_image", imageId);
                getContext().startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), InfoActivity.class);
                intent.putExtra("song_name", name);
                intent.putExtra("song_artist", artist);
                intent.putExtra("song_lyrics", lyrics);
                getContext().startActivity(intent);
            }
        });


        return rootView;
    }
}
