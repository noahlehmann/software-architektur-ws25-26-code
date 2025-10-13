package designprinciples.liskov.good;

public class Eagle implements IBird, IFlyable {
    public void eat() { System.out.println("Sparrow eats."); }
    public void fly() { System.out.println("Sparrow flies."); }
}