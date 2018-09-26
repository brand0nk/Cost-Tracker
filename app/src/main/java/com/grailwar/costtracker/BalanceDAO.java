package com.grailwar.costtracker;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Brandon on 9/25/2018.
 */

@Dao
public interface BalanceDAO {
    @Query("SELECT * FROM balance WHERE uid == :uid LIMIT 1")
    Balance getBalance(int uid);

    @Query("SELECT * FROM balance")
    List<Balance> getAll();

    @Insert
    void insert(Balance balance);

    @Update
    void updateBalance(Balance balance);
}