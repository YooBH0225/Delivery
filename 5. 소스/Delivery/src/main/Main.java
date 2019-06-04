package main;


import java.util.Scanner;

import company.CompanyLogin;
import member.MemberMain;
import nomember.NoMemberMain;
import rider.RiderMain;
import store.StoreMain;

/**프로그램의 시작을 담당하는 Main 클래스*/
public class Main {

	private static Scanner scan ;//1번 생성 후 아래 루프에서 계속적으로 활용가능.
	
	
	
	static { //정적생성자
		scan = new Scanner(System.in);
	}
	
	
	
	
	
	/**프로그램의 시작을 담당하는 Main클래스의 main메소드*/
	public static void main(String[] args) {
		
		//불러오기
		Dummies dum = new Dummies();
		dum.dummy();
		
		
		// 업무
		
		System.out.println("\t                   sQBRr                \r\n" + 
	               "\t                uBBBBQBQ               \r\n" + 
	               "\t                BQBQBQBQBB:             \r\n" + 
	               "\t               iBBBBXJSbMBr             \r\n" + 
	               "\t               .BBBB1bBBBBS             \r\n" + 
	               "\t                QBBBBLBBBB              \r\n" + 
	               "\t  75K5XXj        1g72MBBR               \r\n" + 
	               "\t BBBBBBBBB:      ivrL:          .ID:    \r\n" + 
	               "\trBBQBBBBBBd   DBBBBBBBDr       .BBBB    \r\n" + 
	               "\t:BBBBBBBBB1 .BBBBBBBBBBBBBQQQBBBBBBB    \r\n" + 
	               "\t:QBBBBBBBBY BBBQBBBBBB1vXPEqvrBBY i     \r\n" + 
	               "\trBBBBBBBQB7.QBBBQBBBBB         RBX      \r\n" + 
	               "\t EBBBBBBBQ  BQBQBBBBBg         iBBB     \r\n" + 
	               "\t.iBBBBQBQr :QBBBBBBBBBBB5.     KQBBQ    \r\n" + 
	               "\t::       vBg7....iugBBBBBQK  .QBBBBB2r  \r\n" + 
	               "\t       Ijii7uISjv:::KBBBBBbMBBBBBBBBBB.\r\n" + 
	               "\t      :BBBBBBQBBBQBBBDBBBBBBBBBBBBSs: BB\r\n" + 
	               "\t      BBBBBBBBBBBBQBQBQBBBBBBB YQ  BB  B\r\n" + 
	               "\t     .BMDdPBBBPXBBBqEdZdEdZEM:  Bd    EB\r\n" + 
	               "\t            iEPdd7              .BBIIBB ");
			
		System.out.println("\n\n\n\t\t\t극 한 배 달\n\n");
		
			hello();
			
			// 메뉴출력 > 항목선택 > 기능실행
			boolean loop = true;
			while(loop) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t\t\t1.  회원\n");
				System.out.println("\t\t\t2. 비회원\n");
				System.out.println("\t\t\t3.  본사\n");
				System.out.println("\t\t\t4.  점포\n");
				System.out.println("\t\t\t5. 라이더\n");
				System.out.println("\n");
				
				
				System.out.println("\n\n\t   (종료를 원하시면 0을 입력해주세yo)");
				System.out.print("\n\t\t  이동할 화면 입력(숫자): ");
				String selNum = scan.nextLine();
				if ( selNum.equals("1")) {
					//1. 회원으로 이동
					MemberMain m = new MemberMain();
					m.memberMain();
				} else if (selNum.equals("2")) {
					//2.비회원으로 이동
					NoMemberMain nm = new NoMemberMain();
					nm.nomemberMain();
				} else if (selNum.equals("3")) {
					//3. 본사로 이동
					CompanyLogin c = new CompanyLogin();
					c.login();
				} else if (selNum.equals("4")) {
					//4. 점포로 이동
					StoreMain s = new StoreMain();
					s.storeMain();
				} else if (selNum.equals("5")) {
					//5. 라이더로 이동
					RiderMain r = new RiderMain();
					r.ridermainmain();
				} else if (selNum.equals("0")) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\n\n\t\t\t  종료");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
					loop = false;
				} else {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\t\t올바르지 않은 접근입니다.");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\t   계속하시려면 엔터키를 입력해주세요");
					scan.nextLine();
				}
			}
		
			
			
		
		
	}//main


	
	private static void hello() {
		System.out.println("\r\n\n\n\t\t어서와.. 배달은 처음이지..?\n\n");
		pause2();
	}
	
	public static void pause() {
		// 일시정지
		System.out.println("\n\n\t   계속하시려면 엔터를 입력해주세yo)");
		scan.nextLine();
	}
	public static void pause2() {
		// 일시정지
		System.out.println("\t        PRESS ENTER TO CONTUNUE...");
		scan.nextLine();
	}

}//class
