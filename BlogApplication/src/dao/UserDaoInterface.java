package dao;

import model.User;

public interface UserDaoInterface {
	
	boolean signup(User user);
	boolean loginuser(User user);
}
