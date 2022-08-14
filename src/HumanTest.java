import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HumanTest {
    @Test
    public void toStringTest(){
        byte iq=100;
        String sl[][]={{DayOfWeek.MONDAY.name(),DayOfWeek.TUESDAY.name(),DayOfWeek.WEDNESDAY.name(),DayOfWeek.THURSDAY.name(),DayOfWeek.FRIDAY.name(),DayOfWeek.SATURDAY.name(),DayOfWeek.SUNDAY.name()},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Family fami=new Family(Lala,Samin);
        Human Eren=new Human("Eren","Alakbarov",2029,iq=100,sl,fami);
        System.out.println(Eren);
        assertTrue(Eren.toString().equals("Human{name='Eren', surname='Alakbarov', year=2029, iq=100, schedule=[[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY], [Playing piano, Doing math, Yoga, Reading book, Watching AOT]]}"));
    }
}
