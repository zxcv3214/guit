package ex21_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_Oracle_insert_direct {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			//1단계 : JDBC 드라이버 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계 : DB에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url , "scott" , "tiger");
			stmt = conn.createStatement();
			/*
			 	1. 직접 데이터를 입력하는 경우
			 	insert into goodsinfo
			 	values('A1000','고급 핸드폰',100,'LG');
			 
			 */
			String sql = "insert into Goodsinfo "
					+ "values('A1000','고급 핸드폰',100,'LG')";
			System.out.println(sql);
			/*
			 	INSERT, UPDATE, DEETE 문을 실행하는 메소드는 executeUpdate()입니다.
			 	executeUpdate()의 리턴값은 INSERT,UPDATE,DELETE 수행 된 row의 수입니다.
			 */
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가되었습니다.");	
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		}finally {
			if(stmt != null)
				try {
					stmt.close();//4단계 : DB연결하기
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			if(conn != null)
				try {
					conn.close();//4단계 : DB연결하기
				} catch (SQLException e) {
					System.out.println(e.getMessage());
			}
		}//finally end
		}
	}

