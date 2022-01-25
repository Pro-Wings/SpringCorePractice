package injection;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Calculator{

    int a;
    int b;

    public Calculator() {
    }

    public Calculator(String a, String b) {
        System.out.println("string string invoked!!");
        System.out.println("a = "+a + "and  b = "+b);
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }
    public Calculator(double a, double b) {
        System.out.println("double double invoked!!");
        System.out.println("a = "+a + "and  b = "+b);
        this.a = (int)a;
        this.b = (int)b;
    }
    public Calculator(int a, int b) {
        System.out.println("int int invoked!!");
        System.out.println("a = "+a + "and  b = "+b);
        this.a = a;
        this.b = b;
    }

    @PostConstruct
    public void myInit()
    {
        System.out.println("custom init method called!!!");
    }

    @PreDestroy
    public void myDestroy()
    {
        System.out.println("my destroy method called!!");
    }
    public int doAddition()
    {
        return this.a + this.b;
    }
}
