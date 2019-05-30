package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.Dummies;
import main.MemberData;
import main.StoreData;

/**본사의 가게정보 뷰어 클래스*/
public class CompanyStoreInfo {
	private final static int PAGESIZE = 20;
	/**본사의 가게정보 뷰어 첫페이지 메소드*/
	public void storeInfo() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  점포 정보  ===");
		
		System.out.println("\t[아이디]  [가게이름]\t\t[전화번호]");
		int last = 1*PAGESIZE;
	
		int start = last-PAGESIZE;
//		[아이디]	[가게이름]	[전화번호]
//		Sa1	하늘한식 구로구점	02-072-3341
		for (int i=start; i<last; i++) {
			StoreData s = Dummies.store.get(i);
			//"%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
			System.out.printf("\t%s\t  %s\t%s\n"
				,s.getStoreID()
				,s.getStoreName(),s.getStorePhone()
				);
		
		}
		int plus = 0;
		if(Dummies.store.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(Dummies.store.size()/PAGESIZE)+plus);
		
		korStoreChoice();
		
	}
	
	private void korStoreChoice() {
		boolean loop = true;
		while(loop) {
			System.out.println("\t\t1. 페이지 이동");
			System.out.println();
			System.out.println("\t\t2. ID로 검색");
			System.out.println();
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\n\t\t이동할 화면 입력(숫자): ");
			Scanner scan = new Scanner(System.in);
			String numS = scan.nextLine();
			
			if(numS.equals("1")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				int plus = 0;
				if(Dummies.store.size()%PAGESIZE!=0) {
					plus = 1;
				}
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.store.size()/PAGESIZE)+plus);
				storeMovePage();
				
			}else if(numS.equals("2")) {
				storeIDSearch();
				
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

	private void storeIDSearch() {
		
		boolean loop = true;
		while(loop) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t\t  == ID를 입력해주세요 == ");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\t  아이디 입력 : ");
			
//			System.out.print("가게이름 입력 : ");
			
			Scanner scan = new Scanner(System.in);
			String numS = scan.nextLine();
			
			if(numS.equals("0")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				loop = false;
			}else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t\t   == 점포 정보 == ");
				System.out.println("\n\n\n\n");
				boolean ck = false;
				
				for (StoreData s : Dummies.store) {
					if(s.getStoreID().equals(numS)){
						ck = true;
						
						System.out.printf("\t[아이디] : %s\n",s.getStoreID());
						System.out.printf("\t[비밀번호] : %s\n",s.getStorePW());
						System.out.printf("\t[이름] : %s\n",s.getStoreName());
						System.out.printf("\t[전화번호] : %s\n",s.getStorePhone());
						System.out.printf("\t[주문누적수] : %s\n",s.getStoreOrderCount());
						System.out.printf("\t[주소] : %s %s\n",s.getStoreAddressCity(),s.getStoreAddressGu());
						System.out.printf("\t[나머지 주소] : %s\n",s.getStoreAddressDong());
						
					}
				}
				
				
				if(ck == false) {
					System.out.printf("\t  \"아이디가 %s 인 점포가 없습니다.\"\n",numS);
				}
				System.out.println();
				System.out.println();
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
			}//esle
		
		}//while
		
	}

	
	private void storeMovePage() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\t  페이지 입력(숫자) : ");
			int plus = 0;
			if(Dummies.store.size()%PAGESIZE!=0) {
				plus = 1;
			}
			
			try {
				int num = Integer.parseInt(reader.readLine());
				if(num==0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					loop = false;
				}else if(num>0&&num<=(Dummies.store.size()/PAGESIZE)+plus) {
					storePageView(num);
				}else {
					System.out.println("\t 페이지 범위안의 값을 입력해주세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.store.size()/PAGESIZE)+plus);
				}
				
			} catch (Exception e) {
				System.out.println("\t       번호를 입력하라고!!!!");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.store.size()/PAGESIZE)+plus);
			}
			
//			try {
//				System.out.println("뒤로가기 0입력");
//				System.out.print("페이지 입력 : ");
//				int num = Integer.parseInt(reader.readLine());
//				
//				if(num==0) {
//					loop = false;
//				}else if(num>0&&num<=Dummies.member.size()/50){
//					storePageView(num);
//				}else {
//					System.out.println("페이지범위 안의 숫자를 입력하세요");
//					
//				}
//				
//			} catch (Exception e) {
//				System.out.println("숫자를 입력하세요");
//				
//			}
		}
	}
	
	
	/**입력받은값의 가게정보페이지를 보여주는 메소드*/
	public void storePageView(int n) {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t        ===  점포 정보  ===");
		System.out.println("\t[아이디]  [가게이름]\t\t[전화번호]");
		
		
		
		int last = n*PAGESIZE;
		
	
		int start = last-PAGESIZE;
		//last가 값을넘어가면 남은값들만출력 다생각이있는 if문이다 이말이야
		if(last>Dummies.store.size()) {
			last = Dummies.store.size();
			start = Dummies.store.size() - (Dummies.store.size()%PAGESIZE);
			
		}
		
		
		for (int i=start; i<last; i++) {
		StoreData s = Dummies.store.get(i);
		//"%s\t%s\t%s\t%s\t%s\t%s\t%s\n"
		System.out.printf("\t%s\t  %s\t%s\n"
				,s.getStoreID()
				,s.getStoreName(),s.getStorePhone()
				);
		
		}
		
		
		int plus = 0;
		if(Dummies.store.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(Dummies.store.size()/PAGESIZE)+plus);
		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("--점포 정보--");
//		
//		System.out.println("아이디\t비밀번호\t가게이름\t\t전화번호\t총 주문수\t주소");
//		int last = n*50;
//		if(n*50>Dummies.store.size()||(n-1)*50>Dummies.store.size()) {
//			last = Dummies.store.size();
//			
//		}
//		int start = last-50;
//		
//		for (int i=start; i<last; i++) {
//		StoreData store = Dummies.store.get(i);
//				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s %s %s\n"
//					,store.getStoreID(),store.getStorePW(),store.getStoreName()
//					,store.getStorePhone(),store.getStoreOrderCount()
//					,store.getStoreAddressCity(),store.getStoreAddressGu(),store.getStoreAddressDong());
//		
//		}
//		
//		System.out.printf("%d/%d\n",n,Dummies.store.size()/50);
		
		
	}
	


}
