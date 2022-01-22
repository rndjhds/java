package p2022_01_18;

import java.sql.*;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost는 자바와 oracle사용하는컴퓨터의 ip가같을떄 쓴다
		/*******************************************************************/
												// 1521은port번호 xe는 전역데이터를 가리킨다.
		/** My-SQL JDBC Driver *********************************************/
//	String driver ="com.mysql.jdbc.Driver";
//	String url = "jdbc:mysql://localhost/academy";
		/*******************************************************************/

		Connection con = null;

		try {

			Class.forName(driver);	// JDBC Driver Loading

			/** ORACLE에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "scott", "tiger");
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
//	  con = DriverManager.getConnection(url, "totoro", "1234" );
			/*******************************************************************/

			System.out.println("데이터베이스 연결 성공~!!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
