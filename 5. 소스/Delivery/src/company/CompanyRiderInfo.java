package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.Dummies;
import main.MemberData;
import main.RiderData;
import main.StoreData;
/**본사의 라이더정보 뷰어 클래스*/
public class CompanyRiderInfo {
	private final static int PAGESIZE = 20;
	
	/**라이더정보의 첫페이지를 보여주는 메소드 (초기화면)*/
	public void riderInfo() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  라이더 정보  ===");
		
		System.out.println("\t[아이디]\t[이름]\t[전화번호]");
		int last = 1*PAGESIZE;
	
		int start = last-PAGESIZE;
		
		for (int i=start; i<last; i++) {
		RiderData r = Dummies.rider.get(i);
		//R1|3274|김대하|010-5881-5780|부산시|용산구|불가
		System.out.printf("\t%s\t%s\t%s\n"
				,r.getRiderID()
				,r.getRiderName()
				,r.getRiderPhone()
				);
		
		}
		
		int plus = 0;
		if(Dummies.rider.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(Dummies.rider.size()/PAGESIZE)+plus);
		
		
		riderInfoChoice();
		
		
		
		
	}
	

	private void riderInfoChoice() {
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
				if(Dummies.rider.size()%PAGESIZE!=0) {
					plus = 1;
				}
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.rider.size()/PAGESIZE)+plus);
				
				riderPageSearch();
			}else if(numS.equals("2")) {
				riderIDSearch();
			
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

	private void riderIDSearch() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t  == ID를 입력해주세요 == ");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\t  아이디 입력 : ");
			String numS = scan.nextLine();
			
			
			if(!numS.equals("0")) {
				boolean ck = false;
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t\t   == 라이더 정보 == ");
				System.out.println("\n\n\n\n");
				
				for (RiderData r : Dummies.rider) {
					if(r.getRiderID().equals(numS)){
						ck = true;
						
						System.out.printf("\t[아이디] : %s\n",r.getRiderID());
						System.out.printf("\t[비밀번호] : %s\n",r.getRiderPW());
						System.out.printf("\t[이름] : %s\n",r.getRiderName());
						System.out.printf("\t[전화번호] : %s\n",r.getRiderPhone());
						System.out.printf("\t[상태] : %s\n",r.getRiderStatus());
						System.out.printf("\t[담당구역] : %s %s\n",r.getRiderAddressCity(),r.getRiderAddressGu());
						
					}
				}
//				for (int i = 0; i < Dummies.rider.size(); i++) {
//					RiderData r = Dummies.rider.get(i);
//					
//					if(numS.equals(r.getRiderID())) {
//						ck = true;
//						//R1|3274|김대하|010-5881-5780|부산시|용산구|불가
//						System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
//								,r.getRiderID(),r.getRiderPW()
//								,r.getRiderName(),r.getRiderPhone()
//								,r.getRiderAddressCity(),r.getRiderAddressGu(),r.getRiderStatus());
//						
//					}
//				}//for
				
				if(ck==false) {
					System.out.printf("\t  \"아이디가 %s 인 라이더가 없습니다.\"\n",numS);
				}
				
				System.out.println();
				System.out.println();
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				
			}else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				loop = false;
			}
		}
	}
	
	
	private void riderPageSearch() {
		
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

			System.out.print("\t  페이지 입력(숫자) : ");
			int plus = 0;
			if(Dummies.rider.size()%PAGESIZE!=0) {
				plus = 1;
			}
			try {
				int num = Integer.parseInt(reader.readLine());
				
				if(num==0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					loop = false;
					
				}else if(num>0&&num<=(Dummies.rider.size()/PAGESIZE)+plus){
					
					riderPageView(num);
					
				}else {
					System.out.println("\t 페이지 범위안의 값을 입력해주세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.rider.size()/PAGESIZE)+plus);
				}
				
			} catch (Exception e) {
				System.out.println("\t       번호를 입력하라고!!!!");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.rider.size()/PAGESIZE)+plus);
			}
		}
		
	}

	
	//riderInfo의 해당페이지를 보여주는 메소드
	private void riderPageView(int n) {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  라이더 정보  ===");
		
		System.out.println("\t[아이디]\t[이름]\t[전화번호]");
		int last = n*PAGESIZE;
	
		int start = last-PAGESIZE;
		if(last>Dummies.rider.size()) {
			last = Dummies.rider.size();
			start = Dummies.rider.size() - (Dummies.rider.size()%PAGESIZE);
			
		}
		
		for (int i=start; i<last; i++) {
		RiderData r = Dummies.rider.get(i);
		//R1|3274|김대하|010-5881-5780|부산시|용산구|불가
		System.out.printf("\t%s\t%s\t%s\n"
				,r.getRiderID()
				,r.getRiderName()
				,r.getRiderPhone()
				);
		
		}
		
		
		int plus = 0;
		if(Dummies.rider.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(Dummies.rider.size()/PAGESIZE)+plus);
		
		////-------------
//		System.out.println("아이디\t비밀번호\t이름\t전화번호\t주소\t상태");
//		int last = n*50;
//		if(n*50>Dummies.rider.size()||(n-1)*50>Dummies.rider.size()) {
//			last = Dummies.rider.size();
//			
//		}
//		int start = last-50;
//		
//		for (int i=start; i<last; i++) {
//			RiderData r = Dummies.rider.get(i);
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
//					,r.getRiderID(),r.getRiderPW()
//					,r.getRiderName(),r.getRiderPhone()
//					,r.getRiderAddressCity(),r.getRiderAddressGu(),r.getRiderStatus());
//			
//		}
//		
//		System.out.printf("%d/%d\n",n,Dummies.rider.size()/50);
//		
	}


		
}	














