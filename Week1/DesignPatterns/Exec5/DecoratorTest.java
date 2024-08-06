

public class DecoratorTest {

    public static void main(String[] args) {
        // Basic Email Notifier
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello, this is a basic email notification!");

        // Email + SMS Notifier
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello, this is an email and SMS notification!");

        // Email + SMS + Slack Notifier
        Notifier slackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        slackNotifier.send("Hello, this is an email, SMS, and Slack notification!");
    }
}
