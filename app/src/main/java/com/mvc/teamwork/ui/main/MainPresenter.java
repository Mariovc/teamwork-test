package com.mvc.teamwork.ui.main;

import android.util.Log;
import com.mvc.teamwork.domain.usecase.ProjectUseCase;
import com.mvc.teamwork.ui.base.BasePresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import javax.inject.Inject;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

public class MainPresenter extends BasePresenter<MainMvpView> {

    private static final String TAG = MainPresenter.class.getSimpleName();
    private ProjectUseCase projectUseCase;

    @Inject
    public MainPresenter(ProjectUseCase projectUseCase) {
        this.projectUseCase = projectUseCase;
    }

    public void loadProjects() {
        projectUseCase.getProjects()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    projectBOS -> Log.d(TAG, "loadProjects: " + projectBOS)
                    , throwable -> Log.e(TAG, "loadProjects: error", throwable));
        // TODO: 19/03/2019 map to VO
    }
}
