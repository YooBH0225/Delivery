package member;

import java.util.Scanner;


import main.Dummies;


/**
 * 
 * 
 * @안지연 sist56 가게를 선택하고 주문을 진행하는 클래스입니다. 
 *
 */
public class DirectOrder {
	private static String pp;
	static int finalprice;
	private static int usedP;
	private static String menu;
	private static String storename;
	private static int finalfinalprice;
	private static String storeID;
	private static int count;
	private static int uPilePoint;
	static Scanner scan;
	static MemberLogin ml = new MemberLogin();
	static Member_UI mu = new Member_UI();
	static pointUse pU = new pointUse();
	static{
		scan = new Scanner(System.in);
	}
	

	public static int getuPilePoint() {
		return uPilePoint;
	}


	public static void setuPilePoint(int uPilePoint) {
		DirectOrder.uPilePoint = uPilePoint;
	}


	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		DirectOrder.count = count;
	}



	public static String getStoreID() {
		return storeID;
	}



	public static void setStoreID(String storeID) {
		DirectOrder.storeID = storeID;
	}



	public static int getFinalfinalprice() {
		return finalfinalprice;
	}



	public static void setFinalfinalprice(int finalfinalprice) {
		DirectOrder.finalfinalprice = finalfinalprice;
	}



	public static String getMenu() {
		return menu;
	}



	public static void setMenu(String menu) {
		DirectOrder.menu = menu;
	}



	public static String getStorename() {
		return storename;
	}



	public static void setStorename(String storename) {
		DirectOrder.storename = storename;
	}



	public static int getUsedP() {
		return usedP;
	}



	public static void setUsedP(int usedP) {
		DirectOrder.usedP = usedP;
	}



	public static int getFinalprice() {
		return finalprice;
	}



	public static void setFinalprice(int finalprice) {
		DirectOrder.finalprice = finalprice;
	}





 /**
  * 
  * @document 가게 ID를 입력하여 가게를 선택하는 페이지입니다.
  * 
  * 
  */
	public void dorProcess() {

		
		boolean result = true;
		while(result) {
		
		System.out.println("\n\n\n\n\n");	
		System.out.print("\t가게를 선택해주세요: ");
		String input = scan.nextLine();
		System.out.println();
		
		
		if(input.length()<3 || input.length()>5) {
			
			result = false;
		} else {
			OrderStart(input);
		}
		
		
		
		}
		
			
			
		}

	
	/**
	 * 
	 * 
	 * 
	 * @document 가게 검색시 나오는 가게의 정보와 메뉴선택 페이지입니다.
	 *
	 *
	 */
public void OrderStart(String input) {

		for (int i = 0; i < Dummies.menu.size(); i++) {

			if (Dummies.menu.get(i).getStoreID().equals(input)) {

				for (int j = 0; j < Dummies.store.size(); j++) {

					if (Dummies.store.get(j).getStoreID().equals(Dummies.menu.get(i).getStoreID())
							&& Dummies.menuprice.get(j).getStoreID().equals(Dummies.menu.get(i).getStoreID())) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.printf("\t\t ==안녕하세요! %s입니다 ==\r\n", Dummies.store.get(j).getStoreName());
						setStorename(Dummies.store.get(j).getStoreName());
						setStoreID(Dummies.store.get(j).getStoreID());
						System.out.println();
						System.out.println("\t최소주문금액 : 15000원");
						System.out.println();
						System.out.println("\t주문수: " + Dummies.store.get(j).getStoreOrderCount());
						System.out.println();
						System.out.println("\t[메뉴] \t\t\t\t [가격]");
						System.out.println("\n");
						System.out.println("\t1." + Dummies.menu.get(i).getMenu1() + "\t\t\t" + Dummies.menuprice.get(i).getPrice1()+"원");
						System.out.println();
						System.out.println("\t2." + Dummies.menu.get(i).getMenu2() + "\t\t\t" + Dummies.menuprice.get(i).getPrice2()+"원");
						System.out.println();
						System.out.println("\t3." + Dummies.menu.get(i).getMenu3() + "\t\t\t" + Dummies.menuprice.get(i).getPrice3()+"원");
						System.out.println("\n");

						boolean result = true;

						while (result) {

							System.out.print("\t메뉴를 선택해주세요: ");
							String input3 = scan.nextLine();
							System.out.println();
							System.out.print("\t수량을 선택해주세요: ");
							Integer input4 = scan.nextInt();
							System.out.println();
							System.out.println("\t사용 가능한 포인트: " + ml.getuPoint());
							System.out.println();
							System.out.println("\t[주문한 메뉴] \t\t\t[수량]\t\t\t [가격]");
							System.out.println();
							if (input3.equals("1")) {
							
								setFinalprice(Dummies.menuprice.get(i).getPrice1());
								if((input4 * Dummies.menuprice.get(i).getPrice1()) >= 15000) {
								System.out.println("\t" +Dummies.menu.get(i).getMenu1() + "\t\t\t" +input4 + "\t\t\t"+ Dummies.menuprice.get(i).getPrice1()+"원");
								setMenu(Dummies.menu.get(i).getMenu1());
								setFinalprice(input4* Dummies.menuprice.get(i).getPrice1());
								setCount(input4);
								System.out.println("\n");
								
								
								pU.paychoice();
				
								}else {
									System.out.println("\t주문하실 수 없습니다. 15000원이상 주문해주세요.!!");
									result = false;
								}
							} else if (input3.equals("2")) {

								
								setFinalprice(Dummies.menuprice.get(i).getPrice2());
								if((input4 * Dummies.menuprice.get(i).getPrice2()) >= 15000) {
								System.out.println("\t" +Dummies.menu.get(i).getMenu2() + "\t\t\t" +input4 + "\t\t\t"+ Dummies.menuprice.get(i).getPrice2()+"원");
								setMenu(Dummies.menu.get(i).getMenu2());
								setFinalprice(input4* Dummies.menuprice.get(i).getPrice2());
								setCount(input4);
								System.out.println("\n");

									pU.paychoice();
									
									
									
									
									}else {
										System.out.println("\t주문하실 수 없습니다. 15000원이상 주문해주세요.!!");
										result = false;
									}
								

								
							} else if (input3.equals("3")) {
					
								
								if((input4 * Dummies.menuprice.get(i).getPrice3()) >= 15000) {
									System.out.println("\t" + Dummies.menu.get(i).getMenu3() + "\t\t\t" +input4 + "\t\t\t" + Dummies.menuprice.get(i).getPrice3()+"원");
									
									setFinalprice(Dummies.menuprice.get(i).getPrice3());
									setMenu(Dummies.menu.get(i).getMenu3());
									setFinalprice(input4* Dummies.menuprice.get(i).getPrice3());
									setCount(input4);
									

									pU.paychoice();
									
						
									
									}else {
										System.out.println("\t주문하실 수 없습니다. 15000원이상 주문해주세요.!!");
										result = false;
									}
			

							}else {
								System.out.println("주문하실 수 없습니다. 해당하는 음식이 없습니다. .");
								
								result = false;
							}

							

						}
						

					}

				}

				

			}
		}
		
		

}



	
}
