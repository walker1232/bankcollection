package serviceImpl;
import java.util.*;
import repository.*;
import repositoryImpl.*;
import domain.*;
import repositoryImpl.MemberDAOImpl;
import service.*;
public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {return instance;}
	private MemberServiceImpl() {}

	//MemberDAO dao;
	/*Map<String,MemberBean> map;
	public MemberServiceImpl() {
		map = new HashMap<>();
	}*/
	
	//private MemberServiceImpl() {}
	/*@Override
	public void createUser(MemberBean member) {
		user.setCreditRating("7���");
		map.put(user.getUid(), user);
	}*/
	@Override
	public void createUser(UserBean member) {
		
		(member).setCreditRating("7���");
		System.out.println("===============��� ����==============");
		System.out.println("��Ʈ�ѷ����� �Ѿ�� ��ü:" + member);
		MemberDAOImpl.getInstance().insertMember(member);
	}

	

	

	/*@Override
	public List<MemberBean> findByName(String param) {
		
	}*/

	/*@Override
	public MemberBean findById(MemberBean member) {
		System.out.println("�O�� ���̵� �ش��ϴ� �̸�: "+ map.get(member.getUid()));
		return map.get(member.getUid());
	}*/


	@Override
	public void updatePass(MemberBean member) {
		String id = member.getUid();
		String oldPw = member.getPass().split("/")[0];
		String newPw = member.getPass().split("/")[1];
		if(id.equals(null)) {
			System.out.println("���̵� ����");
		}else {
			if(oldPw.equals(member.getPass())) {
				member.setPass(newPw);
			}
		}
		//MemberBean mem = map.get(member.getUid());
		/*if(mem == null) {
			System.out.println("�����Ϸ��� ID�� ����");
		}else {
			if(oldPw.equals(mem.getPass())) {
				mem.setPass(newPw);
				map.put(id, mem);
			}
		}*/
		
		/*MemberBean mem = new MemberBean();
		
		for(int i=0; i<list.size(); i++) {
		if(member.getUid().equals(list.get(i).getUid())){
			mem = list.get(i); break;
		}
		}*/
	}

	@Override
	public void deleteMember(MemberBean member) {
		//map.remove(member.getUid());
		
	}
	
	@Override
	public String login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
}
