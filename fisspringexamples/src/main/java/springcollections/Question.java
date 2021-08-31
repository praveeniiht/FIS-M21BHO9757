package springcollections;
import java.util.*;
public class Question {
	int qid;
	String question;
	List<Answer> answers;
	public Question(int qid, String question, List<Answer> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	

}
