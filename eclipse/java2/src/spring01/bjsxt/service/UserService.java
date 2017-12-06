package spring01.bjsxt.service;

import spring01.bjsxt.dao.UserDAO;
import spring01.bjsxt.model.User;

public class UserService {
	private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	//<property> is set method
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
