package designprinciples.interfacesegregation.bad;

public class Human implements IWorker{
    @Override
    public void work() {
        System.out.println("Human working.");
    }

    @Override
    public void eat() {
        System.out.println("Human eats.");
    }
}
