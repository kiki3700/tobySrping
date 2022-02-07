//package tobySpring.user.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class NUserDao extends UserDao{
//
//	@Override
//	public Connection getConnection() throws SQLException, ClassNotFoundException {
//		// TODO Auto-generated method stub{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "3700");
//		return c;
//	}
//
//}
