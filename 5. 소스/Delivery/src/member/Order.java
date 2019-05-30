package member;

import main.Dummies;
import main.MemberData;

/**
 * 
 * 
 * 
 * @안지연 sist56 기존에 등록된 회원의 정보를 불러오는 클래스입니다. 
 *
 */


public class Order {
	
	
	

	
//	private static String name = MemberMain.getGetName();
	private String dlvStore;
	private String dlvOrder;
	private String usedPt;
	MemberLogin ml = new MemberLogin ();
	
	
	public String getName() {
		return ml.getuName();
	}



	public String getDlvStore() {
		return dlvStore;
	}



	public void setDlvStore(String dlvStore) {
		this.dlvStore = dlvStore;
	}



	public String getDlvOrder() {
		return dlvOrder;
	}



	public void setDlvName(String dlvOrder) {
		this.dlvOrder = dlvOrder;
	}



	public String getUsedPt() {
		return usedPt;
	}



	public void setUsedPt(String usedPt) {
		this.usedPt = usedPt;
	}



	@Override
	public String toString() {
		return "Order [dlvStore=" + dlvStore + ", dlvName=" + dlvOrder + ", usedP=" + usedPt + "]";
	}
	
	

}
