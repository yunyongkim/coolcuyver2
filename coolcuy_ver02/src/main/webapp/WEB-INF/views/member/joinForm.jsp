<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<title>joinForm</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 공용 css -->
<link rel="stylesheet" href="/resources/css/common/top.css" />

<!-- 페이지 css -->
<link rel="stylesheet" href="/resources/css/member/joinForm.css" />

<!-- 공용 jQuery -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="/resources/js/common/requestBtn.js"></script>

<!-- daum 주소 검색 javaScript -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="/resources/js/address.js"></script>

<!-- 요청 validate -->
<script src="/resources/js/member/joinForm.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		// 가입 절차 검증과 이동 알고리즘
		$('.next_btn').click(function(){	
			var index = $('.next_btn').index(this);
			
			if(index == 0){				
				if(validateConstract()){					
					changeDisplay(index, index+1);
				}else{
					alert(warning);
				}
				
			}else if(index == 1){
				if(validateMemberInfo()){
					changeDisplay(index, index+1);
				}
			}else if(index == 2){
				if(validateCard()){
					changeDisplay(index, index+1);
					reqMerge();
					frm.submit();
				}
			}
		});
	
		$('.pre_btn').click(function(){	
			var index = $('.pre_btn').index(this)+1;
						
			if(index == 0){
				changeDisplay(index, index-1);					
								
			}else if(index == 1){
				changeDisplay(index, index-1);
				
			}else if(index == 2){
				changeDisplay(index, index-1);
				
			}
		})
	});
	
	
</script>

</head>
<body>
    <div id="wrap">
		<jsp:include page="../include/top.jsp" />
		
