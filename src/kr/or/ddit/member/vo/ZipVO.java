package kr.or.ddit.member.vo;

public class ZipVO {
	
private String zipcode;
private String sido;
private String gugun;
private String dong;
private String bunji;
public ZipVO(String zipcode, String sido, String gugun, String dong, String bunji) {
	super();
	this.zipcode = zipcode;
	this.sido = sido;
	this.gugun = gugun;
	this.dong = dong;
	this.bunji = bunji;
}
public ZipVO() {
	super();
	// TODO Auto-generated constructor stub
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getSido() {
	return sido;
}
public void setSido(String sido) {
	this.sido = sido;
}
public String getGugun() {
	return gugun;
}
public void setGugun(String gugun) {
	this.gugun = gugun;
}
public String getDong() {
	return dong;
}
public void setDong(String dong) {
	this.dong = dong;
}
public String getBunji() {
	return bunji;
}
public void setBunji(String bunji) {
	this.bunji = bunji;
}

	

}
