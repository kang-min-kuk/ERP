package login;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		String id = null;
		String pw = null;
		
		
		Scanner sc = new Scanner(System.in);
		Check cheak = new Check();
		
		for(;;) {
			System.out.println("1=로그인, 2=회원가입 \n3=아이디 찾기, 4=패스워드 찾기\n5=회원탈퇴");
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
				
	//--------------------↓회원가입----------------------	
			}
			if (menu==2){
				System.out.println("회원가입을 시작합니다");
				System.out.println("아이디를 입력해주세요");
				id=sc.nextLine();
				System.out.println("패스워드를 입력해주세요");
				pw=sc.nextLine();
				cheak.singUp(id,pw);
				System.out.println("회원가입완료");
	//-----------------↓아이디 찾기 (패스워드만 아는 경우)------------------			
		}	
			if (menu==3) {
					System.out.println("패스워드를 입력해주세요");
					pw=sc.nextLine();
					
					cheak.singUp2(pw);
//					System.out.println("아이디는 "+id+" 입니다");
					
	//-----------------↓패스워드 찾기 (id만 아는 경우)------------------				
			}if (menu==4) {
					System.out.println("아이디를 입력해주세요");
					id=sc.nextLine();
				
					cheak.singUp3(id);
//					System.out.println("패스워드는 "+pw+" 입니다");
				
	//-----------------↓회원탈퇴 (ID , PW 전부 입력)------------------			
				
			}else if (menu==5) {
				System.out.println("회원탈퇴를 시작합니다");
				System.out.println("회원 아이디를 입력해주세요");
				id=sc.nextLine();
				System.out.println("패스워드를 입력해주세요 :");
				pw=sc.nextLine();
				cheak.singUp4(id,pw);
				System.out.println("회원탈퇴 완료\r이용해주셔서 감사합니다");
			}
	
		}//for

	}
}
