package com.coolcuy.service;

import com.coolcuy.domain.MemberDto;

public interface MemberService extends GenericService<MemberDto>{
	public int checkDuplicate(String email);
	public int getCount();
	public int checkPassword(String email, String password);
}
