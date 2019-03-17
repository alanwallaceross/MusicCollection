package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button addButton;
    private EditText trackNameText;
    private EditText trackArtistText;
    private EditText trackRunningTime;
    private MyMusicCollection myMusicCollection;
    private ListView musicList;
    private ArrayAdapter<MusicTrack> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMusicCollection = new MyMusicCollection();
        addButton = findViewById(R.id.button);
        trackNameText = findViewById(R.id.track_name);
        trackArtistText = findViewById(R.id.track_caption);
        trackRunningTime = findViewById(R.id.track_running);
        musicList = findViewById(R.id.music_list);




        adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1, myMusicCollection.getMusicTracks()){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                text1.setText("Track name: " + myMusicCollection.getMusicTracks().get(position).getTrackName());
                return view;

        }

        };



        musicList.setAdapter(adapter);

        musicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Artist: " + myMusicCollection.getMusicTracks().get(position).getArtistName() ,Toast.LENGTH_SHORT).show();
            }
        });


        createMusicTrack();

    }

    private void createMusicTrack(){
        View.OnClickListener addButtonListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (TextUtils.isEmpty(trackNameText.getText().toString()) || TextUtils.isEmpty(trackArtistText.getText().toString()) || TextUtils.isEmpty(trackRunningTime.getText().toString())){
                    Toast.makeText(MainActivity.this, "No Music Track was created. One of the inputs are empty.", Toast.LENGTH_SHORT).show();
                }

                else if(Integer.parseInt(trackRunningTime.getText().toString()) <= 0){
                    Toast.makeText(MainActivity.this, "Running time set an invalid amount. Please set an integer above 0.", Toast.LENGTH_SHORT).show();
                }
                else {
                    myMusicCollection.addToMusicTracks(new MusicTrack(trackNameText.getText().toString(), trackArtistText.getText().toString(), Integer.parseInt(trackRunningTime.getText().toString())));
                    adapter.notifyDataSetChanged();
                    trackNameText.setText("");
                    trackArtistText.setText("");
                    trackRunningTime.setText("");
                }
            }
        };
        addButton.setOnClickListener(addButtonListener);
    }


}
