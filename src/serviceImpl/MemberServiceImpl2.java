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
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
		//boolean flag = list.add(user);
		//res = (list.add(user))? "등록성공" : "등록실패";
				if(flag) {
					res = "등록성공";
				}else {
					res = "등록실패";
				} // 위의 과정들을 아래처럼 축약
		user.setCreditRating("7등급");
		System.out.println("실행결과: " + ((list.add(user))? "등록성공" : "등록실패"));
		
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		System.out.println("실행결과" + ((list.add(staff))? "등록성공" : "등록실패"));
		
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
		} // 아래처럼 사용.
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
		//list.remove(num2); 위와 같은 과정을 아래처럼 축약
		list.remove(list.indexOf(search(member)));
		//list.remove(search(member)); 이것도 가능
		
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