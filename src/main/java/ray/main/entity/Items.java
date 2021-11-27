package ray.main.entity;

import java.time.LocalDateTime;

public class Items {
	
	String title;
	String info;
	String url;
	LocalDateTime submission_date;
	
	public Items(String title, String info, String url, LocalDateTime submission_date) {
		this.title = title;
		this.info = info;
		this.url = url;
		this.submission_date = submission_date;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public LocalDateTime getSubmission_date() {
		return submission_date;
	}
	public void setSubmission_date(LocalDateTime submission_date) {
		this.submission_date = submission_date;
	}
	
	
}
