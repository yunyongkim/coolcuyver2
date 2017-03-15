package com.coolcuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coolcuy.domain.MemberDto;
import com.coolcuy.persistence.MemberDao;

public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDao member;
	
	@Override
	public int add(MemberDto object) {
		return member.add(object);
	}

	@Override
	public int delete(String element) {
		return 0;
	}

	@Override
	public int deleteAll() {
		return 0;
	}

	@Override
	public MemberDto update(MemberDto object) {
		return null;
	}

	@Override
	public MemberDto get(String element) {
		return null;
	}

	@Override
	public List<MemberDto> getAll() {
		return null;
	}

	@Override
	public int checkDuplicate(String email) {
		return 0;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public int checkPassword(String email, String password) {
		return 0;
	}

}
