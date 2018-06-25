package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum MemberButt{
	// JOIN은 일반유저 추가, ADD는 직원 추가
	EXIT, 
	JOIN, ADD,// create => create(추가)하는 method
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,	// all, one, some int => read(검색)하는 method
	UPDATE,	//void update(수정)하는 method
	WITHDRAWAL	//void delete(삭제)하는 method		통틀어 CRUD method 기본은 7가지
}	// 기본 신용도는 7급 user.setCreditRate("7등급");
public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	
	public void userAdd/*join*/(UserBean member) {
		//MemberService service = new MemberServiceImpl();
		
		System.out.println("===============멤버 컨트롤러==============");
		System.out.println("화면에서 넘어온 객체:" + member);
		MemberServiceImpl.getInstance().createUser(member);
	}
	public void update() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드")
				+"/"+ JOptionPane.showInputDialog("새로운 패스워드"));
		MemberServiceImpl.getInstance().updatePass(member);
		//JOptionPane.showMessageDialog(null, service.updatePass(member));
	}
	public void withdrawal() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드")
				+"/"+ JOptionPane.showInputDialog("패스워드 확인"));
		MemberServiceImpl.getInstance().deleteMember(member);
		//JOptionPane.showMessageDialog(null, service.deleteMember(member));
	}
	
}

