package com.coolcuy.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import com.coolcuy.domain.MemberDto;

public interface MemberDao extends GenericDao<MemberDto>{
	public String checkDuplicate(String email, Connection conn);
	public int getCount(Connection conn);
	public int checkPassword(String email, String password, Connection conn);
	public int getRating(String email, Connection conn);
}
