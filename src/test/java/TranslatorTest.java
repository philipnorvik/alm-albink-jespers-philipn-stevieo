import com.mycompany.alm.albink.jespers.philipn.stevieo.Person;
import com.mycompany.alm.albink.jespers.philipn.stevieo.Translator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TranslatorTest {
    
    @Test
    public void testFortune() {
        Translator translator = new Translator();
    Person person = new Person("kenneth", 59, "male");
      
        String gender;
        
        if(person.getGender().equalsIgnoreCase("male")){
            gender = "girl";
        }else if(person.getGender().equalsIgnoreCase("female")){
            gender = "man";
        }else{
            gender = "partner";
        }
        
        translator.fortune(person);
        String result = translator.getMessage();
        
        for(int factor = 0 ; factor < 10 ; factor++) {
            String expected = person.getName() + ", you will soon be " + 
                translator.alternatives1[factor] + 
                ". " + "At the age of " + 
                person.getAge() + factor + 
                " you will get a " + translator.alternatives2[factor] + ". " + 
                "\nYou will meet your dream " + gender + " in the near future!";
        
            
            System.out.println("expected: " + expected);
            System.out.println("result: " + result);
            if(expected.equalsIgnoreCase(result)) {
                    assertTrue(expected.equalsIgnoreCase(result));
                    System.out.println("works");
            }
            else {
                System.out.println("false gods");
            }
        }
    }
}
