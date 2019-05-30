package member;

import java.util.ArrayList;
import java.util.Scanner;
import main.Dummies;
import main.Main;



/**
 * 
 * 
 * 
 * 
 @안상현 로그인 구체적인 실행 클래스입니다. 
 *
 *
 *
 */
public class MemberLogin {
	public static String loginID;
	private static String uName;
	private static String uAddress;
	private static String uPhonnum;
	private static String uPoint;
	
	private static String uID;
	private static Member_UI mu;
	private static OrderListCheck ol;
	
	private static MyMember ms;
	static {
		
		mu = new Member_UI();
		ms = new MyMember();
		ol = new OrderListCheck();
	}
	
	
	
	
	public static String getuID() {
		return uID;
	}


	public static void setuID(String uID) {
		MemberLogin.uID = uID;
	}


	public static String getuPoint() {
		return uPoint;
	}


	public static void setuPoint(String uPoint) {
		MemberLogin.uPoint = uPoint;
	}


	public static String getuAddress() {
		return uAddress;
	}


	public static void setuAddress(String address) {
		MemberLogin.uAddress = address;
	}


	public static String getuPhonnum() {
		return uPhonnum;
	}


	public static void setuPhonnum(String phonnum) {
		MemberLogin.uPhonnum = phonnum;
	}


	public static String getuName() {
		return uName;
	}


	public static void setuName(String uName) {
		MemberLogin.uName = uName;
	}


	/**
	 * 
	 * 
	 * @document 회원의 1번 입력시 나오는 로그인 페이지입니다.
	 * 
	 * 
	 */
	public void Memberloginmain (){
		
		boolean loop = true;

		while (loop) {
			
			Scanner scan = new Scanner(System.in);

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t안녕하세요. 회원느님!\r\n ");
			System.out.println();
			System.out.println("\t\t== 회원 로그인 화면 입니다. ==\r\n\r\n");

			System.out.print("\tID : ");
			String inputid = scan.nextLine();

			System.out.println();

			System.out.print("\tPW : ");
			String inputpw = scan.nextLine();

			boolean result = false;

			String loginname = "";

			for (int i = 0; i < Dummies.member.size(); i++) {
				if (Dummies.member.get(i).getMemberID().equals(inputid)
						&& Dummies.member.get(i).getMemberPW().equals(inputpw)) {
					loginname = Dummies.member.get(i).getMemberName();
					setuName(loginname);//사용자 이름 set
					setuAddress(Dummies.member.get(i).getMemberAddressCity()+ " " +Dummies.member.get(i).getMemberAddressGu() +  " " + Dummies.member.get(i).getMemberAddressDong());//사용자 사는곳 set
					setuPhonnum(Dummies.member.get(i).getMemberPhone());//사용자의 핸드폰 번호 
					setuPoint(Dummies.member.get(i).getMemberPoint());
					setuID(Dummies.member.get(i).getMemberID());
					loginID = Dummies.member.get(i).getMemberID();
					result = true;
					break;
				}
			}

			if (result) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t반갑습니다. %s님!\r\n", loginname);
				System.out.println();
				System.out.println("\t()()       () ()      () ()");
				System.out.println("\t(..)       (o.o)      (x x)");
				System.out.println("\t(  )       (   )      (   )");
				SuccessMenu();
				loop = false; 
			} else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t사용가능한 ID/PW가 아닙니다.");
				System.out.println();
				if (FailMenu() == 0) {
					loop = false;
				}
				
				//loop = false;
			}

		} // loop

		
		
		

		
	}
	
	/**
	 * 
	 * 
	 * @document: 로그인 성공시 나오는 주문 페이지입니다. 주문페이지의 선택안 중 하나를 선택합니다.
	 * 
	 */	
	public void SuccessMenu() {

		boolean loop = true;

		while (loop) {
			Scanner scan = new Scanner(System.in);

			mu.order();
			
			String input = scan.nextLine();

			System.out.println("\n\n");
			
			if (input.equals("0")) {
				loop = false;
			}else if(input.equals("1")) {
				ms.orderchoice();
				
			}else if(input.equals("2")) {
				
				ms.johae();
			}else if(input.equals("3")) {
				ol.orderlistcheck();
			}
				
		}
	} // SuccessMenu
	
	
	/**
	 * 
	 * 
	 * 
	 * @document: 로그인 실패시 나오는 페이지입니다. 다시 로그인 하거나, 초기화면으로 돌아갈 수 있습니다.
	 * 
	 * 
	 * 
	 */
	public int FailMenu() {
		
		int result = 1;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t1. 다시 로그인 하기\r\n");
		System.out.println("\t[뒤로 가기를 원하시면 0번을 입력하세yo]");
		System.out.println("\n");
		System.out.print("\t이동할 화면 입력(숫자) : ");
		
		String input = scan.nextLine();

		if (input.equals("0")) {
			result = 0;
		} else if (input.equals("1")) {
			result = 1;
		}
		return result;
}
}
