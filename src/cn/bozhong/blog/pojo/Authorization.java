package cn.bozhong.blog.pojo;

public class Authorization {
	private String UserId;
	private String role; //adm user visitor
	
  public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

  @Override
public String toString() {
	return "Authorization [UserId=" + UserId + ", role=" + role + "]";
}
 

}
