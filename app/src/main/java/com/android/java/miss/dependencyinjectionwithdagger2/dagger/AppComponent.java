package com.android.java.miss.dependencyinjectionwithdagger2.dagger;

import com.android.java.miss.dependencyinjectionwithdagger2.MainActivity;
import com.android.java.miss.dependencyinjectionwithdagger2.ProductListener;

import javax.inject.Singleton;

import dagger.Component;

/**
 * This interface that does two things:
 *      1. It lists the Dagger Modules in this app.
 *      2. It lists injectable targets e.g.  SharedPreference in our ShoppingCart.java class
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class
        }
)
public interface AppComponent {
  void inject(ProductListener presenter);
  void inject(MainActivity activity);
}
