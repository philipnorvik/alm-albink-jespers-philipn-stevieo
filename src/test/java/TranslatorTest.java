import com.mycompany.alm.albink.jespers.philipn.stevieo.Person;
import com.mycompany.alm.albink.jespers.philipn.stevieo.RandomFactor;
import com.mycompany.alm.albink.jespers.philipn.stevieo.Translator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TranslatorTest {
	
	Translator translator = new Translator();
    
    @Test
    public void testFortune() {
    	Person person = new Person("kenneth", 59, "male");
    	
    	for(int i = 0; i < 100; i++) {
    		int randomNumber = RandomFactor.zeroToNine();
        	translator.fortune(person, randomNumber);
        	String result = translator.getMessage();
        	String expected = person.getName() + ", you will soon be " +
    					    	translator.alternatives1[randomNumber] +
    					    	". " +
    					    	"At the age of " +
    					    	person.getAge() +
    					    	" you will get a " +
    					    	translator.alternatives2[randomNumber] +
    					    	". " +
    					    	"\nYou will meet your dream " +
    					    	translator.calcGender(person.getGender()) +
    					    	" in the near future!";
        	
        	assertTrue(result.equalsIgnoreCase(expected));
    	}
    }
    
    @Test
    public void testCalcGender() {
    	String g1 = "male";
    	String g2 = "female";
    	String g3 = "cat";
    	
    	assertTrue(translator.calcGender(g1).equals("girl"));
    	assertTrue(translator.calcGender(g2).equals("man"));
    	assertTrue(translator.calcGender(g3).equals("partner"));
    }
}
