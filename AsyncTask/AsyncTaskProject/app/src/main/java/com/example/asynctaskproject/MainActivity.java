package com.example.asynctaskproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static ImageView imageView;
    public static Button button;
    public static final String IMAGE_PATH = "https://github.com/gtang1104/CS3876392020/blob/master/AsyncTask/u%3D2836407957%2C4015055605%26fm%3D26%26gp%3D0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.my_button);
        imageView = findViewById(R.id.my_city);
        button.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View view) {
        LoadImage loadImage = new LoadImage(imageView);
        loadImage.execute(IMAGE_PATH);
    }


    private  class LoadImage extends AsyncTask<String,Void,Bitmap>{
        ImageView image;
        public LoadImage(ImageView image){
            this.image =image;
        }

            @Override
            protected Bitmap doInBackground(String... params) {
                Bitmap bitmap=null;
                try {
                    URL u=new URL(IMAGE_PATH);
                    InputStream in=u.openStream();
                    bitmap=BitmapFactory.decodeStream(in);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                return bitmap;
            }

            protected void onPostExecute(Bitmap result) {
                if (result != null) {
                    imageView.setImageBitmap(result);
                } else {

                }
            }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


    }

    private Bitmap DownLoadBitmap(String httpUrl) {
        URL url;
        Bitmap bitmap = null;
        HttpURLConnection connect = null;
        InputStream is = null;
        try {
            url = new URL(httpUrl);
            connect = (HttpURLConnection) url.openConnection();
            is = connect.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (connect != null) {
                    connect.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }
}
