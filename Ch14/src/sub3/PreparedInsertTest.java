package sub3;
/*
 * 날자 : 2023/07/11
 * 이름 : 김병준
 * 내용 PreparedInsert 실습하기
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsertTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL 실행 객체 생성
			String sql = "INSERT INTO `User2` VALUES ( ?, ?, ?, ?)"; // ?:쿼리 파라미터(값을 매핑시켜야함)
			PreparedStatement psmt = conn.prepareStatement(sql); //쿼리문 생성
			psmt.setString(1, "j101"); // 첫번째 자리에 j101을 매핑
			psmt.setString(2, "홍길동"); 
			psmt.setString(3, "010-1234-1001"); 
			psmt.setInt(4,23); 
			
			//4단계 - SQL 실행
			psmt.executeUpdate();
			
			//5단계 - 결과처리(SELECT 경우)
			//6단계 - 연결해제
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
