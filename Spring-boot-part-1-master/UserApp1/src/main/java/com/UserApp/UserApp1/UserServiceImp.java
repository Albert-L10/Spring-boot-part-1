package com.UserApp.UserApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
   @Autowired
   FakeRepo fakeRepo ;

    public UserServiceImp(FakeRepo fakeRepo) {
        this.fakeRepo=fakeRepo;
    }

    @Override
    public String addUser(long Id, String name, String surname) {
        return fakeRepo.insertUser(Id,name,surname);
    }

    @Override
    public String getUser(long Id) {

    return  fakeRepo.findUserById(Id);

    }

    @Override
    public String deleteUser(long Id) {
     return fakeRepo.deleteUser(Id);

    }
}
