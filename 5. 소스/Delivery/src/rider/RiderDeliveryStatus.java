package rider;

import java.util.Scanner;

import main.Dummies;
import main.RiderData;

/**
 * 
 * @author 조성빈
 *라이더 배달 가능 여부를 담당하는 클래스입니다.
 */
public class RiderDeliveryStatus {

	/**
	 * 라이더 데이터를 저장하는 ArrayList 입니다.
	 */
	public static RiderData rd = new RiderData();
	
	/**
	 * Scanner를 통해 입력받은 데이터를 저장하는 변수입니다.
	 */
	public static Scanner scan = new Scanner(System.in);
	
	/**
	 * 현재 라이더 배달 가능 여부 상태를 출력하고 선택을 통해 자신의 배달 가능 여부를 변경하는 메소드입니다.
	 */
	public void riderdeliverystatus() {
		
		boolean loop = true;
		while (loop) {
		
		RiderLogin rl = new RiderLogin();
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t\t== 현재 라이더 상태 ==\n\n");
		
		String riderstat = "";
		int num = 0;
		for (int i=0; i<Dummies.rider.size(); i++) {
			if (Dummies.rider.get(i).getRiderID().equals(rl.getUserID())) {
				riderstat = Dummies.rider.get(i).getRiderStatus();
				num = i;
			}
		}
		
		System.out.printf("\t\t현재 배달 %s 상태입니다.\n\n", riderstat);
		
		System.out.println("\t1. 상태 변경");
		System.out.println("\n\t   (뒤로가기를 원하시면 0을 입력해주세yo)");
		System.out.print("\n\t\t  이동할 화면 입력(숫자) : ");
		String selNum = scan.nextLine();
		
		if (selNum.equals("1")) {
			if (riderstat.equals("가능")) {
				Dummies.rider.get(num).setRiderStatus("불가");
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			} else if (riderstat.equals("불가")) {
				Dummies.rider.get(num).setRiderStatus("가능");
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
		} else if (selNum.equals("0")) {
			loop = false;
		}
		
		}
	}
	
}
