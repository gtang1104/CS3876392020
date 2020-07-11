package com.example.gogofitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gotoMenu(View v){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);

    }
    public void gotoHelp(View v){
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);

    }
    public void gotoBmi(View v){
        Intent intent = new Intent(this, BMI.class);
        startActivity(intent);

    }
    public void gotoChat(View v){
        Intent intent = new Intent(this, Chat.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chat_item:
                Intent intent = new Intent(MainActivity.this,Chat.class);
                startActivity(intent);
                break;
            case R.id.help_item:
                Toast.makeText(this, "email: happy@gogofitness.com", Toast.LENGTH_SHORT).show();
                break;
            case R.id.map_item:
                Uri uri = Uri.parse("geo:38.899533, -77.036476");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
            case R.id.share_item:
                Intent intent5 = new Intent(Intent.ACTION_SEND);
                intent5.setType("text/plain");
                intent5.putExtra(Intent.EXTRA_TEXT, "Tell your friend about us!");
                startActivity(Intent.createChooser(intent5,"Tell your friend about us!"));
                startActivity(intent5);
                break;
            case R.id.about_us:
                Toast.makeText(this, "Guo Tang and Zheming Chen", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }


}
