package designprinciples.singleresponsibility.good;

public class Logger {

    public void logUserCreation(User user) {
        log("User " + user.getName() + " created at " + System.currentTimeMillis());
    }

    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}