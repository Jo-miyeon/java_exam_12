package java_exam;

public class Article {
	private int id;
	private String title;
	private String body;
	private String written;
	public Article() {
		
	}
	public Article(int id,String title,String body,String written) {
		this.id=id;
		this.body=body;
		this.title=title;
		this.written=written;
	}
	public String getWritten() {
		return written;
	}
	public void setWritten(String written) {
		this.written = written;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
