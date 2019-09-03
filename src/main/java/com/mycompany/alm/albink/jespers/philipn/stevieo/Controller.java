/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alm.albink.jespers.philipn.stevieo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named(value="controller")
@SessionScoped
public class Controller {
    
    Person person;
    Translator translator= new Translator();
    
    
    private String name;
    private int age;
    private String gender;    
    private String message;
    
    public void createMessage(){
        person = new Person(this.name,this.age,this.gender);
        translator.fortune(person);
        this.message = translator.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
