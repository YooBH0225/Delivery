package member;

import java.util.Scanner;

import main.Dummies;
import main.OrderData;

//import main.Main;
/**
 * @안지연 회원주문페이지에 대한 모든 명령어 클래스입니다.
 * 
 */
public class Member_UI {

	
	public final static int ORDER = 1;
	public final static int INFO = 2;
	public final static int ORDERINFO = 3;
	MemberLogin ml = new MemberLogin();
	MemberMain ms = new MemberMain();
	MyMember mm = new MyMember();
	DirectOrder dor = new DirectOrder();
//	Member_UI mu = new Member_UI();
	OrderData od = new OrderData();
//	OrderFinalINFO ofl = new OrderFinalINFO();
//	Dummies d = new Dummies();
	private static int choose;

	
	/**
	 * 
	 * @document 회원 로그인시 나타나는 환영 문장입니다.
	 */
		public void begin() {
		 System.out.println("\n\n\n\n");
		System.out.printf("\t[반갑습니다 %s 님!!]", ml.getuName()); // 이건 더미데이터에서 불러올것임!!
	}


	/**
	 * 
	 * 
	 * @document 회원이 선택할 수 있는 메뉴얼 페이지입니다. 
	 * 
	 * 
	 */
	public void order() {
		 
		
		System.out.println("\n\n");
		System.out.println("\t1. 주문페이지 ");
		System.out.println();
		System.out.println("\t2. 회원 정보 보기 ");
		System.out.println();
		System.out.println("\t3. 배달 내역 조회하기");
		System.out.println();
		System.out.println("\t[뒤로 가기를 원하면 0번을 입력해주세yo]");
		System.out.println("\n\n");
		System.out.print("\t이동할 화면 입력(숫자) : ");
		
		
	}

	/**
	 * 
	 * 
	 * @document 메뉴얼 입장시 생성되는 첫 글귀입니다. 
	 * 
	 * 
	 */
	public void title(int n) {
		
		if (n == Member_UI.ORDER) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t[주문 페이지]");
		} else if (n == Member_UI.INFO) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t[회원 정보 보기]");
			System.out.println("\n");
		}else if(n== Member_UI.ORDERINFO) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t[지난 배달 내역 보기]");
		}

	}

	/**
	 * 
	 * @document 해당페이지를 나갈 때 나오는 글귀입니다. 
	 * 
	 * 
	 */
	public void pause(int n) {

		Scanner scan = new Scanner(System.in);
		if (n == Member_UI.ORDER) {
			System.out.println("\t주문이 정상 접수되었습니다.\r\n\r\n\t계속 하시려면 엔터를 입력하세요.");
			scan.nextLine();
//			ml.Memberloginmain ();
			

		} else if (n == Member_UI.INFO) {
			System.out.println("\n\n\n");
			System.out.println("\t회원님의 정보입니다.\n\n\t계속 하시려면 엔터를 입력하세요.");
			scan.nextLine();
		}else if(n == Member_UI.ORDERINFO) {
			System.out.println("\n\n\n");
			System.out.println("\t회원님의 주문 정보입니다.\n\n\t계속 하시려면 엔터를 입력하세요.");
			scan.nextLine();
			
		}

	}
	
	/**
	 * 
	 * 
	 * @document 주문페이지의 정렬선택 옵션 페이지입니다. 
	 * 
	 * 
	 */
	public void choose() {
		Scanner scan = new Scanner(System.in);
		
		
		boolean result = true;
		
		while(result) {
			System.out.println("\n\n");
			System.out.println("\t\t\t\t== 정렬선택 ==");
			System.out.println("\n");
			System.out.println("\t1. 누적 주문 순으로 보기");
			System.out.println();
			System.out.println("\t2. 바로주문하기");
			System.out.println();
			System.out.println("\t[뒤로 가기를 원하면 0번을 눌러주세yo]");
			System.out.println("\n\n");
			System.out.print("\t이동할 화면 입력(번호) : ");
			Integer input = scan.nextInt();
			System.out.println();

		if (input == 1) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			mm.accumlateList();
			
			dor.dorProcess();

		} else if (input == 2) {
			
			dor.dorProcess();
			
		
		} else if (input == 0) {
			
			result = false;

		}else {
			
			result = false;
		}
		}

	}
	
	/**
	 * 
	 * 
	 * @document 각 페이지 종료시 나오는 다음 메뉴얼 선택 페이지입니다. 
	 * 
	 * 
	 */
	public void fffinal() {
		
		boolean result = true;
		while(result) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n\n");
		System.out.println("\t ==어디로 이동할까요? ==");
		System.out.println();
		System.out.println("\t1. 주문 정보 보기");
		System.out.println();
		System.out.println("\t[뒤로 가기를 원하면 0번을 눌러주세yo]");
		System.out.println("\n\n");
		System.out.print("\t이동할 화면 입력(숫자) : ");
		Integer input = scan.nextInt();
		System.out.println("\n\n");

		 if (input == 1) {
			userfinalorderinfo();
			
			
		
		} else if (input == 0) {
			
			result = false;
			
			
			
			
		}
		}
		

		
	}
	
	
	/**
	 * 
	 * @document 주문할지 여부를 묻는 페이지입니다. 
	 * 
	 */
public void ordercheckend() {

		Scanner scan = new Scanner(System.in);
		boolean result = true;
		while(result) {
		System.out.println("1. 주문하기");
		System.out.println();
		System.out.println("\t[뒤로 가기를 원하면 0번을 눌러주세yo]");
		System.out.println();
		System.out.print("이동할 화면 입력(숫자) : ");
		String input = scan.nextLine();
		
		
		if (input.equals("0")) {
			result = false;
		}
		else if(input.equals("1")) {
			mm.orderchoice();
		}
		
		}
	}
	
	/**
	 * 
	 * @document  회원의 기존 정보에 대한 페이지입니다. 
	 * 
	 * 
	 */
	private void userfinalorderinfo() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.printf("\t\t\t[%s 님이 신청하신 주문 내역을 불러옵니다.]\r\n\r\n",ml.getuName());
		boolean result = true;
		while(result) {
		System.out.println("\t이름: " + ml.getuName());
		System.out.println();
		System.out.println("\t배달할 주소: " + ml.getuAddress());
		System.out.println();
		System.out.println("\t사용할 포인트: " + dor.getUsedP());
		System.out.println();
		System.out.println("\t접릭한 포인트: " + dor.getuPilePoint());
		System.out.println();
		
		od.setAccept("대기");
		od.setComplete("미완");
		od.setMemberID(ml.getuID());
		od.setMenu(dor.getMenu());
		od.setMenuprice(dor.getFinalfinalprice()+"");
		od.setRiderID("null");
		od.setWhatmean(dor.getStoreID());
		Dummies.order.add(od);
		
		System.out.println("\t[주문한 메뉴] \t\t\t [가격]");
		System.out.println();
		System.out.println("\t" + od.getMenu() +"\t\t\t" + od.getMenuprice());
		System.out.println();
		System.out.println("\t총 주문 금액: " + od.getMenuprice());
		System.out.println();
		System.out.println();
		System.out.println("\t현재 상태: " + od.getAccept() + "중..");
		System.out.println();
		System.out.println("\t배달시간 : 30분");
		
		pause(3);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n");
		System.out.println("\t[뒤로 가기를 원하면 0번을 눌러주세yo]");
		System.out.println("\n\n");
		System.out.print("\t이동할 화면 입력(숫자) : ");
		Integer input = scan.nextInt();
		System.out.println("\n\n");
		result = false;
		
		}
	}
		
	}

	
	
	


