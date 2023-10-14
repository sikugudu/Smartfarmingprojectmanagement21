package com.Farming.Service;

import java.util.List;

import com.Farming.entities.Users;

public interface UserService {
	public Users addUsers(Users users);

	public List<Users> viewAllCrop();

	public Users updateusers(int id, Users user);

	public String deleteuserById(int id);

	public String deleteAlluser();

	public Users viewUsersById(int id);

	public Users save(Users users);

	public List<Users> viewAllUsers();

}
