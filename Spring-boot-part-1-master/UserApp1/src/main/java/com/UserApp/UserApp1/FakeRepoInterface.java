package com.UserApp.UserApp1;

import java.util.Collection;

public interface FakeRepoInterface {
    String insertUser(long id, String name, String surname);
    String deleteUser(long id);
    String findUserById(long id);


}
