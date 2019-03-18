package com.mvc.teamwork;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.mvc.teamwork.domain.usecase.ProjectUseCase;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new ProjectUseCase().getProjects()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        projectBOS -> Log.d(TAG, "onCreate: project")
                        , throwable -> Log.e(TAG, "onCreate: error", throwable));
    }
}
