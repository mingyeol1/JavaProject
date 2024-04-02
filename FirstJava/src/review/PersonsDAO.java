package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {

	
		
		private String url = "jdbc:mariadb://localhost:13306/testdb";
		private String user = "root";
		private String password = "root1234";
		
		//데이터 접속을 위한 객체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		//생성자를 Connection 객체 생성
		
		public PersonsDAO() {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("Connection 객체 생성.");
				
			} catch (ClassNotFoundException ce) {
				System.out.println("드라이브 연동 실패");
				System.out.println(ce.getMessage());
			} catch (SQLException sqle) {
				System.out.println("SQL연동 실패");
				System.out.println(sqle.getMessage());
			}
		}
		
		public PersonsDAO(String url, String user, String password) {
			this.url = url;
			this.user = user;
			this.password = password;
			
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("Connection 객체 생성.");
				
			} catch (ClassNotFoundException ce) {
				System.out.println("드라이브 연동 실패");
				System.out.println(ce.getMessage());
			} catch (SQLException sqle) {
				System.out.println("SQL연동 실패");
				System.out.println(sqle.getMessage());
			}
		}
		
		//CRUD 메서드
		// 1. 데이터 입력 메서드
		
		// insert
		public int insert(PersonsVO vo) {
			int result = 0;
			
			String sql = "insert into Persons (id, lastname, firstname, age, city)"
					+ "values("+vo.getId()+",'"+vo.getLastname()+"','"+vo.getFirstname()+"'"
					+ ","+vo.getAge()+" ,'"+vo.getCity()+"')";
			
			try {
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
					System.out.println("SQL 연동실패");
					System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
				} catch (Exception e2) {
					
				}
			}
			
			return result;
		}
		
		// selectAll
		public List<PersonsVO> selectAll(){
			List<PersonsVO> list = new ArrayList<>();
			
			String sql = "select * from Persons Order by id desc";
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int id = rs.getInt("id");
					String lastname = rs.getString("lastname");
					String firstname = rs.getString("firstname");
					int age = rs.getInt("age");
					String city = rs.getString("city");
					PersonsVO vo = new PersonsVO(id, firstname, lastname, age, city);
					list.add(vo);
					
				}
				
			} catch (SQLException e) {
				System.out.println("SQL연동 실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
					if(rs != null) rs.close();
				} catch (Exception e2) {}
			}
			
			return list;
		}
		
		
		
		
		//selectOne
		public PersonsVO selectOne(int id) {
			PersonsVO vo = null;
			
			String sql = "select * from Persons where id = '"+id+"'";
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					vo = new PersonsVO(rs.getInt("id"),rs.getString("lastName"),rs.getString("firstName"),rs.getInt("age"),rs.getString("city"));
				}
			} catch (SQLException e) {
				System.out.println("SQL 연동실패");
				System.out.println(e.getMessage());
			}finally {
				try {
					if(stmt != null ) stmt.close();
					if(rs != null) rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			return vo;
		}
		
		
		// update
		public int update(PersonsVO vo) {
			int result = 0;
			
			String sql = "update persons set firstname = '"+vo.getFirstname()+"', "
			+"lastname = '"+vo.getLastname()+"', age = "+vo.getAge()+
			", city = '"+vo.getCity()+"'where id = "+vo.getId();
			
			try {
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println("SQL 연동 실패");
				System.out.println(e.getMessage());
			}finally {
				try {
					if(stmt != null) stmt.close();
					if(rs != null) rs.close();
				} catch (Exception e2) {}
			}
			
			return result;
		}
		// delete
		
		public int delete(int id) {
			int result = 0;
			
			String sql = "delete from Persons where id = '"+id+"'";
			
			try {
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println("SQL 연동실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
				} catch (Exception e2) {}
			}
			
			return result;
		}
	

}
