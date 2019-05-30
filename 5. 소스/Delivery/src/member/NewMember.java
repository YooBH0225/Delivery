package member;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

import main.Dummies;
import main.Main;
import main.MemberData;
import main.RiderData;

/**
 * 
 * @안상현 회원 로그인 멤버 메인 클래스에서 회원가입을 선택하면 나오는 화면입니다. 회원 가입 페이지입니다.
 * 
 */
public class NewMember {

	private static String memberID;
	private String memberName;
	private String memberAge;
	private String memberAddressCity;
	private String memberAddressGu;
	private String memberAddressDong;
	private String memberPhone;
	public static Scanner scan = new Scanner(System.in);
	public static MemberData memdat = new MemberData();
	
	
	/**
	 * 
	 * 
	 * 회원정보 실행 페이지입니다. 인적사항을 기입한 후 ID와 PW를 정하는 페이지입니다.
	 * 
	 * 
	 */
	public void NewMembermain() {

		boolean loop = true;

		while (loop) {

			


			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\t회원가입을 위해 정보를 입력해주세요!\n\n\n");


			System.out.print("\t이름 : ");
			String memberName = scan.nextLine();
			memdat.setMemberName(memberName);
			System.out.println();

			memdat.setMemberID(createid());

			System.out.println("\t사용가능한 아이디 입니다.");
			System.out.println();

			System.out.print("\t비밀 번호 : ");
			String memberPW = scan.nextLine();
			memdat.setMemberPW(memberPW);
			System.out.println();

			
			memdat.setMemberAddressCity(city());
			
			

			memdat.setMemberAddressGu(gu());
			

			memdat.setMemberAddressDong(dong());
			

			memdat.setMemberPhone(phonenumber());

			memdat.setMemberPoint("0");

			Dummies.member.add(memdat);

			
			System.out.println();

			System.out.println("\t회원가입이 완료되었습니다.");
			System.out.println();
			loop = false;

			// NoMemberOrder()비회원주문

		} // loop

	} // main
	/**
	 * 
	 * 
	 * @document 아이디 유효성 검사 페이지입니다. 조건에 맞는 아이디를 생성하지 않으면 다시 돌아갑니다.
	 * 
	 * 
	 */
	public String createid() {
		
		String memberID = "";
		
		boolean loop = true;
		while (loop) {

			System.out.print("\t사용할 아이디 : ");
			memberID = scan.nextLine();

			for (MemberData m : Dummies.member) {
				if (m.getMemberID().equals(memberID)) {
					System.out.println("\t중복된 아이디입니다.");
					System.out.println();
				} else {
					loop = false;
				}
			}

		}

		return memberID;

	} // createid
	
	
	/**
	 * 
	 * 
	 * 
	 *전화번호 유효성 검사 페이지입니다. '-'를 사용하고 13자리를 입력해야 다음 단계로 이동합니다.
	 * 
	 * 
	 */
	public String phonenumber() {

		String memberPhone = "";
		
		boolean loop = true;
		while (loop) {

			System.out.print("\t전화번호 ('-' 포함) : ");
			memberPhone = scan.nextLine();

			if (memberPhone.length() != 13) {
				System.out.println("\t'-'을 포함하여 다시 입력해주세요.");
			} else {
				loop = false;
			}

		}
		return memberPhone;

	} // phonenumber

	/**
	 * 
	 * 
	 * @document 주소입력하는 페이지입니다. '시'를 포함해서 작성해야 다음단계로 넘어갑니다. 
	 * 
	 * 
	 */
	public String city() {

		String memberAddressCity = "";
		
		boolean loop = true;
		while (loop) {

			System.out.print("\t주소(시) : ");
			memberAddressCity = scan.nextLine();
			System.out.println();

			if (!memberAddressCity.contains("시")) {
				System.out.println("\t'시'를 포함해서 입력해주세요\n\n");
			} else {
				loop = false;
			}
		}
		
//		memdat.setMemberAddressCity(memberAddressCity);
		return memberAddressCity;
		
	}//city
	
	/**
	 * 
	 * 
	 * 주소 입력하는 페이지입니다. '구'를 입력해야 다음단계로 넘어갑니다. 
	 * 
	 */
	public String gu() {

		String memberAddressGu = "";
		
		boolean loop = true;
		while (loop) {

			System.out.print("\t주소(구) : ");
			memberAddressGu = scan.nextLine();
			System.out.println();
			
			if (!memberAddressGu.contains("구")) {
				System.out.println("\t'구'를 포함해서 입력해주세요\n\n");
			} else {
				memdat.setMemberAddressGu(memberAddressGu);
				loop = false;
			}
		}
		
		return memberAddressGu;
	} //Gu
	
	/**
	 * 
	 * 
	 * 주소 입력하는 페이지입니다. '동'을 입력해야 다음단계로 넘어갑니다. 
	 * 
	 * 
	 */
	public String dong() {

		String memberAddressDong = "";
		
		boolean loop = true;
		while (loop) {

			System.out.print("\t주소(동) : ");
			memberAddressDong = scan.nextLine();
			System.out.println();
			
			if (!memberAddressDong.contains("동")) {
				System.out.println("\t'동'을 포함해서 입력해주세요\n\n");
			} else {
				memdat.setMemberAddressDong(memberAddressDong);
				loop = false;
			}
		}
		
		return memberAddressDong;
	} //Gu

}