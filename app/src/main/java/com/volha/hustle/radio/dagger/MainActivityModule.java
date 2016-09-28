package com.volha.hustle.radio.dagger;

import android.content.Context;
import android.support.annotation.NonNull;

import com.volha.hustle.radio.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Volha on 28.09.2016.
 */

@Module
public class MainActivityModule {
    final private MainActivity activity;

    public MainActivityModule(@NonNull MainActivity activity) {
        this.activity = activity;
    }

    @PerActivity
    @Provides
    Context provideContext() {
        return activity;
    }
}
