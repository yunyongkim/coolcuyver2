/**
 * 
 */

	// 가입 절차 display
	function changeDisplay(current, other){
	 	var li = $('#row2 ul li');
	 	
	 	li.eq(current).css("background", "#eee");
	 	li.eq(current).css('color', '#666');
	 	li.eq(other).css('background', '#02a5af');
	 	li.eq(other).css('color', '#fff');
	 	$('.step').eq(current).css("display", "none");
		$('.step').eq(other).css("display", "block");
	}
	
	// 약관 동의 검증
	function validateConstract(){
		var warning = "정보 제공을 동의해주세요";
		var memberAgree = $('.memberAgree');
		var carAgree = $('.carAgree');
		
		if(memberAgree[0].checked == true && carAgree[0].checked == true){
			return true;
		}
		
		return false;
	}
	
	// 휴대폰 번호 검증
	function showKeyCode(event) {
		event = event || window.event;
		var keyID = (event.which) ? event.which : event.keyCode;
		
		if( ( keyID >=48 && keyID <= 57 ) || ( keyID >=96 && keyID <= 105 ) || keyID == 8
			|| keyID == 46 || keyID == 37 || keyID == 39 || keyID == 9 ){
			return;
		}
		
		return false;
	}
	
	// 패스워드 패턴 검증
	function patternPassword(password){	
		if(!/^[a-zA-Z0-9]{10,15}$/.test(password)){
			alert("숫자와 영문자 조합으로 10~15자리를 사용해야 합니다.");
			return true;
		}
	
		var checkNumber = password.search(/[0-9]/g);
		var checkEnglish = password.search(/[a-z]/ig);
	
		if(checkNumber < 0 || checkEnglish < 0){
			alert("숫자와 영문자를 혼용하여야 합니다.");
			return true;
	
		}
		
		return false;
	}
	
	 /* 패스워드와 패스워드 확인이 일치하는지 검증 */
	function checkedPassword(obj, otherObj){
		var warning = "비밀번호가 다릅니다.";
		if(!(obj === otherObj)){
			alert(warning);
			return false;
		}
		
		return true;
	}
	
 	 /* name에 의한 포커스. */
	function focus(name){
		name.focus();
	}
	
	 /* 고객 신상 정보 유효성 검사 */
	function validateMemberInfo(){
		if(frm.name.value == ""){
			alert("이름을 입력해 주세요.");
			focus(frm.name);
		}else if(frm.email.value == ""){
			alert("이메일을 입력해 주세요.");
			focus(frm.email);
		}else if(frm.emailValue.value == ""){
			alert("이메일을 입력해 주세요.");
			focus(frm.emailValue);
		}else if(frm.password.value == ""){
			alert("비밀번호를 입력해 주세요.");
			focus(frm.password);
		}else if(frm.checkPassword.value == ""){
			alert("비밀번호 확인을 입력해 주세요.");
			focus(frm.checkPassword);
		}else if(frm.firPhone.value == ""){
			alert("휴대폰 번호를 입력해 주세요.");
			focus(frm.firPhone);
		}else if(frm.secPhone.value == ""){
			alert("휴대폰 번호를 입력해 주세요.");
			focus(frm.secPhone);
		}else if(frm.zipCode.value == ""){
			alert("우편번호를 입력해 주세요.");
			focus(frm.zipCode);
		}else if(frm.roadAddr.value == ""){
			alert("도로명주소를 입력해 주세요.");
			focus(frm.roadAddr);
		}else if(patternPassword(frm.password.value)){
			alert("숫자와 영문자 조합으로 10~15자리를 사용해야 합니다.");
			focus(frm.password);
		}else if(!checkedPassword(frm.password.value, frm.checkPassword.value)){
			alert("비빌번호가 일치하지 않습니다.");
			focus(frm.checkPassword);
		}else{
			return true;
		}
		
		return false;
	}
	
	 // 운전면허증 유효성 검사
	function validateCard(){
		if(frm.licenseType.value == ""){
			alert("면허 타입을 선택해주세요");
			focus(frm.licenseType);
		} else if(frm.licenseNumber1.value == "" ||
				  frm.licenseNumber2.value == "" ||
				  frm.licenseNumber3.value == "" ||
				  frm.licenseNumber4.value == ""){
			alert("운전면허 번호를 입력해주세요");
			focus(frm.licenseNumber1);
		} else if(frm.expiryDate1.value == "" ||
				  frm.expiryDate2.value == "" ||
				  frm.expiryDate3.value == ""){
			alert("갱신 만료일을 입력해주세요");
			focus(frm.expiryDate1);
		} else if(frm.issuDate1.value == "" ||
				  frm.issuDate2.value == "" ||
				  frm.issuDate3.value == ""){
			alert("면허 발급일을 입력해주세요");
			focus(frm.issuDate1);
		} else if(frm.birth.value == ""){
			alert("면허  생년월일을 입력해주세요");
			focus(frm.birth);
		} else if(frm.gender.value == ""){
			alert("성별을 선택해주세요");
			focus(frm.gender);
		} else if(frm.cardType.value == ""){
			alert("카드종류를 선택해주세요");
			focus(frm.cardType);
		} else if(frm.cardNumber1.value == "" ||
				  frm.cardNumber2.value == "" ||
				  frm.cardNumber3.value == "" ||
				  frm.cardNumber4.value == ""){
			alert("카드번호를 입력해주세요");
			focus(frm.cardNumber1);
		} else if(frm.cardExpiryDate1.value == "" ||
				  frm.cardExpiryDate2.value == ""){
			alert("유효기간을 입력해주세요");
			focus(frm.cardExpiryDate1);
		}else if(frm.cardPassword.value == ""){
			alert("카드비밀번호를 입력해주세요");
			focus(frm.cardPassword);
		}else{
			return true;
		}
		
		return false;
	}
	
// 	 <form>의 name에 의한 selectBox를 활용하여 email 도메인을 쉽게 삽입할 수 있도록 편의성 제공 
	function selectEmail(frm){
		frm.emailValue.value= frm.selectBox.options[frm.selectBox.selectedIndex].text;
	}
	
	
	
	
	function licenseAdd(x, y) {
	    if (y.length == x.maxLength) {
	        var next = x.tabIndex;
	        next++;
	        document.getElementById("num"+next).focus();
	    }
	}
	
	function cardAdd(x, y) {
		if(y.length == x.maxLength){
			var next = x.tabIndex;
			next++;
			document.getElementById("CardNum"+next).focus();
		}
	}
	
	function reqMerge(){
		frm.phoneNumber.value = frm.zeroPhone.value + 
								frm.firPhone.value + 
								frm.secPhone.value;
		
		frm.expiryDate.value = frm.expiryDate1.value + 
								frm.expiryDate2.value + 
								frm.expiryDate3.value;
		
		frm.issuDate.value = frm.issuDate1.value + 
							frm.issuDate2.value + 
							frm.issuDate3.value;
		
		frm.cardNumber.value = frm.cardNumber1.value + 
								frm.cardNumber2.value +
								frm.cardNumber3.value;
		
		frm.cardExpiryDate.value = frm.cardExpiryDate1.value + 
									frm.cardExpiryDate2.value;
	}