package com.example.kotlinmvvm.storage;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.kotlinmvvm.utils.TypeConverterDB.class})
@androidx.room.Database(entities = {com.example.kotlinassignment.models.Items.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlinmvvm/storage/RoomDB;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Lcom/example/kotlinmvvm/storage/roomDAO/ItemDao;", "Companion", "app_debug"})
public abstract class RoomDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static com.example.kotlinmvvm.storage.RoomDB dbInstance;
    public static final com.example.kotlinmvvm.storage.RoomDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kotlinmvvm.storage.roomDAO.ItemDao getDao();
    
    public RoomDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlinmvvm/storage/RoomDB$Companion;", "", "()V", "dbInstance", "Lcom/example/kotlinmvvm/storage/RoomDB;", "getDbInstance", "()Lcom/example/kotlinmvvm/storage/RoomDB;", "setDbInstance", "(Lcom/example/kotlinmvvm/storage/RoomDB;)V", "getInstance", "context", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlinmvvm.storage.RoomDB getDbInstance() {
            return null;
        }
        
        public final void setDbInstance(@org.jetbrains.annotations.NotNull()
        com.example.kotlinmvvm.storage.RoomDB p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlinmvvm.storage.RoomDB getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}