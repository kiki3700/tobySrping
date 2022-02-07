package tobySpring.user.test;

import java.sql.SQLException;

import tobySpring.user.dao.ConnectionMaker;
import tobySpring.user.dao.DConnectionMaker;
import tobySpring.user.dao.DaoFactory;
import tobySpring.user.dao.UserDao;
import tobySpring.user.domain.User;

public class DaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {		
		UserDao dao = new DaoFactory().userDao();
		
		User user = new User();
		user.setId("kiki3700");
		user.setName("이성현");
		user.setPassword("lolo5050");
		dao.add(user);
		
		System.out.println(user.getId()+ " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId()+" 조회 성공");
		
	}
}
