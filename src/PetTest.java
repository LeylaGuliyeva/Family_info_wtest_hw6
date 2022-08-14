import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class PetTest {
    @Test
    public void toStringTest(){
        Pet cat=new Pet(Species.CAT,"Kandela",2,99,new String[]{"Eating","Sleeping","Creating a mess"});
        assertTrue(cat.toString().equals("CAT{nickname='Kandela', age=2, trickLevel=99, habits=[Eating, Sleeping, Creating a mess]}"));

    }
}
