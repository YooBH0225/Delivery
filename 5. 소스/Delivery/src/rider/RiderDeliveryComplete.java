package rider;

import java.util.ArrayList;
import java.util.Scanner;

import main.Dummies;

/**
 * 
 * @author 조성빈
 * 라이더 배달 완료 목록을 담당하는 클래스입니다.
 *
 */
public class RiderDeliveryComplete {

	/**
	 * Scanner를 통해 입력받은 데이터를 저장하는 변수입니다.
	 */
	public static Scanner scan = new Scanner(System.in);

	/**
	 * 라이더 배달 완료 목록을 출력하고 선택지를 입력받아 배달 상세 보기 화면을 출력하는 메소드입니다.
	 */
	public void riderdeliverycomplete() {

		RiderLogin rl = new RiderLogin();

		boolean loop = true;
		while (loop) {


			int order = 0;
			for (int i = 0; i<Dummies.order.size(); i++) {
				if (Dummies.order.get(i).getComplete().equals("완료")
						&& Dummies.order.get(i).getRiderID().equals(rl.getUserID())) {
					order++;
				}
			}

			System.out.printf("\n\n\t오늘의 배달 횟수는 %d회입니다.\n\n", order);

			int complete = 0;
			System.out.println("\t고객 연락처  |  고객 주소  |  가게 이름  |  가게 번호  |  회원 유무  ");
			System.out.println("\t======================================================================================");
			for (int i = 0; i<Dummies.order.size(); i++) {
				if (Dummies.order.get(i).getComplete().equals("완료")
						&& Dummies.order.get(i).getRiderID().equals(rl.getUserID())) {

					String storeid = Dummies.order.get(i).getWhatmean();
					String storename = findstorename(storeid);
					String storephone = findstorephone(storeid);
					
					String memberid = Dummies.order.get(i).getMemberID();
					String memstat = "";
					if (Dummies.order.get(i).getMemberID().contains("TC")) {
						memstat = "비회원";
					} else {
						memstat = "회원";
					}
					String membercity = findmembercity(memberid);
					String membergu = findmembergu(memberid);
					String memberdong = findmemberdong(memberid);
					String memberphone = findmemberphone(memberid);
					complete ++;
					System.out.printf("\t%d. %s|%s %s %s|%s|%s|%s\n\n", complete, memberphone, membercity, membergu, memberdong, storename, storephone, memstat);
				}
			}//for
			
			System.out.println("\t======================================================================================");
			System.out.println("\n\t    자세히 보실 주문 번호를 선택해주세요.");
			System.out.println("\n\t   (뒤로가기를 원하시면 0을 입력해주세yo)");
			System.out.print("\n\t\t  선택할 주문 번호 입력(숫자) : ");
			String selNum = scan.nextLine();
			System.out.println("\n\n");
			
			int num = 0;
			if (selNum.equals("0")) {
				loop = false;
			} else if (Integer.parseInt(selNum) > 0 && Integer.parseInt(selNum) <= complete) {
			
			for (int i = 0; i<Dummies.order.size(); i++) {
				
				
				if (Dummies.order.get(i).getComplete().equals("완료")
						&& Dummies.order.get(i).getRiderID().equals(rl.getUserID())) {
					num++;
					if (num == Integer.parseInt(selNum)) {
						String storeid = Dummies.order.get(i).getWhatmean();
						String storename = findstorename(storeid);
						String storephone = findstorephone(storeid);
						String storecity = findstorecity(storeid);
						String storegu = findstoregu(storeid);
						String storedong = findstoredong(storeid);
						String menu = Dummies.order.get(i).getMenu();
						String menuprice = Dummies.order.get(i).getMenuprice();
						
						String memberid = Dummies.order.get(i).getMemberID();
						String memstat = "";
						if (Dummies.order.get(i).getMemberID().contains("TC")) {
							memstat = "비회원";
						} else {
							memstat = "회원";
						}
						String membercity = findmembercity(memberid);
						String membergu = findmembergu(memberid);
						String memberdong = findmemberdong(memberid);
						String memberphone = findmemberphone(memberid);
						String membername = findmembername(memberid);
						
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\n\n\t\t[주문 상세보기]\n");
						System.out.println("\t[고객]");
						System.out.printf("\t이름 : %s\n", membername);
						System.out.printf("\t주소 : %s %s %s\n", membercity, membergu, memberdong);
						System.out.printf("\t전화번호 : %s\n", memberphone);
						System.out.printf("\t주문 내역 : %s\n", menu);
						System.out.printf("\t주문 가격 : %s원\n\n", menuprice);
						
						System.out.println("\t[점포]");
						System.out.printf("\t점포 이름 : %s\n", storename);
						System.out.printf("\t주소 : %s %s %s\n", storecity, storegu, storedong);
						System.out.printf("\t전화번호 : %s\n\n", storephone);
						
						System.out.println("\n\n\t   (뒤로가기를 원하시면 엔터를 입력해주세yo)");
						scan.nextLine();
						break;
					}
				}
				
				
				
			}
			}
			
			//scan.nextLine();
			//loop = false;

		}//loop
	}//

