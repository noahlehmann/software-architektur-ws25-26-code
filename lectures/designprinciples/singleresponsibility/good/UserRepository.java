package designprinciples.singleresponsibility.good;

public class UserRepository {

    public void save(User user) {
        connect();
        insert(user);
    }

    private void connect() {
        System.out.println("Connecting to database...");
    }

    private void insert(User user) {
        System.out.println("INSERT INTO users VALUES ('" + user.getName() + "', '" + user.getEmail() + "')");
    }
}