/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alm.albink.jespers.philipn.stevieo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author stevi
 */
@Named(value = "control")
@SessionScoped
public class Controller implements Serializable {
    
    Person person;
    Translator translator= new Translator();
    
    
    private String nameone;
    private int age;
    private String gender;    
    private String message;

    public Controller() {
    }
    
    public void createMessage(){
        person = new Person(this.nameone,this.age,this.gender);
        translator.fortune(person);
        this.message = translator.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public String getNameone() {
        return nameone;
    }

    public void setNameone(String nameone) {
        this.nameone = nameone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

    /**
     * Creates a new instance of Controller
     */
   
    
    
}
