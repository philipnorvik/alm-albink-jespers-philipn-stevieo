import com.mycompany.alm.albink.jespers.philipn.stevieo.Person;
import com.mycompany.alm.albink.jespers.philipn.stevieo.RandomFactor;
import com.mycompany.alm.albink.jespers.philipn.stevieo.Translator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TranslatorTest {
    
    Translator translator = new Translator();
    Person person = new Person("kenneth", 59, "male");
    
    @Test
    public void testFortune() {
        
        int factor = 0;
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
        
        for(int i = 0 ; i < 10 ; i++) {
            String expected = person.getName() + ", you will soon be " + 
                translator.alternatives1[factor] + 
                ". " + "At the age of " + 
                person.getAge() + factor + 
                " you will get a " + translator.alternatives2[factor] + ". " + 
                "\nYou will meet your dream " + gender + " in the near future!";
        
            if(expected.equalsIgnoreCase(result)) {
                    assertTrue(expected.equals(result));
            }
            else {
                System.out.println("FALSE GODS!");
            }
        }
    }
}
