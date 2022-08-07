

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String habits[];
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am "+nickname+". I miss you");
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }

    @Override
    public String toString() {
        return this.species + "{nickname='" + this.nickname + "', age=" + this.age + ", trickLevel=" + this.trickLevel + ", habits=" + Arrays.toString(this.habits) + "}";
    }

    Pet(){
    }
    Pet(String sp,String nnm){
        this.species=sp;
        this.nickname=nnm;

    }
    Pet(String sp,String nnm,int a,int tl,String hbt[]){
        this.species=sp;
        this.nickname=nnm;
        this.age=a;
        this.trickLevel=tl;
        this.habits=hbt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getSpecies().equals(pet.getSpecies()) && getNickname().equals(pet.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge());
    }
}