package com.coolcuy.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coolcuy.domain.MemberDto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDaoTest {
	MemberDto member;
	
	
	@Before
	public void setUp(){
		member = new MemberDto("1111", "010-2067-3316", "김윤용", "1111", "0","55555", 
				"대구시", "자세한 주소", "대구", null, 0, 0, "11111111", "1종보통", "20160505", "20160505", "1");
	}
	
	@Test
	public void add(){
//		memberDao.add(member);
//		MemberDto getMember = memberDao.get(member.getEmail());
//		
//		System.out.println(getMember);
	}
}
