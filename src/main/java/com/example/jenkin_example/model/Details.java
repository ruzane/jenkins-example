package com.example.jenkin_example.model;

public class Details {

    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Details{" +
                "address='" + address + '\'' +
                '}';
    }
}
