package com.mvc.teamwork.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
    @Inject
    ProjectAdapter projectAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInjector();
        initViews();
        mainPresenter.attachView(this);
        mainPresenter.loadProjects();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mainPresenter != null) {
            mainPresenter.detachView();
        }
    }

    private void initInjector() {
        DaggerHomeComponent.builder()
                .applicationComponent(((TeamworkApplication) getApplication()).getApplicationComponent())
                .build().inject(this);
    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(projectAdapter);
    }

    @Override
    public void addProjects(List<ProjectVO> projects) {
        Log.d(TAG, "addProjects() called with: projects = [" + projects + "]");
        projectAdapter.addItems(projects);
        projectAdapter.notifyDataSetChanged();
    }
}
