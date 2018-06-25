package domain;

public class UserBean extends MemberBean{
	private String creditRating;
	
	public UserBean() {
		super();
	}
	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	@Override
	public String toString() {
		return "회원정보 [아이디:" + uid + ", 비번:" + pass + ", 이름:" + name + ", "
				+ "주민번호:" + ssn + ", 주소:" + addr
				+ "핸드폰:" + phone + ", 이메일:" + email + ", 신용등급:"+ creditRating +"]\n";
	}
	
}
