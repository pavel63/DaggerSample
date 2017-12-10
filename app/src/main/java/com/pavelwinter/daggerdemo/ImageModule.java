package com.pavelwinter.daggerdemo;

import android.graphics.Bitmap;
import android.graphics.Color;

import dagger.Module;
import dagger.Provides;

/**
 * Created by newuser on 10.12.2017.
 */

@Module
public class ImageModule {

    @Provides
    public Bitmap getBitmap(){
        Bitmap bitmap2 = Bitmap.createBitmap(200,300,
                Bitmap.Config.ARGB_8888);
        bitmap2.eraseColor(Color.CYAN);
        return bitmap2;
    }

}
