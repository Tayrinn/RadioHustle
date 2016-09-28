package com.volha.hustle.radio;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.volha.hustle.radio.dagger.ApplicationComponent;
import com.volha.hustle.radio.dagger.ApplicationModule;
import com.volha.hustle.radio.dagger.DaggerApplicationComponent;

/**
 * Created by Volha on 28.09.2016.
 */

public class App extends Application {
    private ApplicationComponent applicationComponent;

    @NonNull
    public static App get(@NonNull Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = prepareApplicationComponent().build();
    }

    @NonNull
    protected DaggerApplicationComponent.Builder prepareApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this));
    }

    @NonNull
    public ApplicationComponent applicationComponent() {
        return applicationComponent;
    }
}