<!-- 		하위 경로 -->
        <section id="row1">
            <div id="row1_text01">회원가입</div>
            <div id="row1_text02">
                <ul>
                    <li>
                        <a href="#"><img src="/version0116/imag/member_img02.png"></a>
                    </li>
                    <li class="text02_up"><a href="#">Home</a></li>
                    <li class="text02_up"><a>></a></li>
                    <li class="text02_up"><a href="#">회원가입</a></li>
                </ul>
            </div>
        </section>
        
        <!----------------------- 가입 절차 메뉴 display ----------------------------->
        <section id="row2">
            <ul>
                <li class="select_view">약관 확인</li>
                <li class="view">필수정보입력</li>
                <li class="view">운전면허/결제정보 등록</li>
                <li class="view">회원가입 완료</li>
            </ul>
		</section>
        <!---------------------------약관확인------------------------------->
		<section id="row3" class="step">
			<div id="top_row3">
	            <div class="row3">
	                <div class="row3_title01">차량 대여를 위한 개인정보 수집/이용동의</div>
	            </div>
	            <div id="row3_01">
	                <div class="row3_02">
	                    <h4>제1조 (목적)</h4>
	                    <p>이 약관은 </p>
	                </div>
	                <div class="row3_check">
	                    <input type="radio" class="carAgree" name="carAgree" checked="checked" />
	                    <div class="row3_02_agg">동의합니다</div>
	                    <input type="radio" class="carAgree" name="carAgree" />
	                    <div class="row3_02_agg">동의하지않습니다</div>
	                </div>
	            </div>
	            <div id="row3_03">
	                <div class="row3_title01">개인정보 취급위탁에 대한 동의</div>
	                <div class="row3_02">
	                    <h4>제1조 (목적)</h4>
	                    <p>이 약관은</p>
	                </div>
	                <div class="row3_check">
	                    <input type="radio" class="memberAgree" name="memberAgree" checked="checked" />
	                    <div class="row3_02_agg">동의합니다</div>
	                    <input type="radio" class="memberAgree" name="memberAgree" />
	                    <div class="row3_02_agg">동의하지않습니다</div>
	                </div>
	            </div>
	            <div id="row3_bt">
	                <button class="next_btn">다음단계</button>
	            </div>
            </div>     
        </section>
     
    <!-- -------------------------회원 가입 요청 form --------------------------- -->
	<form name="frm" action="/member/join" method="post">
       <!--  -------------------------------회원정보---------------------------------->
        <input type="hidden" name="phoneNumber" />
        <input type="hidden" name="cardNumber" />
        <input type="hidden" name="cardExpiryDate" />
        <input type="hidden" name="issuDate" />
        <input type="hidden" name="expiryDate" /> 
        
        <section id="row4" class="step">
            <div id="row4_01">
                <h2>회원 정보<span>필수 항목이므로 반드시 입력 해 주십시오</span></h2>
            </div>
            <div id="row4_02">
                <label class="row4_02_td">이름</label>
                <div class="row4_02_text"><input type="text" id="nameText" name="name" maxlength="4" value="홍길동"></div>
                <div class="clear"></div>
                
                <label id="row4_02_email">E-Mail</label>
                <div id="row4_02_email_01">
                    <input type="text" name="email"  maxlength="14" value="a"><span id="row4_02_span">@</span>
                    <input type="text" name="emailValue"  maxlength="10" value="naver.com">
                    <div id="row4_02_email_box">
	                    <select class="email_sel" name="selectBox" onChange="selectEmail(frm);">
	                        <option value="">직접입력</option>
	                        <option value="naver.com">naver.com</option>
	                        <option value="daum.net">daum.net</option>
	                        <option value="gmail.com">gmail.com</option>
	                    </select>
                    </div>
                    <a href="#"><div id="email_bt">중복확인</div></a>
                    <div id="email_text">등록한 이메일 주소를 아이디로 적용합니다.<br>중요 서비스 공지 및 결제내역 안내 메일 발송</div>
                </div>
                <label class="row4_02_td">비밀번호</label>
                <div class="row4_02_text"><input type="password" id="firpass" name="password" maxlength="14"></div>
                <div id="row4_02_pas">숫자와 영문자 조합으로 10~15자리를 사용해야 합니다.</div>
                <div class="clear"></div>
                <label class="row4_02_td">비밀번호확인</label>
                <div class="row4_02_text"><input type="password" id="secpass" name="checkPassword"  maxlength="14">
                
                </div>
                
                <label class="row4_02_td">휴대폰번호</label>
                <div id="row4_02_number">
                    <select id="number_sel" name="zeroPhone">
                        <option>010</option>
                        <option>011</option>
                        <option>012</option>
                        <option>018</option>
                        <option>019</option>
                    </select><span class="number_space">-</span>
                    <input type="text" name="firPhone" onkeydown="return showKeyCode(event)" maxlength="4" value="000">
                    <span class="number_space">-</span>
                    <input type="text" name="secPhone" onkeydown="return showKeyCode(event)"  maxlength="4" value="0000">
<!--                     <a href="#"><div id="number_bt">인증요청</div></a> -->
                </div>
                
