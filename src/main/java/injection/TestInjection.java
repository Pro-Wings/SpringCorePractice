package injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("injectionAppContext.xml");
        Employee emp1 = ctx.getBean("employee1", Employee.class);
        System.out.println(emp1);

//        ctx.registerShutdownHook();

//        System.out.println("==================================");
//        Calculator obj = ctx.getBean("addition", Calculator.class);
//        System.out.println(obj.doAddition());

    }
}
