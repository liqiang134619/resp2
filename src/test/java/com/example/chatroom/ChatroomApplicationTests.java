package com.example.chatroom;

import com.example.chatroom.dao.IUserMapper;

import com.example.chatroom.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatroomApplicationTests {

	@Autowired
	IUserMapper iUserMapper;

	@Test
	public void test1() {
		User admin = iUserMapper.findUser("admin");
		System.out.println(admin);
	}

}
