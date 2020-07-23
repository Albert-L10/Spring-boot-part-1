package com.UserApp.UserApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserApp1Application.class, args);

		System.out.println("testing the process");

		FakeRepo fakeRepo=new FakeRepo();
		System.out.println(fakeRepo.insertUser(1,"Ronald","Majozi"));

		System.out.println(fakeRepo.findUserById(1));
		System.out.println(fakeRepo.deleteUser(1));

	}


}
