package com.mvc.teamwork.di.component;

import com.mvc.teamwork.di.PerActivity;
import dagger.Component;

/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class)
public interface HomeComponent {

}
