package member;

import java.util.Scanner;


import main.Dummies;


/**
 * 
 * @안지연 sist56 결제 진행 클래스입니다. 포인트 사용 및 적립이 포함됩니다.
 *
 */
public class pointUse {

	DirectOrder dor = new DirectOrder();
	Member_UI mu = new Member_UI();
	MemberLogin ml = new MemberLogin();
	
	
/**
 * 
 * @document sist56 결제 여부를 묻는 페이지입니다.
 * 
 * 
 */
public void paychoice() {
		
		
		boolean result = true;
		
		while(result) {
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.print("\t결제 하시겠습니까?(y/n)");
			String input = scan.nextLine();
			if (input.equals("y")) {
				
				
				payPay();
	
				
			}else {
				
				result = false;
			}
		}
		
		
	}
	

/**
 * 
 * 
 * @안지연 sist56  포인트 사용 여부와 사용할 포인트를 결정하는 페이지입니다. 
 * 
 * 
 */
	public void payPay() {

		Scanner scan = new Scanner(System.in);
		boolean result = true;
		while (result) {
				String input = scan.nextLine();

				System.out.print("\t포인트를 사용하시겠습니까? (y/n)");
				input = scan.nextLine();
				System.out.println();
				
				if (input.equals("y")) {
					System.out.println();
					System.out.print("\t사용할 포인트 : ");
					Integer usedP = scan.nextInt();
					dor.setUsedP(usedP);
					if (usedP <= Integer.parseInt(ml.getuPoint())) {
						System.out.println();
						System.out.print("\t결제할 최종 금액: ");
						dor.setFinalfinalprice(dor.finalprice - usedP);
						System.out.println(dor.getFinalprice() - usedP);
						dor.setuPilePoint(dor.getFinalfinalprice()/10);

						mu.pause(1);
						System.out.println();
						mu.fffinal();

					} else if (usedP > Integer.parseInt(ml.getuPoint())) {

						System.out.println("\t사용불가! 다시 결제창으로 돌아갑니다.");

						result = false;
					}

				} else if (input.equals("n")) {
					System.out.println();
					System.out.print("\t결제할 최종 금액: ");
					dor.setFinalfinalprice(dor.finalprice);
					dor.setuPilePoint(dor.getFinalfinalprice()/10);
					System.out.println(dor.getFinalprice());

					mu.pause(1);
					System.out.println();
					mu.fffinal();
				}else {
					
					result = false;
				}

			}

		}

//	}
}
