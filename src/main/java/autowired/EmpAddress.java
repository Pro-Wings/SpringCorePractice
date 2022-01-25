package autowired;

public class EmpAddress {

    String city;
    String country;
    int pin;

    public EmpAddress() {
    }

    public EmpAddress(String city, String country, int pin) {
        this.city = city;
        this.country = country;
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
//        System.out.println("setter of Address : city invoked!!");
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
//        System.out.println("setter of Address : country invoked!!");
        this.country = country;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
//        System.out.println("setter of Address : pin invoked!!");
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", pin=" + pin +
                '}';
    }
}
