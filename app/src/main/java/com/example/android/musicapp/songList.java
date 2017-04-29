package com.example.android.musicapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class songList extends AppCompatActivity {

    public static boolean coldplayboolean;
    public static boolean theoneboolean;
    public static boolean edboolean;
    public static boolean unforgettableboolean;
    public static boolean lostyouboolean;
    public TextView infoText;
    final Context c = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        LinearLayout toYou = (LinearLayout) findViewById(R.id.toYouSelect);
        toYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theoneboolean = true;
                coldplayboolean = false;
                edboolean = false;
                unforgettableboolean = false;
                lostyouboolean = false;
                Intent playerIntent = new Intent(songList.this, MusicPlayer.class);
                startActivity(playerIntent);
            }

        });

        LinearLayout coldplay = (LinearLayout) findViewById(R.id.coldlaySelect);
        coldplay.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                coldplayboolean = true;
                theoneboolean = false;
                edboolean = false;
                unforgettableboolean = false;
                lostyouboolean = false;
                Intent playerIntent = new Intent(songList.this, MusicPlayer.class);
                startActivity(playerIntent);
            }
        });

        LinearLayout edSheeran = (LinearLayout) findViewById(R.id.edsheeranSelect);
        edSheeran.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                edboolean = true;
                theoneboolean = false;
                coldplayboolean = false;
                unforgettableboolean = false;
                lostyouboolean = false;
                Intent playerIntent = new Intent(songList.this, MusicPlayer.class);
                startActivity(playerIntent);
            }
        });

        LinearLayout unforgettable = (LinearLayout) findViewById(R.id.unforgettableSelect);
        unforgettable.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                unforgettableboolean = true;
                theoneboolean = false;
                coldplayboolean = false;
                edboolean = false;
                lostyouboolean = false;
                Intent playerIntent = new Intent(songList.this, MusicPlayer.class);
                startActivity(playerIntent);
            }
        });

        LinearLayout lostYou = (LinearLayout) findViewById(R.id.lostyouSelect);
        lostYou.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                lostyouboolean = true;
                theoneboolean = false;
                coldplayboolean = false;
                edboolean = false;
                unforgettableboolean = false;
                Intent playerIntent = new Intent(songList.this, MusicPlayer.class);
                startActivity(playerIntent);
            }
        });

        TextView Home = (TextView) findViewById(R.id.homeButton2);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(songList.this, MainActivity.class);
                startActivity(homeIntent);
            }

        });

        infoText = (TextView) findViewById(R.id.info3);
        infoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                View mView = layoutInflaterAndroid.inflate(R.layout.info_activity, null);
                TextView TextInfo = (TextView) mView.findViewById(R.id.allertMessage);
                TextInfo.setText(R.string.ListActivity);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                alertDialogBuilderUserInput.setView(mView);
                alertDialogBuilderUserInput
                        .setCancelable(true);
                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();

            }
        });

    }

}
