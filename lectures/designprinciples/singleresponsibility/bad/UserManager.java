package designprinciples.singleresponsibility.bad;

/**
 * BAD EXAMPLE: Violates Single Responsibility Principle and has Low Cohesion
 * This class has multiple reasons to change:
 * - Validation rules change
 * - Database structure changes
 * - Email service changes
 * - Logging format changes
 */
public class UserManager {

    public void saveUser(String name, String email) {
        // Validates user
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Connects to database
        System.out.println("Connecting to database...");

        // Saves to database
        System.out.println("INSERT INTO users VALUES ('" + name + "', '" + email + "')");

        // Sends email notification
        System.out.println("Sending welcome email to: " + email);

        // Logs the action
        System.out.println("LOG: User " + name + " created at " + System.currentTimeMillis());
    }
}