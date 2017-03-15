package com.coolcuy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coolcuy.domain.CardDto;
import com.coolcuy.domain.LicenseDto;
import com.coolcuy.domain.MemberDto;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/joinForm", method=RequestMethod.GET)
	public void joinForm(){
		logger.info(">>>>>>>>>> joinForm <<<<<<<<<<");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(MemberDto member, CardDto card, LicenseDto licence){
		logger.info(">>>>>>>>>> join <<<<<<<<<<");
		
		member.setLicenseDto(licence);
		
		System.out.println(member);
		System.out.println(card);
		System.out.println(licence);
		
		
		
		return "redirect:/member/joinSuccess";
	}
	
	@RequestMapping(value="/joinSuccess", method=RequestMethod.GET)
	public void joinSuccess(){
		logger.info(">>>>>>>>>> joinSuccess <<<<<<<<<<");
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public void loginForm(){
		logger.info(">>>>>>>>>> loginForm <<<<<<<<<<<" );
	}
	
	
}
