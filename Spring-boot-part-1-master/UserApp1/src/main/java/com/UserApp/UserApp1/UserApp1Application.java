package com.UserApp.UserApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserApp1Application.class, args);


		FakeRepo fakeRepo=new FakeRepo();
		UserServiceImp userServiceImp = new UserServiceImp(fakeRepo);

		System.out.println(userServiceImp.addUser(2,"Thomas","Mlambo"));
		System.out.println(userServiceImp.getUser(2));
		System.out.println(userServiceImp.deleteUser(2));




	}


}
