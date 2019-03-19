package com.mvc.teamwork;

import android.app.Application;
import com.mvc.teamwork.di.component.ApplicationComponent;
import com.mvc.teamwork.di.component.DaggerApplicationComponent;
import com.mvc.teamwork.di.module.ApplicationModule;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

public class TeamworkApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initInjector();
    }

    private void initInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
