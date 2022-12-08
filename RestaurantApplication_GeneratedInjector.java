package com.codinginflow.simplecachingexample;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = RestaurantApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface RestaurantApplication_GeneratedInjector {
  void injectRestaurantApplication(RestaurantApplication restaurantApplication);
}
