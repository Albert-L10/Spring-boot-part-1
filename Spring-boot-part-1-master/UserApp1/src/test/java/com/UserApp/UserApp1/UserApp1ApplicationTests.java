package com.UserApp.UserApp1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserApp1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void addUser() {
		assertThat(Boolean.parseBoolean(new FakeRepo()
				.insertUser(1, "Ronald","Majozi") + " was entered"));
	}
	@Test
	public void deleteUser(){
		assertThat(Boolean.parseBoolean(new FakeRepo()
				.deleteUser(1)+" is removed"));
	}
	@Test
	public void findUser(){
		assertThat(Boolean.parseBoolean(String.valueOf(new FakeRepo()
				.findUserById(1))));
	}

}
