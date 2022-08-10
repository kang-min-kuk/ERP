package login3;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		String id = null;
		String pw = null;
		String data = null;
		String title = null;
		String substance = null;
		
		
		Scanner sc = new Scanner(System.in);
		Check cheak = new Check();
		
		for(;;) {
			System.out.println("**********************");
			System.out.println("*** 나의 ★일★기★장★ ***");
			System.out.println("**********************");
			System.out.println("    ***입장은 1번***    ");
			
			int menu = sc.nextInt();
			sc.nextLine();  //숫자 입력 후 엔터값 없애기
			
//------------------------↓로그인------------------------
			if(menu==1) {
				System.out.println("아이디를 입력해주세요");
				id=sc.nextLine();
				System.out.println("패스워드를 입력해주세요");
				pw=sc.nextLine();
				
				//객체(Check)의 메소드(login(string id, string pw):int (0: db접속오류 1:아이디가 틀리다.
				//2:패스워드가 틀리다. 3:회원삭제))를 통해서 로그인 여부 확인
				
				int flag=cheak.login(id,pw);
//------------------------↓입장이 맞다면 날짜 기록------------------------		
				
					System.out.println("날짜 입력  ex)220809");
					data=sc.nextLine();
					cheak.singUp1(data);
				
				
//------------------------↓제목 기록--------------------------------	
			
					System.out.println("제목");
					title=sc.nextLine();
					cheak.singUp2(title);    
			
				
				
//------------------------↓내용 기록--------------------------------	
				
					System.out.println("내용");
					substance=sc.nextLine();
					cheak.singUp3(substance);  
			
			
	//-----------------↓입장이 아닐 경우---------------------			
				
			//}else  {
		//		System.out.println("Thank You");

		//	}
	
	//	}//for
			}
			}	
}
}
