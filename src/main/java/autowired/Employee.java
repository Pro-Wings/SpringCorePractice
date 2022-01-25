package autowired;

import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Primary;

public class Employee {

    int id;
    String name;
    EmpAddress address;

    public Employee() {
        System.out.println("no arg constructor invoked!!");
    }

    public Employee(int id, String name, EmpAddress address) {
        System.out.println("all param constructor invoked!!");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(EmpAddress address) {
        System.out.println("setting address by constructor!!!");
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name by setter");
        this.name = name;
    }

    public EmpAddress getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("abc")
    public void setAddress(EmpAddress address) {
        System.out.println("setting address by setter");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
