package tobySpring.user.dao;

public class DaoFactory {
	public UserDao userDao() {
		return new UserDao(connectionmaker());
	}
	
	public ConnectionMaker connectionmaker() {
		return new DConnectionMaker();
	}
}
