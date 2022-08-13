
public class Main {
    public static void main(String[] args) {
        Pet hamster=new Pet();
        Pet parrot=new Pet(Species.Parrot,"Chuky");
        Pet cat=new Pet(Species.CAT,"Kandela",2,99,new String[]{"Eating","Sleeping","Creating a mess"});
        byte iq=100;
        String sl[][]={{DayOfWeek.MONDAY.name(),DayOfWeek.TUESDAY.name(),DayOfWeek.WEDNESDAY.name(),DayOfWeek.THURSDAY.name(),DayOfWeek.FRIDAY.name(),DayOfWeek.SATURDAY.name(),DayOfWeek.SUNDAY.name()},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Family fami=new Family(Lala,Samin);
        Human Eren=new Human("Eren","Alakbarov",2029,iq=100,sl,fami);
        Human Erem=new Human("Erem","Alakbarov",2028);
        Human Milan;
        for(int i=0;i<100000;i++){
            Milan=new Human("Milan","Muradov",2010);
        }
        fami.setPet(cat);
        fami.addChild(Eren);
        fami.addChild(Erem);
        System.out.println(Samin);
        System.out.println(Lala);
        System.out.println(cat);
        System.out.println(Eren);
        System.out.println(fami);
        System.out.println("Count : "+fami.countFamily());
        fami.deleteChild(0);
        System.out.println(fami);
        fami.addChild(Eren);
        System.out.println(fami);
        fami.deleteChild(Eren);
        System.out.println(fami);
        System.out.println("Count : "+fami.countFamily());
        System.out.println(Samin.equals(Lala));
        System.out.println(Eren.equals(Eren));


    }

}
