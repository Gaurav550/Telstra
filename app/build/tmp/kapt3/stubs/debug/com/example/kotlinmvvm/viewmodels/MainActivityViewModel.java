package com.example.kotlinmvvm.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/kotlinmvvm/viewmodels/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "databaseRepository", "Lcom/example/kotlinmvvm/repositories/DatabaseRepository;", "mainActivityRepository", "Lcom/example/kotlinmvvm/repositories/MainActivityRepository;", "getApiData", "Landroidx/lifecycle/LiveData;", "Lcom/example/kotlinassignment/models/Items;", "getRepoData", "", "Lcom/example/kotlinmvvm/models/RowModel;", "saveData", "", "items", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.kotlinmvvm.repositories.DatabaseRepository databaseRepository;
    private com.example.kotlinmvvm.repositories.MainActivityRepository mainActivityRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> getRepoData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kotlinassignment.models.Items> getApiData() {
        return null;
    }
    
    public final void saveData(@org.jetbrains.annotations.NotNull()
    com.example.kotlinassignment.models.Items items) {
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}