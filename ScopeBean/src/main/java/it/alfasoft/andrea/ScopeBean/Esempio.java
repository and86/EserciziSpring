package it.alfasoft.andrea.ScopeBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t1=(Triangolo) context.getBean("triangolo3");
		   
		   t1.stampaVertici();
		   
		   t1.getPuntoA().setX(50);
		   t1.getPuntoA().setY(50);
		   
		   t1.getPuntoB().setX(15);
		   t1.getPuntoB().setY(15);
		   
		   t1.getPuntoC().setX(35);
		   t1.getPuntoC().setY(35);
		   
		   
		   Triangolo t2=(Triangolo) context.getBean("triangolo3");
		    
		   t2.stampaVertici();
		   
		   /* To force Spring to produce a new bean instance each time one is needed, 
		   you should declare the bean's scope attribute to be prototype. 
		   Similar way if you want Spring to return the same bean instance each time one is needed, 
		   you should declare the bean's scope attribute to be singleton.*/
	
	}

}
