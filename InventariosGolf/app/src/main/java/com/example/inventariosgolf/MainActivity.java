package com.example.inventariosgolf;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 private VideoView vv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            vv1=findViewById(R.id.vv1);


            vv1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vv1));

        MediaController mc=new MediaController(this);
        vv1.setMediaController(mc);
            vv1.start();
        }
    }
