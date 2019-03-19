package com.mvc.teamwork.di.component;

import com.mvc.teamwork.TeamworkApplication;
import com.mvc.teamwork.di.module.ApplicationModule;
import com.mvc.teamwork.domain.usecase.ProjectUseCase;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    ProjectUseCase provideProjectUseCase();

    void inject(TeamworkApplication application);

}
