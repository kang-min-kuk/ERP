package login3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Check {
	private Connection conn() throws Exception {
		String url = "jdbc:oracle:thin:@192.168.0.6:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver"); //1.데이터베이스 드라이버를 로딩한다.
		return DriverManager.getConnection(url,"scott","tiger");// 2. 연결하여 커넥션 객체를 생성한다.
		
	}
	
	private void connClose(ResultSet rs, PreparedStatement stmt, Connection con) {
		try { if(rs!=null) rs.close();  }  catch (Exception e) { }
		try { if(stmt!=null) stmt.close();  }  catch (Exception e) { }
		try { if(con!=null) con.close();  }  catch (Exception e) { }
		
	}

	int login(String id, String pw) {
		//DB에 접속 후 id,pw 가지고 확인해서
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Connection con=null;
		int flag = 0;
		try {
			con=conn();
			//System.out.println("DB접속 성공");
			stmt= con.prepareStatement("select * from tbl_user where id=?"); 
			//4. Statement 객체를 가지고 sql 작업을 진행한다.
			
			//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
			stmt.setString(1, id);
			rs=stmt.executeQuery();
//			rs=stmt.executeQuery("select * from tbl_user where id='"+id+"'");  //sql문 (select)실행하기;
			if(rs.next()) { //한행이 있다면 (즉, 아이디가 잇다면)
			  String dbPw=rs.getString("pw"); //db의 결과값 중 컬럼이 pw인 값을 읽는다
			  if(pw.equals(dbPw))
				  flag=3;
			  else
				  flag=2;
			}else
				flag=1;
		
		
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
			}finally {
				connClose(rs,stmt,con);
				
			} 
		
			 return flag;

	} //-----------------↓날짜기록------------------
	
			void singUp1(String data) {
					// System.out.println("회원가입진행");
					//DB에 접속 후 id,pw 가지고 확인해서
			ResultSet rs = null;
			PreparedStatement stmt=null;
			Connection con=null;
			try {
				con=conn();
				//System.out.println("DB접속 성공");
				stmt= con.prepareStatement("INSERT INTO TBL_USER (data) VALUES (?)"); 
				//3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
				//4. Statement 객체를 가지고 spl 작업을 진행한다.
				
				//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
	
				stmt.setString(1, data);
				stmt.executeUpdate(); //sql문 (select)실행하기;
			
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}finally {
				connClose(rs,stmt,con);		
			}   
	}	//-----------------↓제목 기록------------------
			void singUp2(String title) {
			
				ResultSet rs = null;
				PreparedStatement stmt=null;
				Connection con=null;
			try {
					con=conn();
					//System.out.println("DB접속 성공");
					stmt= con.prepareStatement("INSERT INTO TBL_USER (title) VALUES (?)"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
				
					
					
					//4. Statement 객체를 가지고 spl 작업을 진행한다.
					//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
	
					stmt.setString(1,title);
	
					stmt.executeUpdate();  //sql문 (select)실행하기;
			}
				catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}finally {
					connClose(null,stmt,con);}
		}//-----------------↓내용 기록------------------
			void singUp3(String substance) {
				
				ResultSet rs = null;
				PreparedStatement stmt=null;
				Connection con=null;
			try {
					con=conn();
					//System.out.println("DB접속 성공");
					stmt= con.prepareStatement("INSERT INTO TBL_USER (substance) VALUES (?)"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
		
			//		rs=stmt.executeQuery();
					
					
						//4. Statement 객체를 가지고 spl 작업을 진행한다.
						//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
					stmt.setString(1,substance);
					stmt.executeUpdate();  //sql문 (select)실행하기;
			}
				catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}finally {
					connClose(null,stmt,con);}
	
	}
	
	
	
}
