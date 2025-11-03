package com.example.jenkin_example.model;

public class Bank {

    private String name;
    private String bin;
    private String prefix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bin='" + bin + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
