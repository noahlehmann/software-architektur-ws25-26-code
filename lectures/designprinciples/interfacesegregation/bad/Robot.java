package designprinciples.interfacesegregation.bad;

class Robot implements IWorker {
    public void work() {
        System.out.println("Robot working.");
    }
    public void eat() {
        throw new UnsupportedOperationException("Robots don’t eat!");
    }
}
