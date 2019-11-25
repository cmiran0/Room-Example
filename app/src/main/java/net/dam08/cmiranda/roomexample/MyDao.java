package net.dam08.cmiranda.roomexample;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    void addUser(User u);

    @Query("select * from users")
    List<User> getUsers();
}
