package member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import main.Dummies;
import main.Main;
import main.Main;
/**
 * 
 * @안상현 sist56  첫 홈화면에서 회원을 선택하면 나오는 페이지입니다. 
 * 
 * 
 */
public class MemberMain {
	



	private static Scanner scan;
	private static String getName;
	private static String ID;
	private static String address;
	private static String Phone;
	private static String order;
	private static String point;
	private static String orderList;
	
	

	public static String getOrderList() {
		return orderList;
	}

	public static void setOrderList(String orderList) {
		MemberMain.orderList = orderList;
	}

	static {
		scan = new Scanner(System.in);
	}
	MemberLogin memberlogin = new MemberLogin();
		NewMember newmember = new NewMember();

	
		
		
		/**
		 * 
		 *  @document 회원 페이지의 초기화면입니다. 로그인/회원가입 중 선택할 수 있습니다.
		 * 
		 */
		public void memberMain() {

		boolean loop = true;
		while (loop) {
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t\t == Member!! == ");
			System.out.println();
			System.out.println("\t1. 로그인");
			System.out.println();
			System.out.println("\t2. 회원가입");
			System.out.println();
			System.out.println("\t[뒤로 가기를 원하면 0번을 눌러주세yo]");
			System.out.println();
			System.out.println("\n");
			System.out.print("\t이동할 화면 입력(숫자) : ");
			String input = scan.nextLine();

			if (input.equals("0")) {
				loop = false;
			} else if (input.equals("1")) {
				memberlogin.Memberloginmain();
			} else if (input.equals("2")) {
				newmember.NewMembermain();
			}

		} // loop

	}// main

	public static String getGetName() {
		return getName;
	}

	public static void setGetName(String getName) {
		
		System.out.println("\t\t\t\tID를 입력해주세요");
		ID = scan.nextLine();
		getName = scan.nextLine();
		// ArrayLIst중에 입력한 회원아이디가 있으면 값을 getName에 저장합니다.
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID() == ID) {
				setGetName(getName);

			}
		}
		MemberMain.getName = getName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {

		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberName() == getName) {
				setAddress(Dummies.member.get(i).getMemberAddressCity() + Dummies.member.get(i).getMemberAddressGu()
						+ Dummies.member.get(i).getMemberAddressDong());

			}
		}
		MemberMain.address = address;
	}

	public static String getPhone() {
		return Phone;
	}

	public static void setPhone(String phone) {

		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID() == ID) {
				setPhone(Dummies.member.get(i).getMemberPhone());
			}
		}

		MemberMain.Phone = phone;
	}

	public static String getOrder() {
		return getOrderList();
	}

	public static void setOrder(String order) {

		for (int i = 0; i < Dummies.order.size(); i++) {

			for (int j = 0; j < Dummies.store.size(); j++) {
				if (Dummies.order.get(i).getWhatmean().equals(Dummies.store.get(j).getStoreID())) {

					setOrderList(Dummies.store.get(j).getStoreName() + Dummies.order.get(i).getMenu()
							+ Dummies.order.get(i).getMenuprice() + "\r\n");

				}

			}
		}

	}

	public static String getPoint() {
		return point;
	}

	public static void setPoint(String point) {

		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID() == ID) {
				setPoint(Dummies.member.get(i).getMemberPoint());
			}
		}
	}

}

		
		
			
	
		
		
		

