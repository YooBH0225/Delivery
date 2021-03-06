package store;

import java.util.Scanner;

import main.Dummies;
import main.Main;
import main.StoreData;

public class StoreMain {

	private static String storeID;
//	private String storePW;
	private static String storeName;
//	private String storePhone;
//	private String storeAddressCity;
//	private String storeAddressDong;
//	private String storeOrderCount;

	/**
	 * 점포 메인 클래스
	 */
	public void storeMain() {

		storelogin();

	}// main

	/**
	 * 점포 - 로그인 페이지 메소드
	 */
	private void storelogin() {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int num = 0;
		while (loop) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\t\t== 점포 로그인 ==\n");
			System.out.print("\t\t1.로그인 \n\n\t\t2.점포등록하기\n\n");
			System.out.println("\n\t(뒤로가기를 원하면 0번을 입력해주세yo)\n"); 
			System.out.print("\t\t이동할 화면 입력(숫자) : ");
			String num_login = scan.nextLine();
			System.out.println();
			if (num_login.equals("1")) {
				System.out.print("\t사장님 번호 입력 : ");
				String id = scan.nextLine();
				System.out.print("\n\t비밀번호 입력 : ");
				String pw = scan.nextLine();
				boolean gomainpage = false;

				// ↓↓↓↓ 로그인 ID, PW 검사
				for (int i = 0; i < Dummies.store.size(); i++) {
					if (id.equals(Dummies.store.get(i).getStoreID()) && pw.equals(Dummies.store.get(i).getStorePW())) {
						gomainpage = true;
						num = i;
						break;
					}
				}
				if (gomainpage == true) {
					setStoreID(id);
					setStoreName(Dummies.store.get(num).getStoreName());
					mainpage();
				} else {
					System.out.println("\t알맞은 정보가 아닙니다. 초기화면으로 이동합니다.. ");
				}

			} else if (num_login.equals("2")) {
				regist();
			} else if (num_login.equals("0")) {
				loop = false;
			} else {
				System.out.println("\t\t다시 입력해주세yo.");
			}
		} // loop
		
		System.out.println("\t초기화면으로 돌아갑니다...");
		Main.pause();
	}

	/**
	 * 점포 - 메인페이지
	 */
	private void mainpage() {

		boolean loop = true;
		while (loop) {
			StoreInfoAlter storeinfo = new StoreInfoAlter();
			StoreOrder storeorder = new StoreOrder();
			StoreDelivery storedelivery = new StoreDelivery();
			StoreReview storereview = new StoreReview();
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\t\t== 점포 메인화면 ==");
			System.out.println("\n\t(뒤로가기를 원하면 0번을 입력해주세yo)\n"); 
			System.out.print("\t\t1.점포 정보 수정 \n\n\t\t2.고객 주문 조회\n\n\t\t3.배달 조회\n\n\t\t4.고객 리뷰 조회\n\n");
			System.out.print("\t\t이동할 화면 입력(숫자) : ");
			String num_main = scan.nextLine();
			System.out.println();
			if (num_main.equals("1")) {
				storeinfo.main();	
			} else if (num_main.equals("2")) {
				storeorder.main();	
			} else if (num_main.equals("3")) {
				storedelivery.main();	
			} else if (num_main.equals("4")) {
				storereview.main();
			} else if (num_main.equals("0")) {
				loop = false;
			}
		} // loop
	}

	/**
	 * 점포등록 메소드
	 */
	private void regist() {
		Scanner scan = new Scanner(System.in);
		StoreData sto = new StoreData();
		String storeID = "";
//		System.out.println(Dummies.nostore.size());	//입력하기 전 배열의 크기

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\t\t== 점포 정보 입력 ==\n\n");
		System.out.print("\t\t카테고리 선택\n\t[1.한식 2.중식 3.양식 4.치킨 5.피자]\n\n");
		System.out.print("\t\t입력 : ");
		String category = scan.nextLine();
		System.out.println();
		System.out.print("\t\t비밀번호 : ");
		String StorePW = scan.nextLine();
		System.out.println();
		System.out.print("\t\t상호명 [ex) 교촌치킨 양천구점] : ");
		String StoreName = scan.nextLine();
		System.out.println();
		System.out.print("\t\t전화번호 : ");
		String StorePhone = scan.nextLine();
		System.out.println();
		System.out.print("\t\t주소[시] : ");
		String StoreAddressCity = scan.nextLine();
		System.out.println();
		System.out.print("\t\t주소[구] : ");
		String StoreAddressGu = scan.nextLine();
		System.out.println();
		System.out.print("\t\t주소[동] : ");
		String StoreAddressDong = scan.nextLine();
		System.out.println();

		if (category.equals("1") || category.equals("한식")) {
			sto.setStoreID("Sa" + Dummies.storeKORnumber);
			storeID = "Sa" + Dummies.storeKORnumber;
			Dummies.storeKORnumber++;
		} else if (category.equals("2") || category.equals("중식")) {
			sto.setStoreID("Sb" + Dummies.storeCHINAnumber);
			storeID = "Sb" + Dummies.storeCHINAnumber;
			Dummies.storeCHINAnumber++;
		} else if (category.equals("3") || category.equals("일식")) {
			sto.setStoreID("Sc" + Dummies.storeJAPANnumber);
			storeID = "Sc" + Dummies.storeJAPANnumber;
			Dummies.storeJAPANnumber++;
		} else if (category.equals("4") || category.equals("치킨")) {
			sto.setStoreID("Sd" + Dummies.storeCHICKENnumber);
			storeID = "Sd" + Dummies.storeCHICKENnumber;
			Dummies.storeCHICKENnumber++;
		} else if (category.equals("5") || category.equals("피자")) {
			sto.setStoreID("Se" + Dummies.storePIZZAnumber);
			storeID = "Se" + Dummies.storePIZZAnumber;
			Dummies.storePIZZAnumber++;
		}
		sto.setStorePW(StorePW);
		sto.setStoreName(StoreName);
		sto.setStorePhone(StorePhone);
		sto.setStoreAddressCity(StoreAddressCity);
		sto.setStoreAddressGu(StoreAddressGu);
		sto.setStoreAddressDong(StoreAddressDong);

		Dummies.store.add(sto);
//		System.out.println(Dummies.nostore.size());	//입력 후 배열의 크기
//		System.out.println(Dummies.nostore.get(Dummies.nostore.size() - 1).toString());

		System.out.printf("\t\t회원가입이 완료되었습니다.\n\t\t점포ID는 %s입니다.\n\n", storeID);
	}// regist

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
//
//	public String getStorePW() {
//		return storePW;
//	}
//
//	public void setStorePW(String storePW) {
//		this.storePW = storePW;
//	}
//
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
//
//	public String getStorePhone() {
//		return storePhone;
//	}
//
//	public void setStorePhone(String storePhone) {
//		this.storePhone = storePhone;
//	}
//
//	public String getStoreAddressCity() {
//		return storeAddressCity;
//	}
//
//	public void setStoreAddressCity(String storeAddressCity) {
//		this.storeAddressCity = storeAddressCity;
//	}
//
//	public String getStoreAddressDong() {
//		return storeAddressDong;
//	}
//
//	public void setStoreAddressDong(String storeAddressDong) {
//		this.storeAddressDong = storeAddressDong;
//	}
//
//	public String getStoreOrderCount() {
//		return storeOrderCount;
//	}
//
//	public void setStoreOrderCount(String storeOrderCount) {
//		this.storeOrderCount = storeOrderCount;
//	}

}
