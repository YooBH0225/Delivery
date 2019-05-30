package store;

import java.util.Scanner;

import main.Dummies;
import main.Main;
import main.MemberData;

/**
 * 점포 - 4.고객 리뷰 조회
 * 
 * @author sist47
 *
 */
public class StoreReview {

	/**
	 * 리뷰 조회 메인메소드
	 */
	public void main() {
		Scanner scan = new Scanner(System.in);
		StoreMain storemain = new StoreMain();
		int num = 0;
//		boolean loop = true;
//		while(loop) {

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.printf("\t\t== %s 리뷰 ==\n\n", storemain.getStoreName());

		for (int i = 0; i < Dummies.review.size(); i++) {
			if (Dummies.review.get(i).getStoreID().equals(storemain.getStoreID())) {
				String memberID = Dummies.review.get(i).getMemberID();
				String membername = memberNameCheck(memberID);

				System.out.printf("\t\t고객명 : %s\n", membername);
				System.out.printf("\t\tComment : %s\n\n", Dummies.review.get(i).getComment());
			}
		}
		Main.pause();
//		}//loop
	}// main

	/**
	 * 회원 이름 검사 메소드
	 * @param memberID
	 * @return
	 */
	public String memberNameCheck(String memberID) {
//		MemberData member = new MemberData();
		String membername = "";
		for (int i = 0; i < Dummies.member.size(); i++) {
			if (Dummies.member.get(i).getMemberID().equals(memberID)) {
				membername = Dummies.member.get(i).getMemberName();

			}
		}
		return membername;
	}//회원 이름 반환 메소드
}
