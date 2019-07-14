package com.phinehas.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.phinehas.alc4phase1.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutButton();
        myProfileButton();
    }
   public void aboutButton(){
        Button about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, About_ALC.class);
                //    capture the layout's web view and set the web view as a page
                startActivity(intent);
            }
        });

   }
    public void myProfileButton(){
        Button myProfile = (Button) findViewById(R.id.myprofilebutton);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Profile.class);
                startActivity(intent);

            }
        });
    }
}
