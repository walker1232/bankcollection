package domain;


public class MinusAccountBean extends AccountBean{
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int limit;
	
	public void setLimit(int limit){
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
		
		public String toString() {
		return String.format("%s\n%s\n계좌번호: %s\n이름: %s\n생성일: %s\n잔액: %d \n한도:%d", BANK_NAME, 
																					 ACCOUNT_TYPE, 
																					 accountNo, 
																					 name, 
																					 createDate, 
																					 money,
																					 limit);
	}
}

