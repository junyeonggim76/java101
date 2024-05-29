package day07;

public class MegaCoffee {
    public static void main(String[] args) {
        // Coffee(커피): name, price, shots, caffeine 유무, kcal
        // beverage(음료): name, price, kcal
        // bread(빵): name, price, kcal, gram
//        coffee a = new coffee("아메리카노", 1500, 1, "유", 16);
//        beverage b = new beverage("딸기라떼", 3800, 366);
//        bread c = new bread("크로크무슈", 2000, 591,140);

        coffee[] a = new coffee[3];
        a[0] = new coffee("아메리카노", 100, 100, "유", 314);
        a[0] = new coffee("라떼", 150, 150, "유", 239);
        a[0] = new coffee("바닐라", 200, 200, "유", 234);
        beverage[] b = {new beverage("체리콕", 3500, 260),new beverage("에이드", 2400, 240),new beverage("아이스티", 3000, 240)};

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i].name+""+a[i].price);
        }
    }
}
