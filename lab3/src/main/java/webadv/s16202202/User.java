package webadv.s16202202;

import javax.validation.constraints.Pattern;

public class User {
	@Pattern(regexp="[a-z]{3}",message="请输入3个字母")
	public String account;
	@Pattern(regexp="[0-9|]{6}",message="请输入6位数字")
	public String password;	
	public String getAccount() {
		return account;
	}	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
