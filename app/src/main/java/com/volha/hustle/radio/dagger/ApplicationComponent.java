package com.volha.hustle.radio.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Volha on 28.09.2016.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    MainActivityComponent plus(MainActivityModule module);
}