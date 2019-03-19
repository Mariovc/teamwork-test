package com.mvc.teamwork.ui.main;

import android.util.Log;
import com.mvc.teamwork.domain.entity.ProjectBO;
import com.mvc.teamwork.domain.usecase.ProjectUseCase;
import com.mvc.teamwork.entity.ProjectVO;
import com.mvc.teamwork.ui.base.BasePresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

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
                    projectBOS -> {
                        if (getMvpView() != null) {
                            List<ProjectVO> projects = mapProjectList(projectBOS);
                            getMvpView().addProjects(projects);
                        }
                    }
                    , throwable -> Log.e(TAG, "loadProjects: error", throwable));
    }


    private List<ProjectVO> mapProjectList(List<ProjectBO> projectBOList) {
        List<ProjectVO> projects = new ArrayList<>();
        for (ProjectBO projectBO : projectBOList) {
            projects.add(mapProject(projectBO));
        }
        return projects;
    }

    private ProjectVO mapProject(ProjectBO projectBO) {
        return new ProjectVO(
                projectBO.getCreatedOn(),
                projectBO.getDescription(),
                projectBO.getEndDate(),
                projectBO.getId(),
                projectBO.getLastChangedOn(),
                projectBO.getLogo(),
                projectBO.getName(),
                projectBO.getStarred(),
                projectBO.getStartDate(),
                projectBO.getStatus()
        );
    }
}
