package com.android.example.github.di;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.android.example.github.MainActivity;
import com.android.example.github.MainViewModel;
import com.android.example.github.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

/**
 *
 */
@Module
public class MainActivityProvidersModule {

    @ActivityScope
    @Provides
    MainViewModel provideMainViewModel(MainActivity activity, ViewModelProvider.Factory factory) {
        MainViewModel viewModel = ViewModelProviders.of(activity, factory).get(MainViewModel.class);
        Timber.d("provideMainViewModel for %s using %s: %s", activity, factory, viewModel);
        return viewModel;
    }
}
