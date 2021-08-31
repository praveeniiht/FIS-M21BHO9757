package fisspringexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
	Employee e = (Employee) ctx.getBean("emp");
	e.display();

	}

}
