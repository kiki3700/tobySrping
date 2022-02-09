package tobySpring.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {
	int counter =0;
	private ConnectionMaker realConnectionMaker;
	
	public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
		this.realConnectionMaker = realConnectionMaker;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.counter++;
		return realConnectionMaker.getConnection();
	}
	public int getCounter() {
		return this.counter;
	}

}
