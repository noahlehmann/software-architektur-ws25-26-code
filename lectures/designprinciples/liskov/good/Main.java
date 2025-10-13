package designprinciples.liskov.good;

public class Main {
    public static void main(String[] args) {
        IBird eagle = new Eagle();
        IBird penguin = new Penguin();

        eagle.eat();
        penguin.eat();

        IFlyable flyer = new Eagle();
        flyer.fly();
    }
}