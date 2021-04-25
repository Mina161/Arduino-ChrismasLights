package com.example.arduinocontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ToggleButton Btn;
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn = (ToggleButton) findViewById(R.id.toggleButton);
        web1 = (WebView) findViewById(R.id.web);
    }


    public void turnOn(View view){
        if(Btn.isChecked()){
            web1.loadUrl("http://192.168.0.161/Lights=ON");
            Toast.makeText(this,"Turning on",Toast.LENGTH_SHORT).show();
        } else {
            web1.loadUrl("http://192.168.0.161/Lights=OFF");
            Toast.makeText(this,"Turning off",Toast.LENGTH_SHORT).show();
        }
    }
}
