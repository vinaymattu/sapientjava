package mainpack;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JdbcSC {


	public static void main(String[] args) {
	
		try {

			CALL_ORACLE_STORED_PROCEDURE();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void CALL_ORACLE_STORED_PROCEDURE() throws SQLException {
		
		Connection dbConnection = null;
		CallableStatement cStatement = null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Establish a connection
			
			dbConnection=DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE","VINAY", "password");
			
			cStatement=dbConnection.prepareCall("{call QUERY_EMP(?,?,?,?)}");
			
			int empID=1;
			
			cStatement.setInt(1, empID);
			cStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(4, java.sql.Types.DECIMAL);
			
			cStatement.executeQuery();
			String empName=cStatement.getString(2);
			String LastName=cStatement.getString(3);
			BigDecimal Salary=cStatement.getBigDecimal(4);
			System.out.println("First Name:"+" "+ empName+" Last Name: "+LastName+" Salary:"+Salary);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			
			if (cStatement != null) {
				cStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}
		

		

		
    	
		
		
		
	}
	


