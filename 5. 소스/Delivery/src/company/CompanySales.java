package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import main.Dummies;
import main.MemberData;
import main.OrderData;
import main.StoreData;
//망함 .. orderdata만들때 뭔가실수햇는지 Se401에서 메뉴랑 가격이 하나씩밀려있음
//콤피네이션M이 Se401이고 콤비네이션L에 M가격이 들어가있고 
/**본사의 매출액 정보 클래스*/
public class CompanySales {
	
	private static int total=0;
	private final static int PAGESIZE = 20;
	private static ArrayList<OrderData> temp = new ArrayList<OrderData>();
	private static String te;
	private static boolean meberORstore;
	/**본사의 매출액 정보의 첫페이지 메소드*/
	public void salesInfo() {
//		int total =0;
//		수락|완료|jbtwzm16|Sd205|후라이드치킨|15000|R1951

//						매출액		가게이익			순이익		
//		입금자	가게	총매출액	총매출액-순이익/10	순이익/10
		total=0;
		for (OrderData order : Dummies.order) {
			int price = Integer.parseInt(order.getMenuprice());
			total +=price;
			
		}
		
		int last = 1*PAGESIZE;
		int start = last - PAGESIZE;
		
		int plus =0;
		if(Dummies.order.size()%PAGESIZE!=0) {
			plus=1;
		}
		System.out.println("\t         ===  거래 조회  ===");
		System.out.println();
		System.out.println("[입금]\t\t[가게]\t\t\t[매출액][가게이익][순이익]");
		for (int i = start; i < last; i++) {
			OrderData od = Dummies.order.get(i);
			String storeName = "";
			for (StoreData store : Dummies.store) {
				if(store.getStoreID().equals(od.getWhatmean())){
					storeName = store.getStoreName();
				}
			}
			int pr = Integer.parseInt(od.getMenuprice());
			System.out.printf("%s\t%s\t%,d\t%,d\t  %,d\n"
					,od.getMemberID(),storeName
					,pr,pr-pr/10,pr/10);
		}
		
		System.out.println("[총 매출액]\t[가게이익]\t[인건비]\t [순이익]");
		System.out.printf("%,d원\t%,d원\t%,d원\t%,d원\n"
				,total,total-total/10,Dummies.rider.size()*1000,total/10-Dummies.rider.size()*1000);
		
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(Dummies.order.size()/PAGESIZE)+plus);
		saleChoice();
		
	}

	private void saleChoice() {
		
		boolean loop = true;
		while(loop) {
			System.out.println("\t\t1. 페이지 이동");
			System.out.println("\t\t2. 회원ID or 가게이름으로 검색");
			System.out.println();
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\n\t\t이동할 화면 입력(숫자): ");
			Scanner scan = new Scanner(System.in);
			String numS = scan.nextLine();
			
			if(numS.equals("0")) {
				loop = false;
			}else if(numS.equals("1")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				int plus = 0;
				if(Dummies.order.size()%PAGESIZE!=0) {
					plus = 1;
				}
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.order.size()/PAGESIZE)+plus);
				

				salePageMove();
			}else if(numS.equals("2")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				saleStoreNameSearch();
			}else {
				System.out.println("\t   올바른 번호를 입력하세요");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			}
			
				
		}
		
	}
	
	private void saleStoreNameSearch() {
		boolean loop = true;
		while(loop){
			Scanner scan = new Scanner(System.in);
			System.out.println("\t  == 회원ID or 가게이름을 입력해주세요 == ");
			System.out.println("\n\n\n\n\n");
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
			System.out.print("\t  회원ID or 가게이름 : ");
			String numS = scan.nextLine();
			temp.clear();//초기화!!
			
			if(numS.equals("0")) {
				
				loop = false;
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			}else {
				
	//////////////////////////----------------
				System.out.println("[입금자]\t\t[가게이름]\t[가격]\t[가게이익]\t[본사이익]");
				boolean ck = false;
				
				for (int i = 0; i < Dummies.order.size(); i++) {
					OrderData o = Dummies.order.get(i);
				
					if(o.getMemberID().equals(numS)) {//
						ck=true;
						te = numS;
						temp.add(o);
						meberORstore = false;
						
					}else{
						String storeID = null;
						
						for(StoreData stn : Dummies.store) {
							if(stn.getStoreName().equals(numS)) {//일치하는 가게이름이 있으면
								storeID = stn.getStoreID();// 가게아이디복사
							}
						}
						
						if(o.getWhatmean().equals(storeID)) {//가게아이디와 검사
							ck=true;
							te = numS;
							temp.add(o);
							meberORstore = true;
						}
						
					}
				}//for
			
			
				if(ck==false) {
					System.out.printf("\t\" %s 와 일치하는 배달완료 주문이 없습니다.\"\n",numS);
					
					System.out.println();
					System.out.println();
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
				}else{//ck true면 
					if(temp.size()<=20) {//size가 20이하면
							//그냥 출력!!
						
						int prTotal = 0;
						for (int i=0; i<temp.size(); i++) {
							
							OrderData t = temp.get(i);
							String storename = "";
							for(StoreData sn : Dummies.store) {
								if(t.getWhatmean().equals(sn.getStoreID())) {//가게아이디와 같은
									storename = sn.getStoreName();//가게이름을 찾아냄
								}
							}
							////
							int pr = Integer.parseInt(temp.get(i).getMenuprice());
							prTotal += pr;
							System.out.printf("%s\t%s\t\t%,d\t%,d\t\t%,d\n"
									,temp.get(i).getMemberID(),storename
									,pr,pr-pr/10,pr/10);
									
						}
						if(meberORstore) {	
							System.out.println("[총 매출액]\t[가게이익]\t [본사이익]");
						}else {
							System.out.println("[총 지출액]\t[가게이익]\t [본사이익]");
						
						}
						System.out.printf("%,d원\t%,d원\t\t%,d원\n"
								,prTotal,prTotal-(prTotal/10),prTotal/10);
						System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
						System.out.println();
						scan.nextLine();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
							
					}else {
						//pageSubView 새로만들어서 사용????
						//이럴일 없으니까 스킵??
						pageSubView(1);
						pageSubMove();
					}
				}//ck = false 일때의 else
			}//0이아닐때의 else
		}//while
	}
	
	
	private void pageSubMove() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("\t          %s\n",te);
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

			System.out.print("\t  페이지 입력(숫자) : ");
			int plus = 0;
			if(temp.size()%PAGESIZE!=0) {
				plus = 1;
			}
			try {
				int num = Integer.parseInt(reader.readLine());
				
				if(num==0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					loop = false;
					
				}else if(num>0&&num<=(temp.size()/PAGESIZE)+plus){
					
					pageSubView(num);
					
				}else {
					System.out.println("\t 페이지 범위안의 값을 입력해주세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(temp.size()/PAGESIZE)+plus);
				}
				
			} catch (Exception e) {
				System.out.println("\t       번호를 입력하라고!!!!");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(temp.size()/PAGESIZE)+plus);
			}
		}
	}

	private void pageSubView(int n) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("\t     		===  매출 조회  ===");
		
		System.out.println();
		/////---------------prTotal을 위하여
		int prTotal = 0;
		for (OrderData o : temp) {
			prTotal += Integer.parseInt(o.getMenuprice());
		}
		/////---------------------
		int last = n*PAGESIZE;
		
		int start = last-PAGESIZE;
		if(last>temp.size()) {
			last = temp.size();
			start = temp.size() - (temp.size()%PAGESIZE);
			
		}
		
		int plus =0;
		if(temp.size()%PAGESIZE!=0) {
			plus=1;
		}
		
		System.out.println("[입금]\t\t[가게]\t\t\t[매출액][가게이익][순이익]");
		for (int i = start; i < last; i++) {
			OrderData od = temp.get(i);
			String storeName = "";
			for (StoreData store : Dummies.store) {
				if(store.getStoreID().equals(od.getWhatmean())){
					storeName = store.getStoreName();
				}
			}
			int pr = Integer.parseInt(od.getMenuprice());
			System.out.printf("%s\t%s\t%,d\t%,d\t  %,d\n"
					,od.getMemberID(),storeName
					,pr,pr-pr/10,pr/10);
		}
		if(meberORstore) {	
			System.out.println("[총 매출액]\t[가게이익]\t [본사이익]");
		}else {
			System.out.println("[총 지출액]\t[가게이익]\t [본사이익]");
		
		}
		System.out.printf("%,d원\t%,d원\t\t%,d원\n"
				,prTotal,prTotal-(prTotal/10),prTotal/10);
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(temp.size()/PAGESIZE)+plus);
		
	}

	
	
	private void salePageMove() {
		boolean loop = true;
		while(loop) {
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

			int plus = 0;
			if(Dummies.order.size()%PAGESIZE!=0) {
				plus = 1;
			}
			try {
				System.out.print("\t  페이지 입력(숫자) : ");
				int num = Integer.parseInt(reader.readLine());
				
				if(num==0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					loop = false;
					
				}else if(num>0&&num<=(Dummies.order.size()/PAGESIZE)+plus){
					//여기 안됨!?!?!? 페이지 입력(숫자) : 212
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					salePageView(num);
					
				}else {
					System.out.println("\t 페이지 범위안의 값을 입력해주세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.order.size()/PAGESIZE)+plus);
				}
				
			} catch (Exception e) {
				System.out.println("\t       번호를 입력하라고!!!!");
				System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
				System.out.println();
				scan.nextLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(Dummies.order.size()/PAGESIZE)+plus);
			}
		}
		
		
	}

	private void salePageView(int n) {
		
		int last = n*PAGESIZE;
		int start = last-PAGESIZE;
		
		if(last>Dummies.order.size()) {
			last = Dummies.order.size();
			start = Dummies.order.size() - (Dummies.order.size()%PAGESIZE);
			
		}
		
		int plus = 0;
		if(Dummies.order.size()%PAGESIZE!=0) {
			plus = 1;
		}
		System.out.println("\t         ===  매출 조회  ===");
		System.out.println();
		System.out.println("[입금]\t\t[가게]\t\t\t[매출액][가게이익][순이익]");
		for (int i = start; i < last; i++) {
			OrderData od = Dummies.order.get(i);
			String storeName = "";
			for (StoreData store : Dummies.store) {
				if(store.getStoreID().equals(od.getWhatmean())){
					storeName = store.getStoreName();
				}
			}
			int pr = Integer.parseInt(od.getMenuprice());
			System.out.printf("%s\t%s\t%,d\t%,d\t  %,d\n"
					,od.getMemberID(),storeName
					,pr,pr-pr/10,pr/10);
		}
		
		
		System.out.println("[총 매출액]\t[가게이익]\t[인건비]\t [순이익]");
		System.out.printf("%,d원\t%,d원\t%,d원\t%,d원\n"
				,total,total-total/10,Dummies.rider.size()*1000,total/10-Dummies.rider.size()*1000);
		
		System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(Dummies.order.size()/PAGESIZE)+plus);

	}

	
}
