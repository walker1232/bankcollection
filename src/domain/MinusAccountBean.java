package domain;


public class MinusAccountBean extends AccountBean{
	public final static String ACCOUNT_TYPE="���̳ʽ�����";
	public int limit;
	
	public void setLimit(int limit){
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
		
		public String toString() {
		return String.format("%s\n%s\n���¹�ȣ: %s\n�̸�: %s\n������: %s\n�ܾ�: %d \n�ѵ�:%d", BANK_NAME, 
																					 ACCOUNT_TYPE, 
																					 accountNo, 
																					 name, 
																					 createDate, 
																					 money,
																					 limit);
	}
}

