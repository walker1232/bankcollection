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
		return "ȸ������ [���̵�:" + uid + ", ���:" + pass + ", �̸�:" + name + ", "
				+ "�ֹι�ȣ:" + ssn + ", �ּ�:" + addr
				+ "�ڵ���:" + phone + ", �̸���:" + email + ", �ſ���:"+ creditRating +"]\n";
	}
	
}
