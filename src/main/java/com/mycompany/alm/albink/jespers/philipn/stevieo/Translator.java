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

    public void fortune(Person person){
        
        
        
        int factor = RandomFactor.zeroToNine();
        StringBuilder result = new StringBuilder();
        
        result.append(person.getName())
            .append(", you will soon be ")
            .append(alternatives1[factor])
            .append(". ")
            .append("At the age of ")
            .append(person.getAge() + factor)
            .append(" you will get a ")
            .append(alternatives2[factor])
            .append(". ")
            .append("\nYou will meet your dream ");
        
        if(person.getGender().equalsIgnoreCase("male")){
            result.append("girl");
        }else if(person.getGender().equalsIgnoreCase("female")){
            result.append("man");
        }else{
            result.append("partner");
        }
        
        result.append(" in the near future!");
        message = result.toString();
    }
    
    public String getMessage() {
        return message;
    }
}
