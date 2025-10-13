package designprinciples.singleresponsibility.good;

public class UserService {
    private final UserValidator validator;
    private final UserRepository repository;
    private final EmailService emailService;
    private final Logger logger;

    public UserService(UserValidator validator, UserRepository repository,
                       EmailService emailService, Logger logger) {
        this.validator = validator;
        this.repository = repository;
        this.emailService = emailService;
        this.logger = logger;
    }

    public void registerUser(String name, String email) {
        User user = new User(name, email);
        validator.validate(user);
        repository.save(user);
        emailService.sendWelcomeEmail(user);
        logger.logUserCreation(user);
    }
}