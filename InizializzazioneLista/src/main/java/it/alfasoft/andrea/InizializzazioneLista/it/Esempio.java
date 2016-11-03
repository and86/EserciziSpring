package it.alfasoft.andrea.InizializzazioneLista.it;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t=(Triangolo) context.getBean("nome_triangolo");
		   
		   t.stampaVertici();
		  
		   
	}

}
