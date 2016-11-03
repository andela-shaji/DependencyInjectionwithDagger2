package com.android.java.miss.dependencyinjectionwithdagger2.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.android.java.miss.dependencyinjectionwithdagger2.ShoppingCart;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This module provides an instances of ShoppingCart.
 */

@Module
public class ShoppingCartModule {

  @Provides @Singleton
  SharedPreferences provideSharedPreference(Context context) {
    return PreferenceManager.getDefaultSharedPreferences(context);
  }

  @Provides @Singleton
  ShoppingCart providesShoppingCart(SharedPreferences sharedPreferences) {
    return new ShoppingCart(sharedPreferences);
  }
}
