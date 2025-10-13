package designprinciples.dependencyinversion.good;

class Notification {
    private final IMessageService service;

    Notification(IMessageService service) {
        this.service = service;
    }

    void notifyUser(String msg) {
        service.send(msg);
    }
}
