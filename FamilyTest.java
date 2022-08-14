import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FamilyTest {
    @Test
    public void countFamilyTest(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2022);
        Human Esmeralda=new Human("Esmeralda","Bellamy",2020);
        Human Omar=new Human("Omar","Bellamy",2018);
        Human children[]=new Human[]{Aurora,Esmeralda,Omar};
        Family bestFamily=new Family(Esperanza,Dion);
        bestFamily.setChildren(children);
        assertTrue(bestFamily.countFamily()==5);
    }
    @Test
    public void addChildTest(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Human Esmeralda=new Human("Esmeralda","Bellamy",2019);
        Human Omar=new Human("Omar","Bellamy",2017);
        Human children[]=new Human[]{Aurora,Esmeralda,Omar};
        Family bestFamily=new Family(Esperanza,Dion);
        Human Amal=new Human("Amal","Bellamy",2022);
        bestFamily.setChildren(children);
        int len=children.length;
        Human copyChildren[]=Arrays.copyOf(children,len+1);
        bestFamily.addChild(Amal);
        copyChildren[len]=Amal;
        assertTrue(copyChildren[len]==(bestFamily.getChildren())[len]&&
                copyChildren[0]==(bestFamily.getChildren())[0]&&
                copyChildren[1]==(bestFamily.getChildren())[1]&&
                copyChildren[2]==(bestFamily.getChildren())[2]);
    }

    @Test
    public void deleteChildTest1(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Human Esmeralda=new Human("Esmeralda","Bellamy",2019);
        Human Omar=new Human("Omar","Bellamy",2017);
        Human children[]=new Human[]{Aurora,Esmeralda,Omar};
        Family bestFamily=new Family(Esperanza,Dion);
        bestFamily.setChildren(children);
        bestFamily.deleteChild(children[1]);
        assertFalse(bestFamily.getChildren()[1].equals(children[1]));
        assertTrue(bestFamily.getChildren()[0].equals(children[0])&&bestFamily.getChildren()[1].equals(children[2]));

        Human Amal=new Human("Amal","Bellamy",2022);
        bestFamily.setChildren(children);
        assertFalse(bestFamily.deleteChild(Amal));
        assertTrue(bestFamily.getChildren()[0].equals(children[0])&&bestFamily.getChildren()[1].equals(children[1])&&bestFamily.getChildren()[2].equals(children[2])&&bestFamily.getChildren().length==3);
    }
    @Test
    public void deleteChildTest2(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Human Esmeralda=new Human("Esmeralda","Bellamy",2019);
        Human Omar=new Human("Omar","Bellamy",2017);
        Human children[]=new Human[]{Aurora,Esmeralda,Omar};
        Family bestFamily=new Family(Esperanza,Dion);
        bestFamily.setChildren(children);
        bestFamily.deleteChild(1);
        assertFalse(bestFamily.getChildren()[1].equals(children[1]));
        assertTrue(bestFamily.getChildren()[0].equals(children[0])&&bestFamily.getChildren()[1].equals(children[2]));

        Human Amal=new Human("Amal","Bellamy",2022);
        bestFamily.setChildren(children);
        assertFalse(bestFamily.deleteChild(-3));
        assertTrue(bestFamily.getChildren()[0].equals(children[0])&&bestFamily.getChildren()[1].equals(children[1])&&bestFamily.getChildren()[2].equals(children[2])&&bestFamily.getChildren().length==3);
    }

    @Test
    public void toStringTest(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Pet parrot=new Pet(Species.Parrot,"Chuky");
        Family bestFamily=new Family(Esperanza,Dion);
        bestFamily.addChild(Aurora);
        bestFamily.setPet(parrot);
        assertTrue(bestFamily.toString().equals("Family{mother=Human{name='Esperanza', surname='Bellamy', year=1996, iq=null, schedule=null}, father=Human{name='Dion', surname='Bellamy', year=1994, iq=null, schedule=null}, children=[Human{name='Aurora', surname='Bellamy', year=2020, iq=null, schedule=null}], pet=Parrot{nickname='Chuky', age=0, trickLevel=0, habits=null}}"));
}}
