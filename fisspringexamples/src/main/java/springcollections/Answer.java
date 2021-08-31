package springcollections;

public class Answer {
	int aid;
	String answer;
	String byAuthor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", byAuthor=" + byAuthor + "]";
	}
	public String getByAuthor() {
		return byAuthor;
	}
	public void setByAuthor(String byAuthor) {
		this.byAuthor = byAuthor;
	}
	

}
