package com.mvc.teamwork.di.module;

import com.mvc.teamwork.domain.usecase.ProjectUseCase;
import dagger.Module;
import dagger.Provides;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

@Module
public class ApplicationModule {

    @Provides
    public ProjectUseCase provideProjectUseCase() {
        return new ProjectUseCase();
    }
}
