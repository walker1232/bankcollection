/*package serviceImpl;
import java.util.List;
import java.util.ArrayList;

import domain.*;
import service.*;
public class MemberServiceImpl2 implements MemberService2{
	
	List<MemberBean> list;
	public MemberServiceImpl2() {
		list = new ArrayList<MemberBean>();
	}
	@Override
	public void createUser(UserBean user) {
		boolean flag = list.add(user);
		if(flag) {
			System.out.println("��ϼ���");
		}else {
			System.out.println("��Ͻ���");
		}
		//boolean flag = list.add(user);
		//res = (list.add(user))? "��ϼ���" : "��Ͻ���";
				if(flag) {
					res = "��ϼ���";
				}else {
					res = "��Ͻ���";
				} // ���� �������� �Ʒ�ó�� ���
		user.setCreditRating("7���");
		System.out.println("������: " + ((list.add(user))? "��ϼ���" : "��Ͻ���"));
		
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		System.out.println("������" + ((list.add(staff))? "��ϼ���" : "��Ͻ���"));
		
	}

	@Override
	public List<MemberBean> list() {
		return list;
	}

	@Override
	public List<MemberBean> search(String param) {
		List<MemberBean> temp = new ArrayList();
		for(MemberBean e : list) {
			if(param.equals(e.getName())) {
				temp.add(e);
			}
		}
		return temp;
	}

	@Override
	public MemberBean search(MemberBean member) {
		MemberBean temp = new MemberBean();
		for(int i=0; i<list.size(); i++) {
			if(member.getUid().equals(list.get(i).getUid())){
				temp = list.get(i); break;
			}
		} // �Ʒ�ó�� ���.
		MemberBean temp = new MemberBean();
		for(MemberBean e : list) {
			if(member.getUid().equals(e.getUid())){
				temp = e; break;
			}
		}
		return temp;
	}

	@Override
	public void update(MemberBean member) {	
		list.get(list.indexOf(search(member))).setPass(member.getPass());
	}

	@Override
	public void delete(MemberBean member) {
		//list.remove(index);
		//int num2 = list.indexOf(temp);
		//int num2 = list.indexOf(search(member));
		//list.remove(num2); ���� ���� ������ �Ʒ�ó�� ���
		list.remove(list.indexOf(search(member)));
		//list.remove(search(member)); �̰͵� ����
		
		int num = 0;
		for(int i=0; i<list.size(); i++) {
			if(member.getUid().equals(list.get(i).getUid())){
				num = i;
			}
		}
		list.remove(num);
	}
}
*/