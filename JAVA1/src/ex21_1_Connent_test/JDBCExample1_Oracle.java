package ex21_1_Connent_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1_Oracle {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1단계: JDBC 드라이버를 로드한다.
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계: DB연결한다
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			
			//3단계 : 메시지 출력 명령문으로 대체
			System.out.println("데이터베이스에 접속했습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
				if(conn != null)
					try {
						conn.close();//4단계 : DB연결하기
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
			}
		}
}
