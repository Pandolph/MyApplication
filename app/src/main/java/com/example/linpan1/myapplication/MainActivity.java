package com.example.linpan1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnstart = (Button) this.findViewById(R.id.button_start);
        final Button btnmusic = (Button)findViewById(R.id.button_music);
        final Button btnpause = (Button)findViewById(R.id.button_pause);
        View clock=(View)findViewById(R.id.clock);
        final TextView note=(TextView)findViewById(R.id.note);


        btnstart.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
             note.setText(R.string.notestart);
                note.setTextColor(R.drawable.green);


            }

        });

        btnmusic.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                note.setText(R.string.notemusic);
                note.setTextColor(R.drawable.blue);
            }

        });

        btnpause.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                note.setText(R.string.notepause);
                note.setTextColor(R.drawable.red);
            }

        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
