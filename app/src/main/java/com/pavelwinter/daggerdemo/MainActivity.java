package com.pavelwinter.daggerdemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=(ImageView)findViewById(R.id.iv);

        BitmapComponent component = DaggerBitmapComponent.builder().imageModule(new ImageModule()).build();

      Bitmap bitmap = component.getBitmap();

      imageView.setImageBitmap(bitmap);
    }
}
