package it.alfasoft.andrea.AutoWire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t=(Triangolo) context.getBean("triangolo");
		   
		   t.stampaVertici();
		   
	}

}


/*The Spring container can autowire relationships between collaborating beans without using <constructor-arg> 
 * and <property> elements which helps cut down on the amount of XML configuration you 
 * write for a big Spring based application.
 */