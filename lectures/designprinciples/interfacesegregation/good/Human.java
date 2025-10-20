package designprinciples.interfacesegregation.good;

public class Human implements IWorkable, IEating {
    @Override
    public void work() {
        System.out.println("Human working.");
    }

    @Override
    public void eat() {
        System.out.println("Human eats.");
    }
}
