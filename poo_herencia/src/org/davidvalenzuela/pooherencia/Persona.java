package org.davidvalenzuela.pooherencia;

public class Persona {

    private String name;
    private  String secondName;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name =  name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
