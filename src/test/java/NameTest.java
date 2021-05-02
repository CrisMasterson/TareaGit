import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class NameTest {
    private Name name;
    @Before
    public void before(){
        this.name = new Name("Cristhian");
    }
    @Test
    public void methodReturn1(){
        assertEquals(9,this.name.methodReturn1() );
    }
}