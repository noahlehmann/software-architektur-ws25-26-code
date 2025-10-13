package designprinciples.dependencyinversion.bad;

public class EmailService {
    void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
