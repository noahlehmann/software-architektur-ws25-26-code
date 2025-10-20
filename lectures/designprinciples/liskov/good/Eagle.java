package designprinciples.liskov.good;

public class Eagle extends Bird implements IFlyable {
    @Override
    public void eat() { System.out.println("Eagle eats."); }
    public void fly() { System.out.println("Eagle flies."); }
}