package com.mvc.teamwork.ui.main;

import com.mvc.teamwork.domain.entity.ProjectBO;
import com.mvc.teamwork.ui.base.MvpView;

import java.util.List;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

public interface MainMvpView extends MvpView {

    void addProjects(List<ProjectBO> projects); // TODO: 19/03/2019 change BOs by VO

}