	private String findmembername(String memberid) {
		
		String n = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberid)) {
				n = Dummies.member.get(i).getMemberName();
				break;
			}
		}
		
		for (int i = 0; i < Dummies.nomember.size(); i++) {
			if (Dummies.nomember.get(i).getNomemberID().equals(memberid)) {
				n = Dummies.nomember.get(i).getNomemberName();
				break;
			}
		}

		return n;
	}

	private String findstoredong(String storeid) {
		
		String n = "";
		for (int i = 0; i < Dummies.store.size(); i++) {
			if (Dummies.store.get(i).getStoreID().equals(storeid)) {
				n = Dummies.store.get(i).getStoreAddressDong();
				break;
			}
		}

		return n;
	}

	private String findstoregu(String storeid) {
		
		String n = "";
		for (int i = 0; i < Dummies.store.size(); i++) {
			if (Dummies.store.get(i).getStoreID().equals(storeid)) {
				n = Dummies.store.get(i).getStoreAddressGu();
				break;
			}
		}

		return n;
	}

	private String findstorecity(String storeid) {
		
		String n = "";
		for (int i = 0; i < Dummies.store.size(); i++) {
			if (Dummies.store.get(i).getStoreID().equals(storeid)) {
				n = Dummies.store.get(i).getStoreAddressCity();
				break;
			}
		}

		return n;
	}

	private String findmemberdong(String memberid) {
		
		String n = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberid)) {
				n = Dummies.member.get(i).getMemberAddressDong();
				break;
			}
		}
		
		for (int i = 0; i < Dummies.nomember.size(); i++) {
			if (Dummies.nomember.get(i).getNomemberID().equals(memberid)) {
				n = Dummies.nomember.get(i).getNomemberDong();
				break;
			}
		}

		return n;
	}

	private String findmembergu(String memberid) {
		
		String n = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberid)) {
				n = Dummies.member.get(i).getMemberAddressGu();
				break;
			}
		}
		
		for (int i = 0; i < Dummies.nomember.size(); i++) {
			if (Dummies.nomember.get(i).getNomemberID().equals(memberid)) {
				n = Dummies.nomember.get(i).getNomemberGu();
				break;
			}
		}

		return n;
		
	}

	private String findmemberphone(String memberid) {
		
		String n = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberid)) {
				n = Dummies.member.get(i).getMemberPhone();
				break;
			}
		}
		
		for (int i = 0; i < Dummies.nomember.size(); i++) {
			if (Dummies.nomember.get(i).getNomemberID().equals(memberid)) {
				n = Dummies.nomember.get(i).getNomemberPhone();
				break;
			}
		}

		return n;
	}

	private String findmembercity(String memberid) {

		String n = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberid)) {
				n = Dummies.member.get(i).getMemberAddressCity();
				break;
			}
		}
		
		for (int i = 0; i < Dummies.nomember.size(); i++) {
			if (Dummies.nomember.get(i).getNomemberID().equals(memberid)) {
				n = Dummies.nomember.get(i).getNomemberSi();
				break;
			}
		}

		return n;
	}

	private String findstorephone(String storeid) {

		String n = "";
		for (int i = 0; i < Dummies.store.size(); i++) {
			if (Dummies.store.get(i).getStoreID().equals(storeid)) {
				n = Dummies.store.get(i).getStorePhone();
				break;
			}
		}

		return n;
	}

	private String findstorename(String storeid) {

		String n = "";
		for (int i = 0; i < Dummies.store.size(); i++) {
			if (Dummies.store.get(i).getStoreID().equals(storeid)) {
				n = Dummies.store.get(i).getStoreName();
				break;
			}
		}

		return n;
	}

}
