package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum MemberButt{
	// JOIN�� �Ϲ����� �߰�, ADD�� ���� �߰�
	EXIT, 
	JOIN, ADD,// create => create(�߰�)�ϴ� method
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT,	// all, one, some int => read(�˻�)�ϴ� method
	UPDATE,	//void update(����)�ϴ� method
	WITHDRAWAL	//void delete(����)�ϴ� method		��Ʋ�� CRUD method �⺻�� 7����
}	// �⺻ �ſ뵵�� 7�� user.setCreditRate("7���");
public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	
	public void userAdd/*join*/(UserBean member) {
		//MemberService service = new MemberServiceImpl();
		
		System.out.println("===============��� ��Ʈ�ѷ�==============");
		System.out.println("ȭ�鿡�� �Ѿ�� ��ü:" + member);
		MemberServiceImpl.getInstance().createUser(member);
	}
	public void update() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("���̵�"));
		member.setPass(JOptionPane.showInputDialog("�н�����")
				+"/"+ JOptionPane.showInputDialog("���ο� �н�����"));
		MemberServiceImpl.getInstance().updatePass(member);
		//JOptionPane.showMessageDialog(null, service.updatePass(member));
	}
	public void withdrawal() {
		//MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("���̵�"));
		member.setPass(JOptionPane.showInputDialog("�н�����")
				+"/"+ JOptionPane.showInputDialog("�н����� Ȯ��"));
		MemberServiceImpl.getInstance().deleteMember(member);
		//JOptionPane.showMessageDialog(null, service.deleteMember(member));
	}
	
}

