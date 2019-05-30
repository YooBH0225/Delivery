package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.Dummies;
import main.MemberData;

/**본사의 멤버정보 뷰어 클래스*/
public class CompanyMemberInfo {
	
	private final static int PAGESIZE = 20;
	
	/**멤버의 첫페이지를 보여주는 메소드 (초기화면)*/
	public void memberInfo() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  고객 정보  ===");
		
		System.out.println("\t[아이디]\t[이름]\t[전화번호]");
		int last = 1*PAGESIZE;
	
		int start = last-PAGESIZE;
		
		for (int i=start; i<last; i++) {
		MemberData m = Dummies.member.get(i);
		//"%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
		System.out.printf("\t%s\t%s\t%s\n"
				,m.getMemberID()/*,m.getMemberPW()*/
				,m.getMemberName(),m.getMemberPhone()/*,m.getMemberPoint()*/
				/*,m.getMemberAddressCity(),m.getMemberAddressGu(),m.getMemberAddressDong()*/
				);
		
		}
		int plus = 0;
		if(Dummies.member.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(Dummies.member.size()/PAGESIZE)+plus);
		
		
		
		
		memberInfoChoice();
		
		
		
	}
	
	/**본사의 회원정보에서 검색을할지 페이지를 이동할지 선택할수있게하는 메소드*/
	public void memberInfoChoice() {
		boolean loop = true;
		
		while(loop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\t\t1. 페이지 이동");
			System.out.println();
			System.out.println("\t\t2. ID로 검색");
			System.out.println();
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\n\t\t이동할 화면 입력(숫자): ");
			String numS = scan.nextLine();
			if(numS.equals("1")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				int plus = 0;
				if(Dummies.member.size()%PAGESIZE!=0) {
					plus = 1;
				}
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.member.size()/PAGESIZE)+plus);
				
				memberPageSearch();
			}else if(numS.equals("2")) {
				
				memberIDSearch();
			}else if(numS.equals("0")) {
				loop = false;
				
			}else {
				System.out.println("\t   올바른 번호를 입력하세요");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			}
		}
	}

	/**입력받은 값과 일치하는 회원아이디를 찾아 보여주는 메소드*/
	public void memberIDSearch() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t  == ID를 입력해주세요 == ");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\t  아이디 입력 : ");
			String numS = scan.nextLine();
			if(numS.equals("0")) {
				loop = false;
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				
			}else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t\t   == 고객 정보 == ");
				System.out.println("\n\n\n\n");
//				System.out.println("[아이디]\t\t[비밀번호]\t[이름]\t[전화번호]\t[포인트]\t[주소]");
				boolean ck = false;
				for (MemberData m : Dummies.member) {
					if(m.getMemberID().equals(numS)){
						ck = true;
						
						System.out.printf("\t[아이디] : %s\n",m.getMemberID());
						System.out.printf("\t[비밀번호] : %s\n",m.getMemberPW());
						System.out.printf("\t[이름] : %s\n",m.getMemberName());
						System.out.printf("\t[전화번호] : %s\n",m.getMemberPhone());
						System.out.printf("\t[포인트] : %s\n",m.getMemberPoint());
						System.out.printf("\t[주소] : %s %s\n",m.getMemberAddressCity(),m.getMemberAddressGu());
						System.out.printf("\t[나머지 주소] : %s\n",m.getMemberAddressDong());
						
//						System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
//								,m.getMemberID(),m.getMemberPW()
//								,m.getMemberName(),m.getMemberPhone(),m.getMemberPoint()
//								,m.getMemberAddressCity(),m.getMemberAddressGu(),m.getMemberAddressDong());
					}
				}
				
				if(ck==false) {
					System.out.printf("\t  \"아이디가 %s 인 회원이 없습니다.\"\n",numS);
					
				}
				
				System.out.println();
				System.out.println();
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
			
				
			}
		}
		
	}

	/** 페이지를 이동할때 거치는 중간메소드 입력을받고 그값을 memberInfoPages로 넘긴다*/
	public void memberPageSearch() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

			System.out.print("\t  페이지 입력(숫자) : ");
			int plus = 0;
			if(Dummies.member.size()%PAGESIZE!=0) {
				plus = 1;
			}
			try {
				int num = Integer.parseInt(reader.readLine());
				if(num==0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					loop = false;
				}else if(num>0&&num<=(Dummies.member.size()/PAGESIZE)+plus) {
					memberPageView(num);
				}else {
					System.out.println("\t 페이지 범위안의 값을 입력해주세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.member.size()/PAGESIZE)+plus);
				}
				
			} catch (Exception e) {
				System.out.println("\t       번호를 입력하라고!!!!");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.member.size()/PAGESIZE)+plus);
			}
			
		}
		
	}

	/**입력받은값의 페이지를 보여주는 메소드*/
	public void memberPageView(int n) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  고객 정보  ===");
		
		System.out.println("\t[아이디]\t[이름]\t[전화번호]");
		int last = n*PAGESIZE;
	
		int start = last-PAGESIZE;
		if(last>Dummies.member.size()) {
			last = Dummies.member.size();
			start = Dummies.member.size() - (Dummies.member.size()%PAGESIZE);
			
		}
		
		for (int i=start; i<last; i++) {
		MemberData m = Dummies.member.get(i);
		//"%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
		System.out.printf("\t%s\t%s\t%s\n"
				,m.getMemberID()/*,m.getMemberPW()*/
				,m.getMemberName(),m.getMemberPhone()/*,m.getMemberPoint()*/
				/*,m.getMemberAddressCity(),m.getMemberAddressGu(),m.getMemberAddressDong()*/
				);
		
		}
		
		
		int plus = 0;
		if(Dummies.member.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(Dummies.member.size()/PAGESIZE)+plus);
		
	}
//	public void memberInfoPages(int n) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("--고객 정보--");
//		
//		System.out.println("아이디\t\t비밀번호\t이름\t전화번호\t포인트\t주소");
//		int last = n*50;
//		if(n*50>Dummies.member.size()||(n-1)*50>Dummies.member.size()) {
//			last = Dummies.member.size();
//			
//		}
//		int start = last-50;
//		
//		for (int i=start; i<last; i++) {
//		MemberData m = Dummies.member.get(i);
//		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
//				,m.getMemberID(),m.getMemberPW()
//				,m.getMemberName(),m.getMemberPhone(),m.getMemberPoint()
//				,m.getMemberAddressCity(),m.getMemberAddressGu(),m.getMemberAddressDong());
//		
//		}
//		System.out.printf("%d/%d\n",n,Dummies.member.size()/50);
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			System.out.println("ID로 검색하고싶으면 0입력");
//			System.out.print("페이지 입력 : ");
//			int num = Integer.parseInt(reader.readLine());
//			
//			if(num==0) {
//				memberIDSearch();
//			}else if(num>0&&num<=Dummies.member.size()/50){
//				memberInfoPages(num);
//			}else {
//				System.out.println("페이지범위 안의 숫자를 입력하세요");
//				memberPageSearch();
//			}
//			
//		} catch (Exception e) {
//			System.out.println("숫자를 입력하세요");
//			memberPageSearch();
//		}
//	}
}
