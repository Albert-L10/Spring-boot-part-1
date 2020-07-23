package com.UserApp.UserApp1;

import java.util.Collection;

public interface FakeRepoInterface {
    String insertUser(int id, String name, String surname);
    String deleteUser(int Id);
    String findUserById(int Id);


}
