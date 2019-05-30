package rider;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import main.Dummies;
import main.RiderData;

/**
 * 
 * @author 조성빈
 * 라이더 회원 가입을 담당하는 클래스입니다.
 *
 */
public class RiderRegister { // 라이더 신청, 정보 입력 클래스

	/**
	 * 라이더 데이터를 저장하는 ArrayList 입니다.
	 */
	public static RiderData ss = new RiderData();
	
	/**
	 * Scanner를 통해 입력받은 데이터를 저장하는 변수입니다.
	 */
	public static Scanner scan = new Scanner(System.in);

	/**
	 * 라이더 회원 가입 화면을 출력하고 회원 가입을 입력받는 메소드입니다.
	 */
	public void riderregistermain() {
		
	
		RiderLogin rl = new RiderLogin();

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\r\n\n\n\t\t라이더 신청을 위해 정보를 입력해주세요!\n\n");

		System.out.print("\t1. 이름 : ");
		String noriderName = scan.nextLine();
		ss.setRiderName(noriderName);
		System.out.println();

		riderPW();

		System.out.println();
		System.out.println("\t*전화번호는 - 를 포함해서 입력해주세요.");
		System.out.print("\t3. 전화번호 : ");
		String noriderPhone = scan.nextLine();
		ss.setRiderPhone(noriderPhone);
		System.out.println();

		System.out.println("\t*지역은 구까지만 입력해주세요");
		System.out.println("\t4. 희망 지역");

		city();

		gu();

		System.out.println();

		System.out.println("\t라이더 가입이 완료되었습니다. 제공되는 아이디를 사용하여 로그인해주세요.\n\n");

		Dummies.ridernumber++;

		System.out.printf("\t아이디 : R%d\n", Dummies.ridernumber);

		ss.setRiderID("R" + Dummies.ridernumber);

		ss.setRiderStatus("불가");
		
		Dummies.rider.add(ss);


		System.out.println("\t     계속하시려면 [엔터]를 입력하세요.");
		scan.nextLine();
		


	}

	private void gu() {

		boolean loop = true;
		while (loop) {

			System.out.print("\t구 : ");
			String noriderAddressGu = scan.nextLine();

			if (!noriderAddressGu.contains("구")) {
				System.out.println("\t'구'를 포함해서 입력해주세요\n\n");
			} else {
				ss.setRiderAddressGu(noriderAddressGu);
				loop = false;
			}
		}
	}

	private void city() {

		boolean loop = true;
		while (loop) {

			System.out.print("\t도시 : ");
			String noriderAddressCity = scan.nextLine();

			if (!noriderAddressCity.contains("시")) {
				System.out.println("\t'시'를 포함해서 입력해주세요\n\n");
			} else {
				ss.setRiderAddressCity(noriderAddressCity);
				loop = false;
			}
		}
	}

	private static void riderPW() {

		boolean loop = true;
		while (loop) {

			System.out.println("\t비밀번호는 숫자 4자리로 입력해주세요");
			System.out.print("\t2. 비밀번호 : ");
			String riderPW = scan.nextLine();
			if (riderPW.length() == 4) {
				ss.setRiderPW(riderPW);
				loop = false;
			} else {
				System.out.println("\t올바르지 않은 비밀번호입니다. 다시 입력해주세요.\n\n");
			}

		}
	}
}
