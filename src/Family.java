import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Family(Human mother,Human father) {
        this.mother=mother;
        this.father = father;
        this.children=new Human[]{};
    }

    public void addChild(Human a){
        Human childrenn[]=new Human[children.length+1];
        for(int i=0;i<children.length;i++){
            childrenn[i]=children[i];
        }
        childrenn[children.length]=a;
        this.children=childrenn;
        a.setFamily(this);

    }

    public boolean deleteChild(Human child){
        boolean result=true;
        if(children.length==0){
            result=false;
        }
        Human childrenn[]=new Human[children.length-1];
        int count=0;
        int num=0;
        if(result==true){
            for(count=0;count<this.children.length;count++){
                if (this.children[count].equals(child)==false){
                    childrenn[num++]=children[count];

                }}}
        this.children=childrenn;
        if(result){
            child.setFamily(null);
        }
        return result;
    }
    public boolean deleteChild(int a){
        boolean result=true;
        if(a>children.length-1||a<0){
            result=false;
        }
        Human childrenn[]=new Human[this.children.length-1];
        int count=0;
        int num=0;
        Human x=null;
        if(result==true){
            for(count=0;count<this.children.length;count++){
                if (count==a){
                    x=this.children[count];
                    continue;
                }
                childrenn[num++]=children[count];
                }}

        this.children=childrenn;
        x.setFamily(null);
        return true;
    }

    public int countFamily(){
        return 2+children.length+1;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + (children!=null?Arrays.toString(children):"null") +
                ", pet=" + (pet!=null?pet:"null") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return getMother().equals(family.getMother()) && getFather().equals(family.getFather()) && Arrays.equals(getChildren(), family.getChildren()) && getPet().equals(family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
    @Override
    public void finalize(){
        System.out.println("Family class element will be deleted!");
    }
}
