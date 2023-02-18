package iti.qualifier;

public class Person {
    
    private String name;
    private int age;
    private int mobile;



    
    public Person() {
    }

    public Person(String name, int age, int mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMobile() {
        return mobile;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    
}
