package designprinciples.dependencyinversion.good;

public class SmsService implements IMessageService {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
