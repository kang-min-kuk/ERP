package login2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Check2 {
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

	} //-----------------↓회원가입------------------
	
	void singUp(String id, String pw) {
	 System.out.println("회원가입진행");
			//DB에 접속 후 id,pw 가지고 확인해서
		
			PreparedStatement stmt=null;
			Connection con=null;
			try {
				con=conn();
				//System.out.println("DB접속 성공");
				stmt= con.prepareStatement("INSERT INTO TBL_USER (ID, PW) VALUES (?,?)"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
				//4. Statement 객체를 가지고 spl 작업을 진행한다.
				
				//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
	
				stmt.setString(1,id);
				stmt.setString(2,pw);
				
				
				
				stmt.executeUpdate ();  //sql문 (select)실행하기;
				
			
			
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}finally {
				connClose(null,stmt,con);		
			}   
	}	//-----------------↓아이디 찾기 (패스워드만 아는 경우)------------------
			void singUp2(String pw) {
			
				ResultSet rs = null;
				PreparedStatement stmt=null;
				Connection con=null;
			try {
					con=conn();
					//System.out.println("DB접속 성공");
					stmt= con.prepareStatement("select * from tbl_user where pw=?"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
					stmt.setString(1,pw);
					rs=stmt.executeQuery();
					
					if(rs.next()) {
						System.out.println("아이디는 " + rs.getString("ID")+" 입니다");
					}
					//4. Statement 객체를 가지고 spl 작업을 진행한다.
					//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
	
					
	
					stmt.executeUpdate();  //sql문 (select)실행하기;
			}
				catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}finally {
					connClose(null,stmt,con);}
		}//-----------------↓패스워드 찾기 (id만 아는 경우)------------------
			void singUp3(String id) {
				
				ResultSet rs = null;
				PreparedStatement stmt=null;
				Connection con=null;
			try {
					con=conn();
					//System.out.println("DB접속 성공");
					stmt= con.prepareStatement("select * from tbl_user where id=?"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
					stmt.setString(1,id);
					rs=stmt.executeQuery();
					
					if(rs.next()) {
						System.out.println("패스워드는 " + rs.getString("PW")+" 입니다");
					}	//4. Statement 객체를 가지고 spl 작업을 진행한다.
						//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
		
					stmt.executeUpdate();  //sql문 (select)실행하기;
			}
				catch (Exception e) {
					System.out.println("예외발생");
					e.printStackTrace();
				}finally {
					connClose(null,stmt,con);}
	
	}//-----------------↓회원탈퇴 (ID , PW 전부 입력)------------------
			CheckType2 singUp4(String id, String pw) {
					
				PreparedStatement stmt=null;
				Connection con=null;
			try {
				con=conn();
				//System.out.println("DB접속 성공");
				stmt= con.prepareStatement("DELETE from TBL_USER where id=? and pw=?"); //3. 생선된 커넥션 개체를 가지고 Statement 객체를 생성한다.
				//4. Statement 객체를 가지고 spl 작업을 진행한다.
						
				//삽입,삭제 갱신시에는 .executeUpdate()리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
			
				stmt.setString(1,id);
				stmt.setString(2,pw);
				stmt.executeUpdate();      //여기는 왜 충돌이 안나는지?
						
				
				stmt.executeUpdate();  //sql문 (select)실행하기;
		}
			catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}finally {
				connClose(null,stmt,con);
			}		
			
			//1~3까지 값을 return주면 된다.
			return CheckType2.DB_ERROR;
	
	}
	List<User> list(){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Connection con=null;
		List<User> list = new ArrayList<>();
		
		try {
			con=conn();
			stmt= con.prepareStatement("select * from tbl_user"); 
			rs=stmt.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.id=rs.getString(1);
				u.pw=rs.getString(2);
				list.add(u);
			}
		}catch(Exception ex) {
			ex.printStackTrace(); //에러 내용 찍기
			System.out.println("설마 에러");
		}finally {
			connClose(rs,stmt,con);
	
		}
		return list;
	}
	void signUp(String id, String pw) {
		

		PreparedStatement stmt=null;
		Connection con=null;
		try {
			con=conn();
			//System.out.println("DB접속 성공");
			stmt= con.prepareStatement("INSERT INTO TBL_USER (ID, PW) VALUES (?, ?)"); //3.생성된 커넥션 개체를 가지고 Statement 객체를 생성한다.
			//4.Statement 객체를 가지고 sql 작업을 진행한다.
			
			//삽입,삭제,갱신시에는 .executeUpate() 리턴이 정수(정수가 의미하는 몇개가 처리되었는지)
			stmt.setString(1,id);
			stmt.setString(2,pw);
			stmt.executeUpdate();  //sql문(select)실행하기;
		
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally {
			connClose(null,stmt,con);
	
		}
	
	}
	
}
