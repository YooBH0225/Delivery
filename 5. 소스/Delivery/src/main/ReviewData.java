package main;
//Sa1|ipmpi86844|된장찌개 맛없어요!
/**리뷰 클래스*/
public class ReviewData {
	private String storeID;
	private String memberID;
	private String comment;
	
	/**해당 리뷰의 가게 ID를 불러오는 메소드*/
	public String getStoreID() {
		return storeID;
	}
	/**해당 리뷰의 가게 ID를 설정하는 메소드*/
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	/**해당 리뷰의 회원 ID를 불러오는 메소드*/
	public String getMemberID() {
		return memberID;
	}
	/**해당 리뷰의 회원 ID를 설정하는 메소드*/
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	/**해당 리뷰의 내용을 불러오는 메소드*/
	public String getComment() {
		return comment;
	}
	/**해당 리뷰의 내용을 설정하는 메소드*/
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	/**해당 리뷰의 정보를 출력하는 확인용 메소드*/
	public String toString() {
		return "Review [storeID=" + storeID + ", memberID=" + memberID + ", comment=" + comment + "]";
	}
}
