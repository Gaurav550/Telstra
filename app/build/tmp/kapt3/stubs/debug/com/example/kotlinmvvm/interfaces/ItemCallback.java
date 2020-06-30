package com.example.kotlinmvvm.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/example/kotlinmvvm/interfaces/ItemCallback;", "", "getItemData", "", "data", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/kotlinmvvm/models/RowModel;", "app_debug"})
public abstract interface ItemCallback {
    
    public abstract void getItemData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> data);
}