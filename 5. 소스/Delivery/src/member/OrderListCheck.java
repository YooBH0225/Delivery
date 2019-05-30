package member;

import java.util.Scanner;

import main.Dummies;
import main.OrderData;
import main.StoreData;

/**
 * 
 * @안지연 회원의 지난 배달 내역 조회 클래스입니다. 
 *
 */
public class OrderListCheck {

	MemberMain membermain = new MemberMain();
	Scanner scan = new Scanner(System.in);
	Member_UI memberui = new Member_UI();
	MyMember ms = new MyMember();
	
	public void orderlistcheck() {

		boolean loop = true;

		while (loop) {

			String myname = "";
			String myaddresscity = "";
			String myaddressgu = "";
			String myaddressdong = "";
			String myphonenum = "";
			String mystorenum = "";
			String mymenu = "";
			String mymenuprice = "";
			String mypoint = "";
			String stn = "";

			for (int i = 0; i < Dummies.member.size(); i++) {
				if (Dummies.member.get(i).getMemberID().equals(MemberLogin.loginID)) {
					myname = Dummies.member.get(i).getMemberName();
					myaddresscity = Dummies.member.get(i).getMemberAddressCity();
					myaddressgu = Dummies.member.get(i).getMemberAddressGu();
					myaddressdong = Dummies.member.get(i).getMemberAddressDong();
					myphonenum = Dummies.member.get(i).getMemberPhone();
					mypoint = Dummies.member.get(i).getMemberPoint();

				}
			}

			for (int j = 0; j < Dummies.order.size(); j++) {
				OrderData o = new OrderData();
				o = Dummies.order.get(j);

				if (o.getMemberID().equals(MemberLogin.loginID)) {
					mymenu = Dummies.order.get(j).getMenu();
					mymenuprice = Dummies.order.get(j).getMenuprice();
							
					for (StoreData s : Dummies.store) {
						if (o.getWhatmean().equals(s.getStoreID())) {
							stn = s.getStoreName();
							break;
						}
					}
				}
			}

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t안녕하세요. 회원느님!\r\n");
			System.out.printf("\t\t== %s 회원님의 정보입니다 ==\r\n\r\n", myname);
			System.out.printf("\t이름 : %s\r\n\r\n", myname);
			System.out.printf("\t주소 : %s %s %s\r\n\r\n", myaddresscity, myaddressgu, myaddressdong);
			System.out.printf("\t번호 : %s\r\n\r\n", myphonenum);
			System.out.printf("\t배달내역 :%s  %s %s원\r\n\r\n", stn, mymenu, mymenuprice);
			System.out.printf("\t가용 포인트 : %s\r\n\r\n\r\n", mypoint);
			System.out.println("\t\t()()       () ()       () ()");
			System.out.println("\t\t(..)       (o.o)       (x x)");
			System.out.println("\t\t(  )       (   )       (   )");
			
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("\n\n");
			System.out.println("\t1. 주문하기");
			System.out.println();
			System.out.println("\t[뒤로 가기를 원하면 0번을 입력해주세yo]");
			System.out.println();
			System.out.print("\t이동할 화면 입력(숫자) : ");
			String input = scan.nextLine();
			
			
			if (input.equals("0")) {
				loop = false;
			}
			else if(input.equals("1")) {
				ms.orderchoice();
			}
			
			}
		}
			
			
			
		} //loop
		
		
	

