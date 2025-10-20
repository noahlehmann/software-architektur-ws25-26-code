package designprinciples.liskov.good;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.eat();
        penguin.eat();

        IFlyable flyer = new Eagle();
        flyer.fly();
    }
}