package com.example.menuproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button smsbtn = findViewById(R.id.sms);
        smsbtn.setOnClickListener((View.OnClickListener) this);

        Button phonebtn = findViewById(R.id.pho);
        phonebtn.setOnClickListener((View.OnClickListener) this);

        Button webbtn = findViewById(R.id.web);
        webbtn.setOnClickListener((View.OnClickListener) this);

        Button mapbtn = findViewById(R.id.map);
        mapbtn.setOnClickListener((View.OnClickListener) this);

        Button sharebtn = findViewById(R.id.share);
        sharebtn.setOnClickListener((View.OnClickListener) this);

        Button newactbtn = findViewById(R.id.newact);
        newactbtn.setOnClickListener((View.OnClickListener) this);


    }

    public void onClick(View view){
        switch (view.getId()){
            case (R.id.sms):
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:6266938869"));
                intent1.putExtra("sms", "Guo Tang");
                startActivity(intent1);
                break;
            case (R.id.pho):
                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:6266938869"));
                startActivity(intent2);
                break;
            case (R.id.web):
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("http://www.google.com"));
                startActivity(intent3);
                break;
            case (R.id.map):
                Uri uri = Uri.parse("geo:38.899533, -77.036476");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
            case (R.id.share):
                Intent intent5 = new Intent(Intent.ACTION_SEND);
                intent5.setType("text/plain");
                intent5.putExtra(Intent.EXTRA_TEXT, "Share the love");
                startActivity(Intent.createChooser(intent5,"Share the love"));
                startActivity(intent5);
                break;
            case (R.id.newact):
                Intent intent6 = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.setting_item:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }

}