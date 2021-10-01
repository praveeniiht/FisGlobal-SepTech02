package aoptest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
			Customer customer = (Customer) context.getBean("customerBean");
			customer.addCustomer();
			customer.addCustomerReturnValue();
			customer.addCustomerThrowException();
			customer.addCustomerAround("Srinivas");
			context.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}

}
