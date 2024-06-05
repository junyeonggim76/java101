package day10.Company.Zoo;

public class Dog extends Animal{
    private int hp = 50;
    public void upHp(){
        this.hp++;
    }
    public void bark(){
        System.out.println("멍멍");
    }
}
