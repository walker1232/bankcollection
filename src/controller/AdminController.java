package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

enum AdminButt{
	// JOIN은 일반유저 추가, ADD는 직원 추가
	EXIT, 
	JOIN, ADD,// create => create(추가)하는 method
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,	// all, one, some int => read(검색)하는 method
	UPDATE,	//void update(수정)하는 method
			//void delete(삭제)하는 method		통틀어 CRUD method 기본은 7가지
}	// 기본 신용도는 7급 user.setCreditRate("7등급");
public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	public AdminController() {}
	
	public void staffAdd() {
		//MemberService service = new MemberServiceImpl();
		/*MemberBean member = null;
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("핸드폰"));
		member.setEmail(JOptionPane.showInputDialog("이메일"));*/
		//service.createStaff((StaffBean) member);
		//service.createStaff(member);
	}
	public void MemberList() {
		//MemberService service = new MemberServiceImpl();
		//JOptionPane.showMessageDialog(null, service.list());
	}
	public void findMemberByName() {
		//MemberService service = new MemberServiceImpl();
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void findMemberById() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		//JOptionPane.showMessageDialog(null, service.findById(member));
	}
	public void findAccountById() {
		//AccountService service = new AccountServiceImpl();
		AccountBean account;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPass(JOptionPane.showInputDialog("패스워드"));
		//JOptionPane.showMessageDialog(null, service.findById(account));
	}
	public void findAccountByName() {
		//AccountService service = new AccountServiceImpl();
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름")));
	}
}

