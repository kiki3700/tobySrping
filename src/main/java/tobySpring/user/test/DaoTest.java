package tobySpring.user.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tobySpring.user.dao.DaoFactory;
import tobySpring.user.dao.UserDao;
import tobySpring.user.domain.User;

public class DaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {		
/*
 * config 방식 의존성 주입
 */
				ApplicationContext context =
				new AnnotationConfigApplicationContext(DaoFactory.class);
		
	/*
	 * xml식 의존성 주입
	 */
//		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		User user = new User();
		

		
		user.setId("1234");
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
