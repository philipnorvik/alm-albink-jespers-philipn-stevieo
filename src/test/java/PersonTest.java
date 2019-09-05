import com.mycompany.alm.albink.jespers.philipn.stevieo.Person;
import com.mycompany.alm.albink.jespers.philipn.stevieo.RandomFactor;
import com.mycompany.alm.albink.jespers.philipn.stevieo.Translator;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    Person p = new Person("knut", 58, "male");
    
    @Test
    public void nameTest() {
        String expected = "knut";
        
        assertTrue(expected.equalsIgnoreCase(p.getName()));
    }
    
    @Test
    public void ageTest() {
        int expected = 58;
        
        assertTrue(expected == p.getAge());
    }
    
    @Test
    public void genderTest() {
        String expected = "male";
        
        assertTrue(expected.equalsIgnoreCase(p.getGender()));
    }
}
