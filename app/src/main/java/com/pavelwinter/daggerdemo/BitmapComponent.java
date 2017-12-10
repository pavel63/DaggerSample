package com.pavelwinter.daggerdemo;

import android.graphics.Bitmap;

import dagger.Component;

/**
 * Created by newuser on 10.12.2017.
 */

@Component(modules = { ImageModule.class })
public interface BitmapComponent {

    Bitmap getBitmap();

}
