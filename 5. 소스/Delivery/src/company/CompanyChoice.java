package company;

import java.util.Scanner;

import main.Main;

/**본사의 메뉴 클래스*/
public class CompanyChoice {
	/**본사의 메뉴 메소드 : 보고싶은 메뉴를 선택하면 해당메뉴 화면으로 이동하게함*/
	public void choice() {
		
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t     ===  본사의 메뉴화면  ===");
			System.out.println();
			System.out.println("\t\t1. 고객정보 조회");
			System.out.println();
			System.out.println("\t\t2. 점포정보 조회");
			System.out.println();
			System.out.println("\t\t3. 라이더정보 조회");
			System.out.println();
			System.out.println("\t\t4. 주문정보 조회");
			System.out.println();
			System.out.println("\t\t5. 매출액 조회");
			System.out.println();
			System.out.println("\n\n\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\n\t\t이동할 화면 입력(숫자): ");
			String numS = scan.nextLine();
			if(numS.equals("0")) {
	//			String[] args = null;
	//			Main.main(args);
				loop = false;
			}else if(numS.equals("1")) {
				CompanyMemberInfo c = new CompanyMemberInfo();
				c.memberInfo();
//				c.memberInfoChoice();
				
			}else if(numS.equals("2")) {
				CompanyStoreInfo s = new CompanyStoreInfo();
				s.storeInfo();
				
			}else if(numS.equals("3")) {
				CompanyRiderInfo r = new CompanyRiderInfo();
				r.riderInfo();
				
			}else if(numS.equals("4")) {
				CompanyOrderInfo o = new CompanyOrderInfo();
				o.orderInfoChoice();
			
			}else if(numS.equals("5")) {
				CompanySales cs = new CompanySales();
				cs.salesInfo();
				
			}else {
				System.out.println("\t           올바르지 않습니다");
				System.out.println("\t   계속하시려면 엔터키를 입력해주세요");
				scan.nextLine();
			}
		}
	}
}
