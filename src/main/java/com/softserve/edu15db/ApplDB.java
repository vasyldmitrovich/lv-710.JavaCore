package com.softserve.edu15db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
	private static Connection con = null;

	// Connect to outside DB
	//private static String username = "lv710";
	//private static String password = "Lv-710.DevOps";
	//private static String URL = "jdbc:mysql://192.168.153.138:3306";
	//private static String URL = "jdbc:mysql://192.168.153.138:3306/lv710";
	//private static String URL = "jdbc:mysql://192.168.153.134:3306/teach";


	//
	private static String username = "postgres";
    private static String password = "root";

	// Get password from environment variable
	//private static String password = System.getenv("DB_PASSWORD");
/*

	// 1) Connect and create DB
	private static String URL = "jdbc:postgresql://localhost:5432/";
*/

	// 2) Work with that DB
	private static String URL = "jdbc:postgresql://localhost:5432/lv710";

	public static void main(String[] args) throws SQLException {
		System.out.println("Start...");

		// Was needed but now do not need
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Now do not need
		//DriverManager.registerDriver(new org.postgresql.Driver() );


		con = DriverManager.getConnection(URL, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}

		// Create statement object to send sql to db
		Statement st = con.createStatement();
/*

		// 1) Connect and create DB
		st.execute("CREATE DATABASE lv710;");
*/


		// Postgresql do not have that command
		//st.execute("USE lv710;");

/*

		// 2) Create table in DB
		String query = "CREATE TABLE temp "
		    //+ "( id int unsigned not null auto_increment primary key, " // for mysql
			+ "( id int not null primary key, " // for postgresql
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
		st.execute(query);
*/

/*

		// Insert
//		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
//		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','123456',22);";
        String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Petro3','pet2','123456',22);"; // for postgresql
		st.execute(query);
        String query1 = "INSERT INTO temp (id,name,login,password,age) VALUES (3,'Ivan','iv','123456',22);"; // for postgresql
		st.execute(query1);
		String query2 = "INSERT INTO temp (id,name,login) VALUES (22,'Petro6','pet2');"; // for postgresql
		st.execute(query2);
*/


/*
		// If not exists
		String query = "CREATE TABLE IF NOT EXISTS temp1 ( id BIGSERIAL not null primary key,\n" +
				"name varchar(20),\n" +
				"login varchar(20),\n" +
				"password varchar(30),\n" +
				"age int);";
		st.execute(query);
		String query2 = "INSERT INTO temp1 (name,login) VALUES ('Petro6','pet2');"; // for postgresql
		st.execute(query2);
*/


		// Update
//		st.execute("INSERT INTO temp (id, name,login,password,age) VALUES (333, 'Ira','ira','asdfgh',23);");
//		st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
//		st.execute("INSERT INTO temp (id, name,login,password,age) VALUES (444, 'Ira','ira','asdfgh',23);");
//		st.executeUpdate("UPDATE temp SET name='Petro' WHERE id=444;");
//		st.execute("DELETE FROM temp WHERE name='Tolik';");
//		int count = st.executeUpdate("DELETE FROM temp WHERE name='Petro6';");
//		System.out.println("Deleted rows = " + count);


/*

		// AutoCommit
		con.setAutoCommit(false);
		try {
    		st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
    		st.executeUpdate("UPDATE temp SET name='Petro' WHERE nameddd='Tolik222';");
    		con.commit();
    		System.out.println("con.commit();");
		} catch(Exception e) {
		    System.out.println("con.rollback();");
		    con.rollback();
		}
		con.setAutoCommit(true);
*/


		// 3) ResultSet

/*
		//st.execute("USE lv710;");
		ResultSet rs = st.executeQuery("select * from temp;");

		// Not all rows
		//ResultSet rs = st.executeQuery("select name, login from temp;");

		// Almost the same
		//boolean b = st.execute("select * from temp;");
		//System.out.println("b = " + b);
		//ResultSet rs = st.getResultSet(); // for 1 only
*/

/*

		// PreparedStatement
		//String queryStr = "SELECT * FROM temp WHERE name LIKE 'Pet%';";
		//String queryStr = "SELECT * FROM temp WHERE name = ?;";
		String queryStr = "SELECT * FROM temp WHERE name LIKE ?;";
		//String queryStr = "SELECT * FROM temp WHERE name LIKE ?||'%';";
		PreparedStatement pstmt = con.prepareStatement(queryStr);
		pstmt.setString(1, "Petr%");
		//pstmt.setString(1, "Petro");
		ResultSet rs = pstmt.executeQuery();
		//ResultSet rs = st.executeQuery(queryStr);
*/


		/*
		String queryStr = "SELECT * FROM temp WHERE name LIKE '%s%%';";
		//System.out.println(String.format(queryStr, "Petr"));
		ResultSet rs = st.executeQuery(String.format(queryStr, "Petr"));
		*/

/*

		// 3) ResultSet
		//ResultSet rs = st.executeQuery("select * from users;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t");
			//System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
			    if (i == columnCount) {
			        System.out.print("\t");
			    }
				System.out.print(rs.getString(i) + "\t");
//				if (i == columnCount) {
//                    System.out.print("\t Column type = " + rs.getMetaData().getColumnType(i));
//                }
			}
			System.out.println();
		}
		System.out.println("before close");
//        if (pstmt != null) {
//            pstmt.close();
//        }
		if (rs != null) {
			rs.close();
		}
*/



		//	In the end we need close connection and statement
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");

	}
}