package com.mvc.teamwork.ui.main;

import com.mvc.teamwork.entity.ProjectVO;
import com.mvc.teamwork.ui.base.MvpView;

import java.util.List;

/**
 * Author: Mario Velasco Casquero
 * Date: 19/03/2019
 * Email: m3ario@gmail.com
 */

public interface MainMvpView extends MvpView {

    void addProjects(List<ProjectVO> projects);

}
