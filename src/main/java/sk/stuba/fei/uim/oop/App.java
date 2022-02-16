package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args){
        System.out.println("Hello world!");
        boolean istrue = false;
        int to = 15;
        for (int i = 10; i < to; i++){
            App.Vypis(i,to);
        }

    }

    public static void Vypis(int from, int to){
        for (int i = from; i <= to; i++){
            System.out.println("Num -> " + i);
        }
    }
}
