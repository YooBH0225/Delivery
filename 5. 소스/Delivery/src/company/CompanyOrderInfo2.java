package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import main.Dummies;
import main.OrderData;
import main.StoreData;

/**본사의 배달중인 주문 정보 클래스*/
public class CompanyOrderInfo2 {
//		private static ArrayList<OrderData> orderDone = new ArrayList<OrderData>();
		private static ArrayList<OrderData> orderIng = new ArrayList<OrderData>();
		private static ArrayList<OrderData> tempOrder2 = new ArrayList<OrderData>();
		private final static int PAGESIZE = 20;
		private static String idorname2;
		/**본사의 배달중인 주문 정보 첫페이지 메소드*/
		public void orderInfoING() {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			//처음 이메소드에 들어오므로 처음에 값저장!!
			
			orderIng.clear();//필수!! 안그러면 계속쌓임
			
			for (OrderData order : Dummies.order) {
				if(order.getComplete().equals("미완")) {
					orderIng.add(order);
				}
//				else {
//					orderDone.add(order);
//				}
			}
			
//			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t     ===  배달중인 주문 조회  ===");
			System.out.println();
//			수락|미완|qkghtr30|Sd83|후라이드치킨|15000|R183
			int last = 1*PAGESIZE;
		
			int start = last-PAGESIZE;

			System.out.println("[주문자]\t[가게이름]\t\t[메뉴]\t[가격]");
			for (int i=start; i<last; i++) {
				
				OrderData o = orderIng.get(i);
				String storename = "";
				for(StoreData sn : Dummies.store) {//스토어 아이디에맞는 이름 가져옴
					if(o.getWhatmean().equals(sn.getStoreID())) {
						storename = sn.getStoreName();
					}
						
				}
				
				//출력
				System.out.printf("%s\t%s\t%s\t%s\n"
						,o.getMemberID(),storename //Whatmean() = 가게아이디 내가실수해서 가게비밀번호 저장해서 팀원들이 이해못한듯
						,o.getMenu(),o.getMenuprice()
						);
				
			}
			
			int plus = 0;
			if(orderIng.size()%PAGESIZE!=0) {
				plus = 1;
			}
			System.out.printf("\t\t\t\t\t\t[%d/%d]\n",1,(orderIng.size()/PAGESIZE)+plus);
			//첫페이지 명시
			
			doneChoice();
		}

