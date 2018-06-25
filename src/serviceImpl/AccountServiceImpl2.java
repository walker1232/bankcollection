/*package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import service.AccountService2;


import domain.AccountBean;
import service.AccountService;
public class AccountServiceImpl2 implements AccountService2{

	List<AccountBean> list;
	public AccountServiceImpl2() {
		list = new ArrayList<AccountBean>();
	}
	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(accountNo());
		account.setAccountType(account.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		list.add(account);
	}

	@Override
	public List<AccountBean> list() {
		return list;
	}

	@Override
	public List<AccountBean> search(String word) {
		List<AccountBean> temp = new ArrayList<AccountBean>();
		for(int i=0; i<list.size(); i++) {
			if(word.equals(list.get(i).getName())) {
				temp.add(list.get(i));
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(word.equals(list.get(i).getName())) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}

	@Override
	public AccountBean search(AccountBean account) {
		AccountBean temp = new AccountBean();
		for(int i=0; i<list.size(); i++) {
			if(account.getUid().equals(list.get(i).getUid()) && account.getPass().equals(list.get(i).getPass())) {
				temp = list.get(i);
			}
		}
		for(AccountBean e : list) {
			if(account.getUid().equals(e.getUid()) && account.getPass().equals(e.getPass())) {
				temp = e;
			}
		}
		return temp;
	}

	@Override
	public int searchCount() {
		return list.size();
	}

	@Override
	public void updateAccount(AccountBean account) {
		list.get(list.indexOf(search(account))).setPass(account.getPass());
	}

	@Override
	public void deleteAccount(AccountBean account) {
		
		for(int i=0; i<list.size(); i++) {
			if(account.getUid().equals(list.get(i).getUid()) && account.getPass().equals(list.get(i).getPass())) {
				list.remove(list.get(i));
			}
		}
		for(AccountBean e : list) {
			if(account.getUid().equals(e.getUid()) && account.getPass().equals(e.getPass())) {
				list.remove(e);
			}
		}
	}
	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy³â MM¿ùddÀÏ").format(new Date());
	}
	@Override
	public int createRandom(int start, int end) {
		return (int)(Math.random()*end)+start;
	}
	@Override
	public String accountNo() {
		String accountNo = "";
		for(int i=0; i<3; i++) {
			accountNo += (i == 2 )? String.valueOf(createRandom(0,999)): String.valueOf(createRandom(0,999))+"-";
		}
		return accountNo;
	}

}*/