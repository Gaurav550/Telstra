package com.example.kotlinmvvm.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kotlinmvvm/repositories/DatabaseRepository;", "Lcom/example/kotlinmvvm/interfaces/ItemCallback;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "database", "Lcom/example/kotlinmvvm/storage/RoomDB;", "getDao", "Lcom/example/kotlinmvvm/storage/roomDAO/ItemDao;", "itemData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/kotlinmvvm/models/RowModel;", "getItemData", "", "data", "insertRow", "items", "Lcom/example/kotlinassignment/models/Items;", "InsertData", "app_debug"})
public final class DatabaseRepository implements com.example.kotlinmvvm.interfaces.ItemCallback {
    private com.example.kotlinmvvm.storage.RoomDB database;
    private com.example.kotlinmvvm.storage.roomDAO.ItemDao getDao;
    private androidx.lifecycle.LiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> itemData;
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    
    @java.lang.Override()
    public void getItemData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.kotlinmvvm.models.RowModel>> data) {
    }
    
    public final void insertRow(@org.jetbrains.annotations.NotNull()
    com.example.kotlinassignment.models.Items items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    public DatabaseRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u0004\u0018\u00010\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlinmvvm/repositories/DatabaseRepository$InsertData;", "Landroid/os/AsyncTask;", "Lcom/example/kotlinassignment/models/Items;", "Ljava/lang/Void;", "dao", "Lcom/example/kotlinmvvm/storage/roomDAO/ItemDao;", "(Lcom/example/kotlinmvvm/storage/roomDAO/ItemDao;)V", "getDao", "()Lcom/example/kotlinmvvm/storage/roomDAO/ItemDao;", "doInBackground", "params", "", "([Lcom/example/kotlinassignment/models/Items;)Ljava/lang/Void;", "app_debug"})
    public static final class InsertData extends android.os.AsyncTask<com.example.kotlinassignment.models.Items, java.lang.Void, java.lang.Void> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.kotlinmvvm.storage.roomDAO.ItemDao dao = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.kotlinassignment.models.Items... params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlinmvvm.storage.roomDAO.ItemDao getDao() {
            return null;
        }
        
        public InsertData(@org.jetbrains.annotations.NotNull()
        com.example.kotlinmvvm.storage.roomDAO.ItemDao dao) {
            super();
        }
    }
}