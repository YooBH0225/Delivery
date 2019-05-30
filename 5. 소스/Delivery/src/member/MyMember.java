package member;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import main.Dummies;
/**
 *  @안상현 회원의 주문 및 회원 정보 관리 클래스입니다.
 * 
 */
public class MyMember {

	

	private static Member_UI mui;
	private static Scanner scan;
	private static ArrayList<Order> list;
	static ArrayList<accumKorStore> ks;
	static ArrayList<accumCHinaStore> chs;
	static ArrayList<accumJapanStore> js;
	static ArrayList<accumChickenStore> chickens;
	static ArrayList<accumPizzaStore> pizzas;
	MemberLogin ml = new MemberLogin();
	private static String getget;

	public static String getGetget() {
		return getget;
	}

	public static void setGetget(String getget) {
		MyMember.getget = getget;
	}

	static {

		mui = new Member_UI();
		scan = new Scanner(System.in);
		list = new ArrayList<Order>();// Member 데이터 수정 및 저장하는 작업
		ks = new ArrayList<accumKorStore>();
		chs = new ArrayList<accumCHinaStore>();
		js = new ArrayList<accumJapanStore>();
		chickens = new ArrayList<accumChickenStore>();
		pizzas = new ArrayList<accumPizzaStore>();
	}

	/**
	 * 
	 * @document: 회원정보 검색 페이지입니다.
	 * 
	 * 
	 */
	public void johae() {
		mui.title(Member_UI.INFO);
		System.out.println("\t\t안녕하세요 회원느님!!>.<");
		System.out.println("\n\n");
		System.out.println("\t\t == 회원님의 정보입니다 ==");
		System.out.println("\n\n");
		System.out.printf("\t이름: %s \r\n\r\n \t주소: %s \r\n\r\n \t번호: %s \r\n\r\n \t포인트: %s \r\n\r\n", ml.getuName(), ml.getuAddress(), ml.getuPhonnum(),ml.getuPoint());

		mui.pause(Member_UI.INFO);
//		ml.Memberloginmain ();

	}

