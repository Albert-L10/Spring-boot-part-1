package com.UserApp.UserApp1;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class UserServiceImp implements UserService,FakeRepoInterface {

    @Autowired
    private FakeRepo fakeRepo;
    @Override
    public String addUser(int Id, String name, String surname) {
        fakeRepo = new FakeRepo ();
        return fakeRepo.insertUser(Id, name, surname);
    }
    @Override
    public String removeUser(int Id) {
        fakeRepo = new FakeRepo ();
        return fakeRepo.deleteUser(Id);
    }
    @Override
    public String getUser(int Id) {
        fakeRepo = new FakeRepo ();
        return fakeRepo.findUserById(Id);
    }

    @Override
    public String insertUser(int id, String name, String surname) {
        return null;
    }

    @Override
    public String deleteUser(int Id) {
        return null;
    }

    @Override
    public String findUserById(int Id) {
        return null;
    }

}
