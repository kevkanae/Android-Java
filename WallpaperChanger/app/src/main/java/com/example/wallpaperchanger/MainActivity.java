package com.example.wallpaperchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.changeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetWallpaper();
            }
        });

    }

    public void SetWallpaper(){
        Bitmap bitmap;
        WallpaperManager wallpaperManager;
        List<Integer> wallpaperList = Arrays.asList(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i);
        wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        for(int i = 0 ; i<wallpaperList.size();i++){
            try {
                bitmap = BitmapFactory.decodeResource(getResources(), wallpaperList.get(i));
                wallpaperManager.setBitmap(bitmap);
                Toast.makeText(this,"Wallpaper Changed",Toast.LENGTH_SHORT).show();
                Thread.sleep(5000);
            }  catch (IOException | InterruptedException e) {
                e.printStackTrace();
                Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();
            }
        }

    }
}

