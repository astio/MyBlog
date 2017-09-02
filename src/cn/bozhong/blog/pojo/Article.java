package cn.bozhong.blog.pojo;

public class Article {
	
	  private String id;
	  private String auther; //userId
	  private String time;
	  private String text; //正文地理位置
	  
  public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

@Override
public String toString() {
	return "Article [id=" + id + ", auther=" + auther + ", time=" + time + ", text=" + text + "]";
}
  
}
