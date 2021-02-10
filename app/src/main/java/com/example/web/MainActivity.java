package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ET;
    WebView WV;
    String x;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       WV = findViewById(R.id.WV);
        Button btn = findViewById(R.id.btn);
         ET = findViewById(R.id.ET);

       WV.getSettings().setJavaScriptEnabled(true);
       WV.setWebViewClient(new MyWebViewClient());


    }

    public void browse(View view) {
        x = ET.getText().toString();
        WV.loadUrl(x);


    }
}