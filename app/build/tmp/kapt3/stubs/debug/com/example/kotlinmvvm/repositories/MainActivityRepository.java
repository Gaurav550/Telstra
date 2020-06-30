package com.example.kotlinmvvm.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlinmvvm/repositories/MainActivityRepository;", "", "()V", "headerItem", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/kotlinassignment/models/Items;", "myItemData", "", "Lcom/example/kotlinmvvm/models/RowModel;", "getApiItemns", "Landroidx/lifecycle/LiveData;", "getDataFromApi", "app_debug"})
public final class MainActivityRepository {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> myItemData;
    private androidx.lifecycle.MutableLiveData<com.example.kotlinassignment.models.Items> headerItem;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> getDataFromApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kotlinassignment.models.Items> getApiItemns() {
        return null;
    }
    
    public MainActivityRepository() {
        super();
    }
}