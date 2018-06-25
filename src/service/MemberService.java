package service;

import java.util.*;
import domain.*;

public interface MemberService {

	public void createUser(UserBean user);
	public String login(MemberBean member);
	public void updatePass(MemberBean member);
	public void deleteMember(MemberBean member);
	
	

	
}
