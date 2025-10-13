package designprinciples.liskov.bad;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly();
    }
}