package designprinciples.singleresponsibility.good;

public class UserValidator {

    public void validate(User user) {
        validateName(user.getName());
        validateEmail(user.getEmail());
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}