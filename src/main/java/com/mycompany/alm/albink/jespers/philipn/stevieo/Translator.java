package com.mycompany.alm.albink.jespers.philipn.stevieo;

import java.io.Serializable;

public class Translator implements Serializable{
    
    private String message;
    public final String[] alternatives1 = {"rich", "poor", "dead", "angry about something",
                                            "happy about something", "sad about something",
                                            "muscular", "skinny", "moving to another country",
                                            "a unicorn"};
    public final String[] alternatives2 = {"daughter", "son", "poodle", "cat", "puppy", "Ferrari",
                                            "Lamborghini", "10 bedroom house", "5 square meter apartment",
                                            "lizard"};

    public void fortune(Person person, int randomNumber){
        
        StringBuilder result = new StringBuilder();
        person.setAge(person.getAge() + randomNumber);
        
        result.append(person.getName())
            .append(", you will soon be ")
            .append(alternatives1[randomNumber])
            .append(". ")
            .append("At the age of ")
            .append(person.getAge())
            .append(" you will get a ")
            .append(alternatives2[randomNumber])
            .append(". ")
            .append("\nYou will meet your dream ");
        
        result.append(calcGender(person.getGender()));
        result.append(" in the near future!");
        message = result.toString();
    }
    
    public String calcGender(String gender) {
    	if(gender.equalsIgnoreCase("male")){
            return "girl";
        }else if(gender.equalsIgnoreCase("female")){
            return "man";
        }else{
            return "partner";
        }
    }
    
    public String getMessage() {
        return message;
    }
}
