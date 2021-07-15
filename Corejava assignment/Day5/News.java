package assignment5;

public class News {
	int newsid;
	String postedByUser;
	String commentByUser;
	String comment;
	
	public News(int newsid, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsid = newsid;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
