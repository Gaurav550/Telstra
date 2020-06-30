package com.example.kotlinmvvm.storage.roomDAO;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlinassignment.models.Items;
import com.example.kotlinmvvm.utils.TypeConverterDB;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfItems;

  private final TypeConverterDB __typeConverterDB = new TypeConverterDB();

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItems = new EntityInsertionAdapter<Items>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `myItemList`(`itemId`,`rows`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Items value) {
        stmt.bindLong(1, value.getItemId());
        final String _tmp;
        _tmp = __typeConverterDB.listToJson(value.getRows());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
  }

  @Override
  public void insert(Items listOfRows) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfItems.insert(listOfRows);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
