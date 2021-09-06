package jaxbexample;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ObjXMLMapper objXMLMapper = context.getBean("objXmlmapper", ObjXMLMapper.class);

		try {
			objXMLMapper.objToXML();
			objXMLMapper.XMLToObj();
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.close();

	}

}
