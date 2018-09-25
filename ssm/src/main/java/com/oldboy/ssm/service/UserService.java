package com.oldboy.ssm.service;

import com.oldboy.ssm.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * userService
 */

@RequestMapping
public interface UserService {
	public void insertUser(User user);

	public void delete(Integer id) ;

	public User findById(Integer id) ;

	public List<User> findAll();

	public void update(User user);

	public int selectCount();

	public List<User> findPage(int offset , int len);
}