		private void doneChoice() {
			boolean loop = true;
			while(loop) {
				
				System.out.println();
				System.out.println("\t\t1. 페이지 이동");
				System.out.println("\t\t2. 회원ID or 가게이름으로 검색");
				System.out.println();
				System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
				System.out.print("\t  번호 입력 : ");
				Scanner scan = new Scanner(System.in);
				String numS = scan.nextLine();
				if(numS.equals("1")) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					int plus = 0;
					if(orderIng.size()%PAGESIZE!=0) {
						plus = 1;
					}
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(orderIng.size()/PAGESIZE)+plus);
					
					///아직 안함
					orderIngPageMove();
				}else if (numS.equals("2")) {
					
					doneIDSerach();
				}else if (numS.equals("0")) {
					loop=false;
				}else {
					System.out.println("\t   올바른 번호를 입력하세요");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				}
			}
		}
		
		private void doneIDSerach() {
			boolean loop = true;
			while(loop) {
				Scanner scan = new Scanner(System.in);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t  == 회원ID or 가게이름을 입력해주세요 == ");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");
				System.out.print("\t  회원ID or 가게이름 : ");
				String numS = scan.nextLine();
				
				tempOrder2.clear();//초기화!!
				
				if(!numS.equals("0")) {
					boolean ck = false;
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\t     ===  배달중인 주문 조회  ===");
					System.out.println();
					System.out.println("[주문자]  [가게이름]          [메뉴]         [가격] [라이더]");
					for (int i = 0; i < orderIng.size(); i++) {
						OrderData o = orderIng.get(i);
						
						
						if(o.getMemberID().equals(numS)) {//
							ck=true;
							idorname2 = numS;
							tempOrder2.add(o);
							
						}else{
							String storeID = null;
							
							for(StoreData stn : Dummies.store) {
								if(stn.getStoreName().equals(numS)) {//일치하는 가게이름이 있으면
									storeID = stn.getStoreID();// 가게아이디복사
								}
							}
							
							if(o.getWhatmean().equals(storeID)) {//가게아이디와 검사
								ck=true;
								idorname2 = numS;
								tempOrder2.add(o);
							}
							
						}
					}//for
					
					
					if(ck==false) {
						System.out.printf("\t\" %s 와 일치하는 배달중인 주문이 없습니다.\"\n",numS);
						
						System.out.println();
						System.out.println();
						System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
						System.out.println();
						scan.nextLine();
					}else{//ck true면 
						if(tempOrder2.size()<=20) {//size가 20이하면
								//그냥 출력!!
							for (int i=0; i<tempOrder2.size(); i++) {
								
								OrderData t = tempOrder2.get(i);
								String storename = "";
								for(StoreData sn : Dummies.store) {
									if(t.getWhatmean().equals(sn.getStoreID())) {//가게아이디와 같은
										storename = sn.getStoreName();//가게이름을 찾아냄
									}
								}
								
								//고객, 가게이름, 메뉴, 가격, 라이더
								System.out.printf("%s  %s   %s  %s  %s\n"
										,t.getMemberID(),storename //Whatmean() = 가게아이디 내가실수해서 가게비밀번호 저장해서 팀원들이 이해못한듯
										,t.getMenu(),t.getMenuprice()
										,t.getRiderID());
							}
							System.out.println();
							System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
							System.out.println();
							scan.nextLine();
								
						}else {
							//pageSubView 새로만들어서 사용????
							//이럴일 없으니까 스킵??
							pageSubView(1);
							pageSubMove();
						}
					}
					
				}else {// 0이면 false
					loop = false;
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				}
			}
			
		}
		
		
		private void pageSubMove() {
			boolean loop = true;
			while(loop) {
				Scanner scan = new Scanner(System.in);
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.printf("\t          %s\n",idorname2);
				System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

				System.out.print("\t  페이지 입력(숫자) : ");
				int plus = 0;
				if(tempOrder2.size()%PAGESIZE!=0) {
					plus = 1;
				}
				try {
					int num = Integer.parseInt(reader.readLine());
					
					if(num==0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

						loop = false;
						
					}else if(num>0&&num<=(tempOrder2.size()/PAGESIZE)+plus){
						
						pageSubView(num);
						
					}else {
						System.out.println("\t 페이지 범위안의 값을 입력해주세요");
						System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
						System.out.println();
						scan.nextLine();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(tempOrder2.size()/PAGESIZE)+plus);
					}
					
				} catch (Exception e) {
					System.out.println("\t       번호를 입력하라고!!!!");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(tempOrder2.size()/PAGESIZE)+plus);
				}
			}
		}


		private void pageSubView(int n) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			System.out.println("\t     ===  배달중인 주문 조회  ===");
			
			System.out.println();
			
			System.out.println("[주문자]  [가게이름]       [메뉴]       [가격] [라이더]");
			int last = n*PAGESIZE;
			
			int start = last-PAGESIZE;
			if(last>tempOrder2.size()) {
				last = tempOrder2.size();
				start = tempOrder2.size() - (tempOrder2.size()%PAGESIZE);
				
			}
			
			for (int i=start; i<last; i++) {
				
				OrderData t = tempOrder2.get(i);
				String storename = "";
				for(StoreData sn : Dummies.store) {//스토어 아이디에맞는 이름 가져옴
					if(t.getWhatmean().equals(sn.getStoreID())) {
						storename = sn.getStoreName();
					}
						
				}
				
				//출력
				System.out.printf("%s  %s   %s  %s  %s\n"
						,t.getMemberID(),storename //Whatmean() = 가게아이디 내가실수해서 가게비밀번호 저장해서 팀원들이 이해못한듯
						,t.getMenu(),t.getMenuprice()
						,t.getRiderID());
				
			}
			
			int plus = 0;
			if(tempOrder2.size()%PAGESIZE!=0) {
				plus = 1;
			}
			System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(tempOrder2.size()/PAGESIZE)+plus);	
		}


		private void orderIngPageMove() {
			boolean loop = true;
			while(loop) {
				Scanner scan = new Scanner(System.in);
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("\t  (뒤로가기를 원하면 0을 입력해주세yo)");

				System.out.print("\t  페이지 입력(숫자) : ");
				int plus = 0;
				if(orderIng.size()%PAGESIZE!=0) {
					plus = 1;
				}
				try {
					int num = Integer.parseInt(reader.readLine());
					
					if(num==0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

						loop = false;
						
					}else if(num>0&&num<=(orderIng.size()/PAGESIZE)+plus){
						
						orderIngPageView(num);
						
					}else {
						System.out.println("\t 페이지 범위안의 값을 입력해주세요");
						System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
						System.out.println();
						scan.nextLine();
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(orderIng.size()/PAGESIZE)+plus);
					}
					
				} catch (Exception e) {
					System.out.println("\t       번호를 입력하라고!!!!");
					System.out.println("\t 계속하시려면 엔터키를 입력해주세요");
					System.out.println();
					scan.nextLine();
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.printf("\t\t\t\t\t\t[%d/%d]\n",0,(orderIng.size()/PAGESIZE)+plus);
				}
			}
		
		}


		private void orderIngPageView(int n) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t     ===  배달중인 주문 조회  ===");
			System.out.println("[주문자]\t[가게이름]\t\t[메뉴]\t[가격]");
			int last = n*PAGESIZE;
			
			int start = last-PAGESIZE;
			if(last>orderIng.size()) {
				last = orderIng.size();
				start = orderIng.size() - (orderIng.size()%PAGESIZE);
				
			}
			
			for (int i=start; i<last; i++) {
				
				OrderData o = orderIng.get(i);
				String storename = "";
				for(StoreData sn : Dummies.store) {//스토어 아이디에맞는 이름 가져옴
					if(o.getWhatmean().equals(sn.getStoreID())) {
						storename = sn.getStoreName();
					}
						
				}
				
				//출력
				System.out.printf("%s\t%s\t%s\t%s\n"
						,o.getMemberID(),storename //Whatmean() = 가게아이디 내가실수해서 가게비밀번호 저장해서 팀원들이 이해못한듯
						,o.getMenu(),o.getMenuprice()
						);
				
			}
			
			int plus = 0;
			if(orderIng.size()%PAGESIZE!=0) {
				plus = 1;
			}
			System.out.printf("\t\t\t\t\t\t[%d/%d]\n",n,(orderIng.size()/PAGESIZE)+plus);
			
		}


}
