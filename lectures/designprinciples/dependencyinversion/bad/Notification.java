package designprinciples.dependencyinversion.bad;

public class Notification {
    private final EmailService email = new EmailService();

    void notifyUser(String msg) {
        email.send(msg);
    }
}
