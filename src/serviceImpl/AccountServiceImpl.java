package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Date;
import java.util.Map;
import java.util.*;
import service.*;


import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;
public class AccountServiceImpl implements AccountService{
	private static AccountServiceImpl instance = new AccountServiceImpl();
	public static AccountServiceImpl getInstance() {return instance;}
	private AccountServiceImpl() {}

	
	/*public AccountServiceImpl() {
		map = new HashMap<>();
	}*/
	@Override
	public void createAccount(AccountBean account) {
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setAccountNo(AdminServiceImpl.getInstance().createAccountNo());
		account.setCreateDate(AdminServiceImpl.getInstance().createDate());
		System.out.println(account);
	}

	/*@Override
	public Map<String, AccountBean> map() {
		return map;
	}*/

	/*@Override
	public List<AccountBean> findByName(String word) {
		List<AccountBean> temp = new ArrayList<>();
		Set<AccountBean> set = new HashSet<>();
		for(Map.Entry<String, AccountBean> e : map.entrySet()) {
			if(word.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		}
		Iterator<AccountBean> it = set.iterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}
		return temp;
	}*/

	@Override
	public AccountBean findById(AccountBean account) {
		return null;//map.get(account.getUid());
	}

	@Override
	public void updatePass(AccountBean account) {
		String id = account.getUid();
		String pw = account.getPass().split("/")[0];
		String newPw = account.getPass().split("/")[1];
		AccountBean acc = new AccountBean();
		if(acc.equals(null)) {
			System.out.println("해당하는 아이디가 없음");
		}else {
			if(pw.equals(acc.getPass())) {
				acc.setPass(newPw);
				//map.put(id, acc);
			}
		}
	}

	@Override
	public void deleteAccount(AccountBean account) {
		//map.remove(account.getUid());
	}
	/*@Override
	public String createDate() {
		
	}
	@Override
	public int createRandom(int start, int end) {
		
	}
	@Override
	public String createAccountNo() {
		
	}*/
	/*@Override
	public void createMinus(MinusAccountBean minusAccount) {
		minusAccount.setAccountNo(accountNo());
		minusAccount.setAccountType(minusAccount.ACCOUNT_TYPE);
		minusAccount.setCreateDate(createDate());
		map.put(minusAccount.getUid(), minusAccount);
		
	}*/

}