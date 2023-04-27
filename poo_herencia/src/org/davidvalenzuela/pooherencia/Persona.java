package org.davidvalenzuela.pooherencia;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Persona {

    private String name;
    private  String secondName;
    private int age;
    private String email;

    public Persona(){
        System.out.println("Persona: Inicializando Constructor...");
    }

    public Persona(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
    }

    public Persona(String name, String secondName, int age){
        this(name, secondName);
        this.age = age;
    }

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

    public String saludar(){
        return "Hola que tal!";
    }
}