<!--                 <label class="row4_02_td">인증번호</label> -->
<!--                 <div class="row4_02_text"><input type="text"></div> -->
                
                <label id="row4_02_add">주소</label>
                <div id="row4_02_add_in"><input type="text" id="postcode" name="zipCode" value="12345"></div>
                <a href="#" onclick="execDaumPostcode()"><div id="add_bt">주소찾기</div></a>
                <div id="row4_02_add_long">
                	<input type="text" id="roadAddress" name="roadAddr" value="중앙로 1길">
                	<input type="text" id="detailAdress" name="detailAddr" placeholder="상세주소를 입력하세요" value="중앙로역 본부">
                </div>
                <div id="add_text">반드시 우편물 수취가 가능한 곳이여야 합니다.</div>
                <div class="clear"></div>
                
                <label class="row4_02_td">주 사용 지역</label>
                <div id="row4_02_check">
                    <input type="checkbox" name="primaryArea" value="서울"><span>서울</span>
                    <input type="checkbox" name="primaryArea" value="강원/경기"><span>강원/경기</span>
                    <input type="checkbox" name="primaryArea" value="대구/경북"><span>대구/경북</span>
                    <input type="checkbox" name="primaryArea" value="부산/경남"><span>부산/경남</span>
                    <input type="checkbox" name="primaryArea" value="광주/전라"><span>광주/전라</span>
                    <input type="checkbox" name="primaryArea" value="제주"><span>제주</span>
                </div>
            </div>
            <div class="area_btn">
                <input type="button" class="pre_btn" value="이전단계" />            
                <input type="button"  class="next_btn" value="다음단계" />
            </div>
        </section>
        
      
        <!----------------------------------- 면허 정보 ----------------------------------->
        <section id="row5" class="step">
            <div id="row5_01">
                <h2>운전면허증 등록<span></span></h2>
            </div>
            
            <div id="row5_02">
                <div class="row5_02_td">면허종류</div>
                <div class="row5_02_back">
                    <input type="radio" name="licenseType" value="1종보통" checked="checked">
                    <span class="back_text">1종보통</span>
                    <input type="radio" name="licenseType" value="2종보통">
                    <span class="back_text">2종보통</span>
                    <input type="radio" name="licenseType" value="1종대형">
                    <span class="back_text">1종대형</span>
                </div>
                
                <div class="row5_02_td">면허번호</div>
                 <div class="row5_02_back">
                    <div class="row5_02_num01">
                    	<input id="num1" type="text" size="2" tabindex="1" maxlength="2"
                    		   name="licenseNumber1" 
                               onkeyup="licenseAdd(this, this.value)"
                               onkeydown="return showKeyCode(event)" 
                               value="00">
                    </div>
                    <div class="row5_02_num02">
                    	<input id="num2" type="text" size="2" tabindex="2" maxlength="2"
                    		   name="licenseNumber2" 
                    		   onkeyup="licenseAdd(this, this.value)"
                    		   onkeydown="return showKeyCode(event)"
                    		   value="00">
                    </div>
                    <div class="row5_02_num03">
                    	<input id="num3" type="text" size="6" tabindex="3" maxlength="6"
                    		   name="licenseNumber3" 
                    	 	   onkeyup="licenseAdd(this, this.value)"
                    	 	   onkeydown="return showKeyCode(event)"
                    	 	   value="000000">
                    </div>
                    <div class="row5_02_num04">
                    	<input id="num4" type="text" size="2" tabindex="4" maxlength="2"
                    		   name="licenseNumber4" 	
                    		   onkeyup="licenseAdd(this, this.value)"
                    		   onkeydown="return showKeyCode(event)"
                    		   value="00">
                    </div>
                </div>
                
                <div class="row5_02_td">갱신기간 만료일</div>
                <div class="row5_02_back">
                    <div class="row5_02_day01"><input type="text" maxlength="4" name="expiryDate1" placeholder="yyyy" value="2013"></div>
                    <div class="row5_02_day02"><input type="text" maxlength="2" name="expiryDate2" placeholder="mm" value="11"></div>
                    <div class="row5_02_day02"><input type="text" maxlength="2" name="expiryDate3" placeholder="dd" value="30"></div>
                </div>
                
                <div class="row5_02_td">면허 발급일</div>
                <div class="row5_02_back">
                    <div class="row5_02_day01"><input type="text" maxlength="4" name="issuDate1" placeholder="yyyy" value="2017"></div>
                    <div class="row5_02_day02"><input type="text" maxlength="2" name="issuDate2" placeholder="mm" value="11"></div>
                    <div class="row5_02_day02"><input type="text" maxlength="2" name="issuDate3" placeholder="dd" value="30"></div>
                </div>
                
                <div class="row5_02_td">생년월일</div>
                <div class="row5_02_back">
                    <div class="row5_02_birth"><input type="text" maxlength="6" name="birth" placeholder="yymmdd" value="851130">
                        <div id="birth_text">(6자리)</div>
                    </div>
                    <div id="birth_man"><input type="radio" name="gender" value="1" checked="checked"><span class="birth_sex">남성</span></div>
                    <div id="birth_woman"><input type="radio"  name="gender" value="2"><span class="birth_sex">여성</span></div>
                </div>
            </div>
            <!----------------------------------- 카드 정보 ----------------------------------->
            <div id="row5_03">
                <h2>결제카드 등록</h2>
            </div>
            
            <div id="row5_04">
            	<div class="row5_02_td">카드종류 </div>
                <div class="row5_02_back">
                        <select id="row5_sel" name="cardType">
                            <option>대구은행</option>
                            <option>국민은행</option>
                            <option>신한은행</option>
                            <option>기업은행</option>
                            <option>농협은행</option>
                        </select>
                </div> 
                
                <div class="row5_02_td">카드번호</div>
                <div class="row5_02_back">
                    <div id="row5_04_num01">
                    	<input type="text" name="cardNumber1" 
                    		   tabindex="1" maxlength="4"
                  			   id="CardNum1"
                  			   onkeyup="cardAdd(this, this.value)"
                   		       onkeydown="return showKeyCode(event)"
                   		       value="0020">
                   		       
                   		       </div>
                    <span class="num_sl">-</span>
                    <div id="row5_04_num02"><input type="text" name="cardNumber2" tabindex="2" maxlength="4"
                    		   id="CardNum2"
                  			   onkeyup="cardAdd(this, this.value)"	
                    		   onkeydown="return showKeyCode(event)"></div>
                    <div class="num_sl_01">-</div>
                    <div id="row5_04_num03"><input type="text" name="cardNumber3" tabindex="3" maxlength="4"
                    		   id="CardNum3"
                  			   onkeyup="cardAdd(this, this.value)"
                    		   onkeydown="return showKeyCode(event)"
                    		   value="0000"></div>
                    <div id="num_sl_02">-</div>
                    <div id="row5_04_num04"><input type="text" name="cardNumber4" tabindex="4" maxlength="4"
                    		   id="CardNum4"
                  			   onkeyup="cardAdd(this, this.value)"
                    		   onkeydown="return showKeyCode(event)"  value="0000"></div>
                </div>
                <div class="row5_02_td">유효기간</div>
                <div class="row5_02_back">
                    <div id="row5_04_day"><input type="text"  name="cardExpiryDate1" maxlength="2" placeholder="dd" value="30"></div>
                    <div id="row5_04_day01"><input type="text" name="cardExpiryDate2" maxlength="2" placeholder="mm" value="11"></div>
                </div>
                
<!--                 <div class="row5_02_td">생년월일</div> -->
<!--                 <div class="row5_02_back"> -->
<!--                     <div class="row5_02_birth"><input type="text" name="birth" maxlength="6"></div> -->
<!--                     <div id="birth_text">(6자리)</div> -->
<!--                 </div> -->
                
                <div class="row5_02_td">비밀번호</div>
                <div class="row5_02_back">
                    <div id="row5_04_pass"><input type="password" name="cardPassword" maxlength="4" value="0000"></div>
                </div>
            </div>
            
            <div class="area_btn">
                <input type="button" class="pre_btn" value="이전단계">
                <input type="button" class="next_btn" value="회원가입">
            </div>
        </section>
	</form>
        
        <!---------------------------가입완료------------------------->
        <section id="row6">
            <div id="row6_img">
                <img src="../imag/member_03_img.png">
            </div>
            
            <div id="row6_02">
                <div id="row6_02_text01">축하드립니다.</div>
                <div id="row6_02_text02">회원가입이 완료되었습니다.</div>
            </div>
            
            <div id="row6_bt">
                <a href="#" class="row6_service_bt">서비스안내</a>
                <a href="#" class="row6_home_bt">홈으로</a>
            </div>
        </section>
    </div>

</body>
</html>