package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

enum AdminButt{
	// JOIN�� �Ϲ����� �߰�, ADD�� ���� �߰�
	EXIT, 
	JOIN, ADD,// create => create(�߰�)�ϴ� method
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,	// all, one, some int => read(�˻�)�ϴ� method
	UPDATE,	//void update(����)�ϴ� method
			//void delete(����)�ϴ� method		��Ʋ�� CRUD method �⺻�� 7����
}	// �⺻ �ſ뵵�� 7�� user.setCreditRate("7���");
public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	public AdminController() {}
	
	public void staffAdd() {
		//MemberService service = new MemberServiceImpl();
		/*MemberBean member = null;
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("���̵�"));
		member.setPass(JOptionPane.showInputDialog("�н�����"));
		member.setName(JOptionPane.showInputDialog("�̸�"));
		member.setSsn(JOptionPane.showInputDialog("�ֹι�ȣ"));
		member.setAddr(JOptionPane.showInputDialog("�ּ�"));
		member.setPhone(JOptionPane.showInputDialog("�ڵ���"));
		member.setEmail(JOptionPane.showInputDialog("�̸���"));*/
		//service.createStaff((StaffBean) member);
		//service.createStaff(member);
	}
	public void MemberList() {
		//MemberService service = new MemberServiceImpl();
		//JOptionPane.showMessageDialog(null, service.list());
	}
	public void findMemberByName() {
		//MemberService service = new MemberServiceImpl();
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("�̸�")));
	}
	public void findMemberById() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("���̵�"));
		member.setPass(JOptionPane.showInputDialog("�н�����"));
		//JOptionPane.showMessageDialog(null, service.findById(member));
	}
	public void findAccountById() {
		//AccountService service = new AccountServiceImpl();
		AccountBean account;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("���̵�"));
		account.setPass(JOptionPane.showInputDialog("�н�����"));
		//JOptionPane.showMessageDialog(null, service.findById(account));
	}
	public void findAccountByName() {
		//AccountService service = new AccountServiceImpl();
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("�̸�")));
	}
}

