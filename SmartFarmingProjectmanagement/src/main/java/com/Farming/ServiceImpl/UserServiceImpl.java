package com.Farming.ServiceImpl;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Farming.Repository.UserRepository;
import com.Farming.Service.UserService;
import com.Farming.entities.Users;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository us;

	@Override
	public Users addUsers(Users users) {
		return us.save(users);

	}

	@Override
	public List<Users> viewAllCrop() {
		List<Users> u = us.findAll();
		return u;
	}

	@Override
	public Users updateusers(int id, Users user) {
		Users u = new Users();
		u.setId(user.getId());
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		u.setPassword(user.getPassword());

		return us.save(u);
	}

	@Override
	public List<Users> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteuserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAlluser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users viewUsersById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users save(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

}
