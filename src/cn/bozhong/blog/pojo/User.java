package cn.bozhong.blog.pojo;

public class User {
	 public String getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", sex=" + sex + ", username=" + username + ", password=" + password
				+ ", avater=" + avater + ", history=" + history + ", mark=" + mark + ", article=" + article + "]";
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvater() {
		return avater;
	}
	public void setAvater(String avater) {
		this.avater = avater;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	 private String userId; //账号
	 private String  sex;  //男 女
	 private String  username; //用户名
	 private String password; //密码
	 private String avater; //头像 地理位置
	 private String history;//历史浏览
	 private String mark;//收藏文章
	 public String getArticle() {
		return article;
	}
	public void setArticle(String artile) {
		this.article = artile;
	}

	private String article; //用户文章

}
