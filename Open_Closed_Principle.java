public class Open_Closed_Principle {
    // Step 1: Create an interface
    interface Notifier {
        void send(String message);
    }

    // Step 2: Implement the interface
    static class EmailNotifier implements Notifier {
        public void send(String message) {
            System.out.println("Sending Email: " + message);
        }
    }

    static class SMSNotifier implements Notifier {
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    // Step 3: Service that uses the abstraction
    static class NotificationService {
        public void notifyUser(Notifier notifier, String message) {
            notifier.send(message);
        }
    }

    // Step 4: Main method
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();

        service.notifyUser(email, "Welcome!");
        service.notifyUser(sms, "Your code is 1234.");
}

}
