package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("AutowiredAppContext.xml");
        Employee e1 = ctx.getBean("employeeOne",Employee.class);
        System.out.println(e1);

    }
}
