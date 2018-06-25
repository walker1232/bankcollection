package serviceImpl;
import service.*;
import domain.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class AdminServiceImpl implements AdminService{
	private static AdminServiceImpl instance = new AdminServiceImpl();
	public static AdminServiceImpl getInstance() {return instance;}
	private AdminServiceImpl() {}

	List<MemberBean> list;
	List<AccountBean> accountList;
	/*public AdminServiceImpl() {
		list = new ArrayList<>();
		accountList = new ArrayList<>();
	}*/
	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		list.add(staff);
		
	}

	@Override
	public List<MemberBean> memberList() {
		return list;
	}

	@Override
	public List<MemberBean> findMemberByName(String param) {
		/*List<MemberBean> temp = new ArrayList<>();
		Set<MemberBean> set = new HashSet<>();
		for(Map.Entry<String, MemberBean> e : map.entrySet()) {	//Entry는 객체 키값을 끊고 value만 들어있음
			if(param.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		}
		Iterator<MemberBean> it = set.iterator();	// iterator 순환
		while(it.hasNext()) {	// 다음이 있을때까지 루프
			temp.add(it.next());
		}
		return temp;*/
		List<MemberBean> temp = new ArrayList();
		for(MemberBean e : list) {
			if(param.equals(e.getName())) {
				temp.add(e);
			}
		}
		return temp;
	}

	@Override
	public MemberBean findmemberById(MemberBean member) {
		MemberBean temp = new MemberBean();
		for(MemberBean e : list) {
			if(member.getUid().equals(e.getUid())){
				temp = e; break;
			}
		}
		return temp;
	}

	@Override
	public List<AccountBean> accountList() {
		return accountList;
	}

	@Override
	public List<AccountBean> findAccountByName(String name) {
		List<AccountBean> temp = new ArrayList<AccountBean>();
		for(int i=0; i<accountList.size(); i++) {
			if(name.equals(accountList.get(i).getName())) {
				temp.add(accountList.get(i));
			}
		}
		return temp;
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월dd일").format(new Date());
	}

	@Override
	public int createRandom(int start, int end) {
		return (int)(Math.random()*end)+start;
	}

	@Override
	public String createAccountNo() {
		String accountNo = "";
		for(int i=0; i<3; i++) {
			accountNo += (i == 2 )? String.valueOf(createRandom(0,999)): String.valueOf(createRandom(0,999))+"-";
		}
		return accountNo;
	}
	
}
