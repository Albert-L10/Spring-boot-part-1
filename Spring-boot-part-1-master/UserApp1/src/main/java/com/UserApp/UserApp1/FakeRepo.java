package com.UserApp.UserApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {


    @Autowired
    static ArrayList<User> users = new ArrayList<>();

    @Override
    public String insertUser(long id, String name, String surname){
        users.add(new User(id, name, surname));
        return name + " " + surname+" was successfully added";
    }

    @Override
    public String findUserById(long id) {
        for(User user:users){
            long userId = user.getId();
            if(userId == id){
                return user.getName()+" "+user.getSurname()+" was successfully found";
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long id) {
        for (User user:users){
            long userId = user.getId();
            if(userId == id){
                users.remove(user);
                return user.getName()+" " + user.getSurname ()+" was successfully removed";
            }
        }
        return null;
    }

}
