package member;

/**
 * 
 * @안지연 sist56 회원의 위치에 인접한 일식 점포들을 불러오는 클래스입니다. 
 *
 */

public class accumJapanStore {
	
	private String id;
	private String name;
	private String oc;
	

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOc() {
		return oc;
	}
	public void setOc(String oc) {
		this.oc = oc;
	}
	public accumJapanStore(String id, String name, String oc) {
		super();
		this.id = id;
		this.name = name;
		this.oc = oc;
	}
	@Override
	public String toString() {
		return  "\t\t" + id +"\t\t" + name +  "\t\t"+ oc;
	}
	
	
	

}
