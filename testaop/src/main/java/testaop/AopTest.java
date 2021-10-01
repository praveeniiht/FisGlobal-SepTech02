package testaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aopbeans.xml");
		Customer cust = (Customer) context.getBean("customerBean");
	//	cust.addCustomer();
	//	cust.addCustomerReturnValue();
	//	cust.addCustomerThrowException();
		cust.addCustomerAround("Praveen");

	}

}
