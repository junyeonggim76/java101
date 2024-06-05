package day10.Company.Interface;

// camera
// ottwatching
// pay

interface Camera{
    default void takePhoto(){
        System.out.println("찰칵");
    }
}
interface Pay{
    default void pay(){
        System.out.println("결제합니다.");
    }
}
public class SmartPhone extends Phone implements Camera, Pay{
    
}
