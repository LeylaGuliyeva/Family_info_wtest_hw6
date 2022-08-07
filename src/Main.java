public class Main {
    public static void main(String[] args) {
        Pet hamster=new Pet();
        Pet carrot=new Pet("Carrot","Chuky");
        Pet cat=new Pet("Cat","Kandela",2,99,new String[]{"Eating","Sleeping","Creating a mess"});
        byte iq=100;
        String sl[][]={{"Monday","Tuesday","Wednesday","Thursday","Friday"},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Family fami=new Family(Lala,Samin);
        Human Eren=new Human("Eren","Alakbarov",2029,iq=100,sl,fami);
        fami.setPet(cat);
        fami.addChild(Eren);
        System.out.println(Samin);
        System.out.println(Lala);
        System.out.println(cat);
        System.out.println(Eren);
        System.out.println(fami);
        System.out.println("Count : "+fami.countFamily());
        fami.deleteChild(0);
        System.out.println(fami);
        System.out.println("Count : "+fami.countFamily());
        System.out.println(Samin.equals(Lala));
        System.out.println(Eren.equals(Eren));


    }

}