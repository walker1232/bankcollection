package domain;

public class StaffBean extends MemberBean{
	private String accessNum;
	
	public StaffBean() {
		super();
	}

	public String getAccessNum() {
		return accessNum;
	}

	public void setAccessNum(String accessNum) {
		this.accessNum = accessNum;
	}

	@Override
	public String toString() {
		return "회원정보 [아이디:" + uid + ", 비번:" + pass + ", 이름:" + name + ", "
				+ "주민번호:" + ssn + ", 주소:" + addr
				+ "핸드폰:" + phone + ", 이메일:" + email + ",접근번호:" +accessNum+"]\n";
	}
	
}
