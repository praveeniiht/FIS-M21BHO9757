package fisspringexamples;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
	Employee e = (Employee) ctx.getBean("emp");
	e.display();
	Student s = (Student) ctx.getBean("stu");
	s.test();
	
	Address a = (Address) ctx.getBean("addr");
	System.out.println(a);
	
	Questions q  = (Questions) ctx.getBean("quest");
	System.out.println(q.getQid()+" "+q.getQuestion());
	System.out.println("The answers are: ");
	List<String> answers = q.getAnswers();
	answers.forEach(System.out::println);
	
	

	}

}
