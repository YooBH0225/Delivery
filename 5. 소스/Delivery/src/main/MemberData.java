package main;

/**회원 클래스*/
public class MemberData {

	private  String memberID;
	private  String memberPW;
	private  String memberName;
	private  String memberPhone;
	private  String memberAddressCity;
	private  String memberAddressGu;
	private  String memberAddressDong;
	private  String memberPoint;
	
	/**해당 회원ID를 불러오는 메소드*/
	public  String getMemberID() {
		return memberID;
	}
	
	/**해당 회원ID를 설정하는 메소드*/
	public  void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	/**해당 회원PW를 불러오는 메소드*/
	public  String getMemberPW() {
		return memberPW;
	}
	/**해당 회원PW를 설정하는 메소드*/
	public  void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	/**해당 회원이름를 불러오는 메소드*/
	public  String getMemberName() {
		return memberName;
	}
	/**해당 회원이름를 설정하는 메소드*/
	public  void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**해당 회원전화번호를 불러오는 메소드*/
	public  String getMemberPhone() {
		return memberPhone;
	}
	/**해당 회원전화번호를 설정하는 메소드*/
	public  void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	/**해당 회원 주소 시를 불러오는 메소드*/
	public  String getMemberAddressCity() {
		return memberAddressCity;
	}
	/**해당 회원 주소 시를 설정하는 메소드*/
	public  void setMemberAddressCity(String memberAddressCity) {
		this.memberAddressCity = memberAddressCity;
	}
	/**해당 회원 주소 구를 불러오는 메소드*/
	public  String getMemberAddressGu() {
		return memberAddressGu;
	}
	/**해당 회원 주소 구를 설정하는 메소드*/
	public  void setMemberAddressGu(String memberAddressGu) {
		this.memberAddressGu = memberAddressGu;
	}
	/**해당 회원 나머지 주소를 불러오는 메소드*/
	public  String getMemberAddressDong() {
		return memberAddressDong;
	}
	/**해당 회원 나머지 주소를 설정하는 메소드*/
	public  void setMemberAddressDong(String memberAddressDong) {
		this.memberAddressDong = memberAddressDong;
	}
	
	/**해당 회원 포인트를 불러오는 메소드*/
	public  String getMemberPoint() {
		return memberPoint;
	}
	
	/**해당 회원 포인트를 설정하는 메소드*/
	public  void setMemberPoint(String memberPoint) {
		this.memberPoint = memberPoint;
	}
	
	@Override
	/**해당 회원의 모든 정보를 출력해주는 확인용 메소드*/
	public String toString() {
		return "MemberData [memberID=" + memberID + ", memberPW=" + memberPW + ", memberName=" + memberName
				+ ", memberPhone=" + memberPhone + ", memberAddressCity=" + memberAddressCity + ", memberAddressGu="
				+ memberAddressGu + ", memberAddressDong=" + memberAddressDong + ", memberPoint=" + memberPoint + "]";
	}
	
	
	
}
