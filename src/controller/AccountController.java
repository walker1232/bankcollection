package controller;
import service.*;
import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;
enum AccountButt{
	EXIT, ACCOUNT, LIST,FIND_BY_ID, FIND_BY_NAME, MINUS_ACCOUNT, MINUS_LIST, CHANGE_PASS, DELETE_ACCOUNT
}
public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}
	
	public void createAccount(AccountBean account) {
		AccountServiceImpl.getInstance().createAccount(account);
	}
	public void list() {
		//AccountService service = new AccountServiceImpl();
		//JOptionPane.showMessageDialog(null, service.map());
	}
	public void changePass() {
		AccountBean account;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("���̵�"));
		account.setPass(JOptionPane.showInputDialog("�н�����")+
				"/"+ JOptionPane.showInputDialog("���ο� �н�����"));
		AccountServiceImpl.getInstance().updatePass(account);
	}
	public void deleteAccount() {
		AccountBean account;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("���̵�"));
		account.setPass(JOptionPane.showInputDialog("�н�����"));
		AccountServiceImpl.getInstance().deleteAccount(account);
	}
	
}
