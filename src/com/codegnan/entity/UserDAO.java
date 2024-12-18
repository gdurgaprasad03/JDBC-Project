package com.codegnan.entity;

import java.util.List;

import com.codegnan.entity.User;

public interface UserDAO {

	public void addUser(User user);

	// to get user by id
	public User getUserById(int id);

	// to get All uses
	public List<User> getAllUsers();

	// to update user data
	public void updateUser(User user);

	// delete user by id
	public void deleteUser(int id);
}
