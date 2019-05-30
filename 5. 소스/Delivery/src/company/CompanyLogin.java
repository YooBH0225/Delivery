package company;

import java.util.Scanner;

import main.Main;


/**본사의 로그인 클래스 (비밀번호만 입력하면됨)*/
public class CompanyLogin {

/**본사의 로그인 메소드로 입력받은 비밀번호로 로그인을담당 함*/
	public void login() {
		
			boolean loop = true;
			while(loop) {
				Scanner scan = new Scanner(System.in);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t     ===  본사의 로그인 화면입니다  ===");
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t  로그인");
				System.out.println();
				System.out.println("\n\n\t  (뒤로가기를 원하면 0을 입력해주세yo)");
				System.out.println();
				System.out.print("\n\t\t  비밀번호(숫자): ");
				String numS = scan.nextLine();
				
			if(numS.equals("1234")) {
					CompanyChoice c = new CompanyChoice();
					c.choice();
				}else if(numS.equals("0")){
					loop= false;
				}else {
					System.out.println("\t       올바르지않은 비밀번호입니당");
					System.out.println("\t    계속하시려면 엔터키를 입력해주세요");
					scan.nextLine();
				}
			}
		
	}//
	
		
	
	
	
	
}