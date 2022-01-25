package com.prowings;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    int adhar;
    List mobileNos;
    Set propertyNo;
    Map<String, String> x;

    public Person() {
    }

    public int getAdhar() {
        return adhar;
    }

    public void setAdhar(int adhar) {
        this.adhar = adhar;
    }

    public List getMobileNos() {
        return mobileNos;
    }

    public void setMobileNos(List mobileNos) {
        this.mobileNos = mobileNos;
    }

    public Set getPropertyNo() {
        return propertyNo;
    }

    public void setPropertyNo(Set propertyNo) {
        this.propertyNo = propertyNo;
    }

    public Map<String, String> getX() {
        return x;
    }

    public void setX(Map<String, String> x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Person{" +
                "adhar=" + adhar +
                ", mobileNos=" + mobileNos +
                ", propertyNo=" + propertyNo +
                ", x=" + x +
                '}';
    }
}
