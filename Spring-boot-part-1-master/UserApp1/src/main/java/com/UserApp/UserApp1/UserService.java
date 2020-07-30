package com.UserApp.UserApp1;

public interface UserService {
    String addUser(long Id, String name, String surname);

    String getUser(long Id);

    String deleteUser(long Id);
}
