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
		return "ȸ������ [���̵�:" + uid + ", ���:" + pass + ", �̸�:" + name + ", "
				+ "�ֹι�ȣ:" + ssn + ", �ּ�:" + addr
				+ "�ڵ���:" + phone + ", �̸���:" + email + ",���ٹ�ȣ:" +accessNum+"]\n";
	}
	
}
