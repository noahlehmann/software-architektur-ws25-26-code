package designprinciples.interfacesegregation.good;

class Robot implements IWorkable {

    @Override
    public void work() {
        System.out.println("Robot working.");
    }
}
