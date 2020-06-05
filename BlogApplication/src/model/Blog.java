package model;

import java.time.LocalDate;

public class Blog {
	
	private int blogid;
	private String blogtitle;
	private String blogdescription;
	private LocalDate postedon;
	
	
	
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getBlogdescription() {
		return blogdescription;
	}
	public void setBlogdescription(String blogdescription) {
		this.blogdescription = blogdescription;
	}
	public LocalDate getPostedon() {
		return postedon;
	}
	public void setPostedon(LocalDate postedon) {
		this.postedon = postedon;
	}
	
	
	

}
