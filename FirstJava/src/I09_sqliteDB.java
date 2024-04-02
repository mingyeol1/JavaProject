import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class I09_sqliteDB {

	public static void main(String[] args) {
		// SQLite DB연결하기
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("org.sqlite.JDBC");
			
			//2. Connection
			String dbfile = "SQLiteDB.db";	//실제 DB파일이 있는 경로.
			String url = "jdbc:sqlite:"+dbfile; //파일경로 집어넣기.
			//url  ->jdbc:sqlite:SQLiteDB.db
			
			conn = DriverManager.getConnection(url);
			System.out.println("DB 동작에 문제가 없습니다.");
			
			//3. stmt 객체 생성
			stmt = conn.createStatement();
			String sql = "create table if not exists test_table("
											+"id integer primary key,"
											+"lastName text(20) not null,"
											+"firstName text(20),"
											+"age numeric,"
											+"city text(20) default 'Seoul')";
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 처리 결과 : " + (result !=0? "성공":"실패"));
			stmt.close();
			
			//CRUD 테스트 하세요
//			String sql1 = "insert into test_table (id, firstname, lastname, age, city)"
//					+ "values(1,'jdbcTest','testuser13',24,'Seoul')";
//			String sql2 = "update test_table set firstname = '민결', lastname='김',age = 28,city = 'Incheon' "
//					+"where id = 1";
//			String sql3 = "delete from test_table where id = 1";
//			result = stmt.executeUpdate(sql3);
			String selectSql = "select * from test_table";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("id : "+rs.getInt("id")+", lastname : "+rs.getString("lastname")
				+", firstname : "+rs.getString("firstname")+", age"+rs.getInt("age : ")+", city : "+rs.getString("city"));
				stmt.close();
			}
			
			
		}catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패.");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동실패");
			System.out.println(sqle.getMessage());
		}finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
