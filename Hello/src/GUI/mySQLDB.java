package GUI;

import java.sql.DriverManager;

public class mySQLDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnect connect = new DBConnect();
		
		connect.getData();
		

	}

}

