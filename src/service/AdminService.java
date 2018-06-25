package service;
import java.util.*;
import domain.*;
public interface AdminService {
	public void createStaff(StaffBean staff);
	public List<MemberBean> memberList();
	public List<MemberBean> findMemberByName(String param);
	public MemberBean findmemberById(MemberBean member);
	public List<AccountBean> accountList();
	public List<AccountBean> findAccountByName(String name);
	public String createDate();
	public int createRandom(int start, int end);
	public String createAccountNo();
}
