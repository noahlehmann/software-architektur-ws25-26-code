package designprinciples.dependencyinversion.good;

public class EmailService implements IMessageService {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
