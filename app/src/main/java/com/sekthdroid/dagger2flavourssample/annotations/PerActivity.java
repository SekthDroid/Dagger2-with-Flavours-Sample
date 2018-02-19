package com.sekthdroid.dagger2flavourssample.annotations;

import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.annotations
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
