package designprinciples.singleresponsibility.good;

public class EmailService {

    public void sendWelcomeEmail(User user) {
        String message = createWelcomeMessage(user);
        send(user.getEmail(), message);
    }

    private String createWelcomeMessage(User user) {
        return "Welcome, " + user.getName() + "!";
    }

    private void send(String email, String message) {
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
    }
}