package com.mvc.teamwork.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.mvc.teamwork.R;
import com.mvc.teamwork.TeamworkApplication;
import com.mvc.teamwork.di.component.DaggerHomeComponent;
import com.mvc.teamwork.entity.ProjectVO;

import javax.inject.Inject;
import java.util.List;

/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */
public class MainActivity extends AppCompatActivity implements MainMvpView {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInjector();
        mainPresenter.loadProjects();
    }

    private void initInjector() {
        DaggerHomeComponent.builder()
                .applicationComponent(((TeamworkApplication) getApplication()).getApplicationComponent())
                .build().inject(this);
    }

    @Override
    public void addProjects(List<ProjectVO> projects) {
        // TODO: 19/03/2019
        Log.d(TAG, "addProjects() called with: projects = [" + projects + "]");
    }
}
