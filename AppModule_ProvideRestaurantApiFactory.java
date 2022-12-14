// Generated by Dagger (https://dagger.dev).
package com.codinginflow.simplecachingexample.di;

import com.codinginflow.simplecachingexample.api.RestaurantApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRestaurantApiFactory implements Factory<RestaurantApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideRestaurantApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RestaurantApi get() {
    return provideRestaurantApi(retrofitProvider.get());
  }

  public static AppModule_ProvideRestaurantApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideRestaurantApiFactory(retrofitProvider);
  }

  public static RestaurantApi provideRestaurantApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRestaurantApi(retrofit));
  }
}
