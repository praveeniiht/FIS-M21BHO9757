package jaxbexample;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

public class TestEmployee {

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		  Marshaller marshaller = (Marshaller)context.getBean("jaxbMarshallerBean");  
		          
		 City city = new City();  
		  city.setName("Delhi");
		  city.setMax("38");  
		  city.setMin("19");
		  
		  FileWriter out = new FileWriter("city.xml");
		  StreamResult sresult = new StreamResult(out);
		          
		  marshaller.marshal(city,sresult);  
		    
		  System.out.println("XML Created Sucessfully");  

	}

}
