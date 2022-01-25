package injection;

import com.prowings.Address;

public class Employee {

    int id;
    String name;
    Address addr;

    public Employee() {
    }

    public Employee(int id, String name, Address addr1) {
        System.out.println("all arg constructor invoked");
        this.id = id;
        this.name = name;
        this.addr = addr1;
    }

    public Employee(Address addr1) {
        System.out.println("constructor for address invoked!!!");
        this.addr = addr1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setter for id called");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter for name called");
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        System.out.println("setter for address invoked");
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
