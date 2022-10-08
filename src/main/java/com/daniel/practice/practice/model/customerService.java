package com.daniel.practice.practice.model;

public class customerService {
    private String name;
    private int age;
    private int contactNum;

    public customerService(){

    }

    public customerService(String name, int age, int contactNum) {
        this.name = name;
        this.age = age;
        this.contactNum = contactNum;
    }

    public void name(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    @Override
    public String toString() {
        return "customerService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNum=" + contactNum +
                '}';
    }
}
