import com.mycompany.alm.albink.jespers.philipn.stevieo.Controller;
import com.mycompany.alm.albink.jespers.philipn.stevieo.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {
    
    Person p = new Person("knut", 58, "male");
    Controller c = new Controller();
    
    String message = "test message";
    
    @Test
    public void controllerTests() {
        c.setAge(p.getAge());
        c.setGender(p.getGender());
        c.setMessage(message);
        c.setNameone(p.getName());
        
        //NAME
        assertEquals(p.getName(), c.getNameone());
        
        //AGE
        assertEquals(p.getAge(), c.getAge());
        
        //GENDER
        assertEquals(p.getGender(), c.getGender());
        
        //MESSAGE
        assertEquals(message, c.getMessage());
    }
}
