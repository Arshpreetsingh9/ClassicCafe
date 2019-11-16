import java.sql.*;

public class DBConnection{

	// variables
	Connection connection = null;
	{
	// Statement statement = null;
	// ResultSet resultSet = null;
	// Step 1: Loading or registering ucanaccess
	// JDBC driver class
	try
	{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	}catch(
	ClassNotFoundException cnfex)
	{
		System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
		cnfex.printStackTrace();
	}
	try
	{
		String myAccDB = "C:/Users/25ars/Documents/Customers.accdb";
		String dbURL = "jdbc:ucanaccess://" + myAccDB;
		// Step 2.A: Create and get connection
		// using DriverManager class
		connection = DriverManager.getConnection(dbURL);
		// Step 2.B: Creating JDBC Statement
		// statement = connection.createStatement();
		// Step 2.C: Executing SQL & retrieve
		// data into ResultSet
		// resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
		/*
		 * while (resultSet.next()) { int id = resultSet.getInt(1); String name =
		 * resultSet.getString(2); Double salary = resultSet.getDouble(3);
		 * System.out.println("Employee #" + id + ": " + name + ", " + salary); }
		 */
	}catch(	SQLException sqlex)	{
		sqlex.printStackTrace();
	}finally{
		// Step 3: Closing database connection
		try{
			if (connection != null) {
				// cleanup resources, once
				// after processing
				// resultSet.close();
				// statement.close();
				// and then finally close connection
				connection.close();
			}
		} catch (SQLException sqlex){
			sqlex.printStackTrace();}
		}
	}
	
	public void insertRecord(){
		String insertSQL =
				"INSERT INTO EMPLOYEE (NAME, SALARY) " +
				"VALUES ('SIMON LI', 90000)";
				//statement.executeUpdate(insertSQL);
	}
	
	public void updateRecord() {
		String updateSQL =
				"UPDATE EMPLOYEE SET SALARY = 120000 " +
				"WHERE NAME='SIMON LI'";
				//statement.executeUpdate(updateSQL);
	}
}
