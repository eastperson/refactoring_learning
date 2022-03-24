package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class EmailNotificationService implements NotificationService {

    private EmailService emailService;

    @Override
    public void sendNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getSender());
        emailMessage.setFrom(notification.getReceiver());
        emailService.sendEmail(emailMessage);
    }
}
