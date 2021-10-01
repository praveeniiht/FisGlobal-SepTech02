package logginexample;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLoggin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logger log = Logger.getLogger("name");
		Logger log = Logger.getLogger(TestLoggin.class.getName());
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		log.info("Object is going to initialize by IoC");
		log.error("this will be treated as error");
		Employee emp = (Employee)context.getBean("emp");
		log.info("emp object is created....");
		emp.display();
		log.info("display method is called on emp object...");
	}

}
