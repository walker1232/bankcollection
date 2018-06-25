package service;
import java.util.List;

import domain.*;

public interface AccountService2 {
	public void createAccount(AccountBean account);
	public List<AccountBean> list();
	public List<AccountBean> search(String word);
	public AccountBean search(AccountBean account);
	public int searchCount();
	public void updateAccount(AccountBean account);
	public void deleteAccount(AccountBean account);
	public String createDate();
	public int createRandom(int start, int end);
	public String accountNo();
	
}