	/**
	 * 
	 * 
	 * @document: 회원의 주소에 인접한 점포들의 리스트와 점포 선택 페이지입니다.
	 * 
	 * 
	 */
	public void orderchoice() {
		
		
		boolean result = true;
		
		
		mui.title(Member_UI.ORDER);
		System.out.println("\n");
		System.out.printf("\t[나의 주소: %s]", ml.getuAddress());
//		System.out.println("\t" + ml.getuAddress());
		// 한 곳에서만 쓰이는 경우 UI말고 여기서 사용(선택)
		System.out.println("\n\n");
		System.out.println("\t집 주변 배달집 탐색 결과 입니당!!!>.<");
		while(result) {
		System.out.println("\n\n");
		System.out.println("[1.한식]\t [2.중식]\t [3.일식]\t[4.치킨]\t[5.피자]");
		System.out.println("\n\n");
		// 리스트 가져오기

		// for(menu )
		System.out.print("\t이동할 화면 입력(숫자) : ");

		String content = scan.nextLine();
		setGetget(content);
		
		System.out.println("\n");

		if (content.equals("1")) {

			for (int i = 0; i < Dummies.store.size(); i++) {
				if ((ml.getuAddress().contains(
						Dummies.store.get(i).getStoreAddressCity() + " " + Dummies.store.get(i).getStoreAddressGu()))
						&& Dummies.store.get(i).getStoreID().contains("Sa")) {
//					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println(
							"\t\t\t\t   " + Dummies.store.get(i).getStoreID() + "  " + Dummies.store.get(i).getStoreName());

					ks.add(new accumKorStore(Dummies.store.get(i).getStoreID(), Dummies.store.get(i).getStoreName(),
							Dummies.store.get(i).getStoreOrderCount()));

				}

			}
			mui.choose();
		
		} // for
		else if (content.equals("2")) {
			for (int i = 0; i < Dummies.store.size(); i++) {
				if (ml.getuAddress().contains(
						Dummies.store.get(i).getStoreAddressCity() + " " + Dummies.store.get(i).getStoreAddressGu())) {

					if (Dummies.store.get(i).getStoreID().contains("Sb")) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\t\t   " + Dummies.store.get(i).getStoreID() + "  "
								+ Dummies.store.get(i).getStoreName());

						chs.add(new accumCHinaStore(Dummies.store.get(i).getStoreID(),
								Dummies.store.get(i).getStoreName(), Dummies.store.get(i).getStoreOrderCount()));

					}

				}

			} // for
			mui.choose();

		} else if (content.equals("3")) {
			for (int i = 0; i < Dummies.store.size(); i++) {
				if (ml.getuAddress().contains(
						Dummies.store.get(i).getStoreAddressCity() + " " + Dummies.store.get(i).getStoreAddressGu())) {

					if (Dummies.store.get(i).getStoreID().contains("Sc")) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\t\t   " + Dummies.store.get(i).getStoreID() + "  "
								+ Dummies.store.get(i).getStoreName());

						js.add(new accumJapanStore(Dummies.store.get(i).getStoreID(),
								Dummies.store.get(i).getStoreName(), Dummies.store.get(i).getStoreOrderCount()));
					}

				}

			} // for
			
			mui.choose();
		} else if (content.equals("4")) {
			for (int i = 0; i < Dummies.store.size(); i++) {
				if (ml.getuAddress().contains(
						Dummies.store.get(i).getStoreAddressCity() + " " + Dummies.store.get(i).getStoreAddressGu())) {

					if (Dummies.store.get(i).getStoreID().contains("Sd")) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\t\t   " + Dummies.store.get(i).getStoreID() + "  "
								+ Dummies.store.get(i).getStoreName());

						chickens.add(new accumChickenStore(Dummies.store.get(i).getStoreID(),
								Dummies.store.get(i).getStoreName(), Dummies.store.get(i).getStoreOrderCount()));
					}

				}

			} // for
			
			mui.choose();
		} else if (content.equals("5")) {
			for (int i = 0; i < Dummies.store.size(); i++) {
				if (ml.getuAddress().contains(
						Dummies.store.get(i).getStoreAddressCity() + " " + Dummies.store.get(i).getStoreAddressGu())) {

					if (Dummies.store.get(i).getStoreID().contains("Se")) {
//						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("\t\t   " + Dummies.store.get(i).getStoreID() + "  "
								+ Dummies.store.get(i).getStoreName());
						pizzas.add(new accumPizzaStore(Dummies.store.get(i).getStoreID(),
								Dummies.store.get(i).getStoreName(), Dummies.store.get(i).getStoreOrderCount()));
					}

				}

			} // for
			
			mui.choose();
		} else {
			System.out.println("\n\n\t\t   다시 선택해주세요 !\n\n");
			result = false;

		}
		
		
		}
		
		
	}// orderchoice 메소드

	/**
	 * 
	 * @document 특정 카테고리를 선택했을 때 나오는 점포들의 리스트 페이지입니다.
	 * 
	 * 
	 * 
	 */
	public void accumlateList() {

		// 정렬 - 방의 순서가 없어서 정렬이 불가능
		// Set -> (변환) -> List

		if (getGetget().equals("1")) {

			// 특정값으로 정렬
			Collections.sort(ks, new Comparator<accumKorStore>() {

				@Override
				public int compare(accumKorStore o1, accumKorStore o2) {
					

					
//					return o1.getOc().compareTo(o2.getOc());
					Integer i = new Integer(o1.getOc()); 
					return i.compareTo(Integer.parseInt(o2.getOc()));

				}
			});
			for(int i = 0;i<ks.size();i++) {
			System.out.println(ks.get(i));
			}
		} else if (getGetget().equals("2")) {

			Collections.sort(chs, new Comparator<accumCHinaStore>() {

				@Override
				public int compare(accumCHinaStore o1, accumCHinaStore o2) {
					
//					return o2.getOc().compareTo(o1.getOc());
					Integer i = new Integer(o1.getOc()); 
					return i.compareTo(Integer.parseInt(o2.getOc()));

				}
			});

			for(int i = 0;i<chs.size();i++) {
				System.out.println(chs.get(i));
				}

		} else if (getGetget().equals("3")) {

			Collections.sort(js, new Comparator<accumJapanStore>() {

				@Override
				public int compare(accumJapanStore o1, accumJapanStore o2) {
					
//					return o2.getOc().compareTo(o1.getOc());
					Integer i = new Integer(o1.getOc()); 
					return i.compareTo(Integer.parseInt(o2.getOc()));

				}
			});

			for(int i = 0;i<js.size();i++) {
				System.out.println(js.get(i));
				}

		} else if (getGetget().equals("4")) {

			Collections.sort(chickens, new Comparator<accumChickenStore>() {

				@Override
				public int compare(accumChickenStore o1, accumChickenStore o2) {
					
//					return o2.getOc().compareTo(o1.getOc());
					Integer i = new Integer(o1.getOc()); 
					return i.compareTo(Integer.parseInt(o2.getOc()));

				}
			});

			for(int i = 0;i<chickens.size();i++) {
				System.out.println(chickens.get(i));
				}

		} else if (getGetget().equals("5")) {

			Collections.sort(pizzas, new Comparator<accumPizzaStore>() {

				@Override
				public int compare(accumPizzaStore o1, accumPizzaStore o2) {
					
//					return o2.getOc().compareTo(o1.getOc());
					Integer i = new Integer(o1.getOc()); 
					return i.compareTo(Integer.parseInt(o2.getOc()));

				}
			});

			for(int i = 0;i<pizzas.size();i++) {
				System.out.println(pizzas.get(i));
				}

		}

	}// 메소드

}// class
