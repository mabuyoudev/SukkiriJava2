// 練習4-1

package chapter04;

import java.util.*;

public class Practice4_1 {

	public static void main(String[] args) {
		
	}

}

class Book01 implements Comparable<Book01>,Cloneable {
	private String	title;
	private Date	publishDate;
	private String	comment;
	
	public String getTitle() {
		return this.title;
	}
	public Date getPublishDate() {
		return this.publishDate;
	}
	public String getComment() {
		return this.comment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Book01)) return false;
		Book01 b = (Book01) o;
		if(this.title.equals(b.title) && this.publishDate.equals(b.publishDate)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hasCode() {
		int result = 37;
		result = result * 31 + title.hashCode();
		result = result * 31 + publishDate.hashCode();
		result = result * 31 + comment.hashCode();
		return result;
	}
	
	public int compareTo(Book01 obj) {
		if(this.publishDate.before(obj.publishDate)) return -1;
		if(this.publishDate.after(obj.publishDate)) return 1;
		return 0;
	}
	
	public Book01 clone() {
		Book01 result = new Book01();
		result.title = this.title;
		result.publishDate = (Date) this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}
}
