
package com.coolcuy.persistence;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.coolcuy.domain.LoginDto;
import com.coolcuy.domain.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Inject
	private SqlSession session;
		
	private static String namespace = "com.chversion.mappers.MemberMapper";
	
	public void setSqlSession(SqlSession session){
		this.session = session;
	}
	
	@Override
	public int add(MemberDto object) {
		
		return session.insert(namespace, object);
	}
	
	@Override
	public int delete(String element) {
		return session.delete(namespace, element);
	}
	
	@Override
	public int deleteAll() {
		return session.delete(namespace);
	}

	@Override
	public int update(MemberDto object) {
		return session.insert(namespace, object);
	}

	@Override
	public MemberDto get(String element) {
		return session.selectOne(element);
	}

	@Override
	public List<MemberDto> getAll() {
		return session.selectList(namespace);
	}

	@Override
	public String duplicateEmail(String email) {
		return session.selectOne(namespace, email);
	}
	
	@Override
	public int getCount() {
		return session.selectOne(namespace);
	}
	
	@Override
	public int validateLogin(LoginDto loginDto) {
		return session.selectOne(namespace, loginDto);
	}
	
	@Override
	public int getRating(String email) {
		return session.selectOne(namespace, email);
	}
}
