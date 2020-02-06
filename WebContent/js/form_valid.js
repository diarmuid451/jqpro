/**
 * 
 */

function fun1() {
			vname = document.ff.name.value;
			vid = document.ff.id.value;
			namelen = vname.trim().length;
			idlen = vid.trim().length;
			
			
			if(namelen == 0) {
				alert("이름을 입력하시라요");
				return false;
			}
			
			if(namelen < 2 || namelen >5) {
				alert("이름 범위가 벗어났소. 이에서 다섯 사이라우.");
				return false;
			}
			
			if(idlen == 0) {
				alert("아이디를 입력하시라요");
				return false;
			}
			if(idlen < 8 || idlen >12) {
				alert("아이디 범위가 벗어났소. 팔에서 열둘 사이라우.");
				return false;
			}
			
			res = "이름 : "+ vname + "<br>아이디 : "+vid +"<br><span>환영합네다, 동무!</span><br>";
			document.getElementById("result2").innerHTML = res;
		}	