package domain;

public class AccountBean {
	public final static String BANK_NAME="��Ʈ��ũ";
	public final static String ACCOUNT_TYPE="�⺻����";
	public final static String WITHDRAW_SUCCESS="��ݼ���";
	public final static String WITHDRAW_FAIL="�ܾ׺���";
	public final static String DEPOSIT_SUCCESS="�Աݼ���";
	public final static String DEPOSIT_FAIL="������ �Է°��� �ƴ�";
	public int money;
	public String name,uid,pass,accountNo,accountType,createDate;
	/*public Account(String name, String uid, String pass) {
		this.name = name;
		this.uid = uid;
		this.pass = pass;
	}*/
	public AccountBean() {};
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getCreateDate() {
		return createDate;
	}
	public int getMoney() {
		return money;
	}
	public String toString() {
		return String.format("%s\n%s\n���¹�ȣ:%s\n�̸�:%s\n������%s\n�ܾ�:%d\n���̵�:%s\n�н�����:****", BANK_NAME, accountType, accountNo, name, createDate, money, uid);
	}
}
