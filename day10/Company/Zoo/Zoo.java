package day10.Company.Zoo;

public class Zoo {
    //static 공유성 변수
    //utility가 강함
    static int animals = 30;
    public void showAnimals(){
        System.out.println(animals);
    }
    public void upAnimals(){
        animals++;
    }
}
