package springcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class TestSpringCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beanscollections.xml");
		Question quest = (Question) context.getBean("q");
		System.out.println(quest.qid);
		System.out.println(quest.question);
		System.out.println("The Answers by different people are:");
		List<Answer> ans = quest.answers;
		Iterator itr = ans.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Sample s1 = (Sample)context.getBean("s");
		Sample s2 = (Sample)context.getBean("s");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Person p = (Person) context.getBean("p");
		System.out.println(p);
	

	}

}
