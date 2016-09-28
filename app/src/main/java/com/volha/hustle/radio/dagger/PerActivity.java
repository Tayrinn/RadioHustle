package com.volha.hustle.radio.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by Volha on 28.09.2016.
 */

@Scope
@Retention(SOURCE)
public @interface PerActivity {
}