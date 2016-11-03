package com.android.java.miss.dependencyinjectionwithdagger2.dagger;

import android.content.Context;

import com.android.java.miss.dependencyinjectionwithdagger2.ProntoShopApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This is a standard Java class that will be decorated with Dagger 2 specific annotations
 * and it is the methods in this class that provide the dependencies.
 */

@Module
public class AppModule {
  private final ProntoShopApplication app;

  public AppModule(ProntoShopApplication app) {
    this.app = app;
  }

  @Provides @Singleton
  public Context provideContext() {
    return app;
  }
}
