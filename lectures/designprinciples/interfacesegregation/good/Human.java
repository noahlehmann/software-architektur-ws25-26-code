package designprinciples.interfacesegregation.good;

import designprinciples.interfacesegregation.bad.IWorker;

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
