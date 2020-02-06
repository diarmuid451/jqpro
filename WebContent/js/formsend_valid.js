/**
 * 정규식으르 이용한 데이터 검증
 * 비교문자.match(정규식)
 * 정규식.test(비교문자) : 문자값이 정규식에 맞는가? / true or false로 리턴
 */

function sendFun()  {
	f = document.ff;
	
	//id영문자로 시작하고 숫자를 조합해서 8~12사이로 한다.
	vid = f.id.value;
	
	idlen = vid.trim().length;
	
	if(idlen == 0) {
		alert("아이디를 입력해주세요.");
		return false;
	} 
	if(idlen < 0  || idlen > 12) {
		alert("아이디는 8~12자리로 설정해주세요.");
		return false;
	}
	
	idreg = /^[a-zA-Z][0-9a-zA-Z]{7,11}$/;
	if(!(idreg.test(vid))) {
		alert("아이디 형식이 잘못되었습니다.");
		return false;
	}
	
	vname = f.name.value;
	namelen = vname.trim().length;
	if(namelen == 0) {
		alert("이름을 입력해 주세요.");
		return false;
	}
	namereg = /^[가-힣]+|^[a-zA-Z]+$/;
	if(namereg.test(vname)) {
		rkor = /^[가-힇]+$/;
		reng = /^[a-zA-Z]+$/;
		if (rkor.test(vname)) {
			if (namelen < 2 || namelen > 5) {
				alert("한글 이름은 2~5자리 입니다.");
				return false;
			}
		} else if(reng.test(vname)) {
			if(namelen < 10 || namelen > 20) {
				alert("영문 이름은 10~20자리 입니다.");
				return false;
			}
		} else {
			alert("이름 형식 오류입니다.");
			return false;
		}
	} else {
		alert("이름 형식 오류입니다.");
		return false;
	}
	
	// \w+(?=str) >> str을 찾아서 str을 기준으로 앞에 한번이상 나오는 문자나 숫자를 검색
	// \w*(?=str) >> str을 찾아서 str을 기준으로 문자나 숫자가 없을시 str로 시작
	vpass = f.pass.value;
	passlen = vpass.trim().length;
	
	if(passlen == 0) {
		alert("비밀번호를 입력해주세요.");
		return false;
	} 
	if(passlen < 8  || passlen > 12) {
		alert("비밀번호는 8~12자리로 설정해주세요.");
		return false;
	}
	
	passreg = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#$%^&*]).{8,12}$/;
	if (!(passreg.test(vpass))) {
		alert("비밀번호 형식 오류. !와 @는 포함될 수 없습니다.");
		return false;
	}
	
	vtel = f.tel.value;
	tellen = vtel.trim().length;
	
	if(tellen == 0) {
		alert("전화번호를 입력해주세요.");
		return false;
	}
	
	telreg = /^\d{3}-\d{4}-\d{4}$/;
	if (!(telreg.test(vtel))) {
		alert("전화번호 형식 오류.");
		return false;
	}
	
	vmail= f.mail.value;
	maillen = vmail.trim().length;
	
	if(maillen == 0) {
		alert("이메일 주소를 입력해주세요.");
		return false;
	}
	
	mailreg = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z0-9]+){1,2}$/;
	if (!(mailreg.test(vmail))) {
		alert("이메일 형식 오류. @를 반드시 넣어주세요.");
		return false;
	}
	
	vcheck = f.passCheck.value;
	
	if(vpass != vcheck) {
		alert("일치하는 비밀번호를 입력해주세요.");
		return false;
	}
	
	
	
	
	
	return true;
}