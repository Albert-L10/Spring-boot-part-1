package com.UserApp.UserApp1;

public interface UserService {

    String addUser(String name,String surname);

    String removeUser(long Id);

    String getUser(long Id);

    String addUser(int Id, String name, String surname);

    String removeUser(int Id);

    String getUser(int Id);
}
