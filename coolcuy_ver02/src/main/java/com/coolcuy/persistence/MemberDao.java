package com.coolcuy.persistence;

import com.coolcuy.domain.LoginDto;
import com.coolcuy.domain.MemberDto;

public interface MemberDao extends GenericDao<MemberDto>{
	public String duplicateEmail(String email) throws Exception;
	public int getCount() throws Exception;
	public int validateLogin(LoginDto login) throws Exception;
	public int getRating(String email) throws Exception;
}
