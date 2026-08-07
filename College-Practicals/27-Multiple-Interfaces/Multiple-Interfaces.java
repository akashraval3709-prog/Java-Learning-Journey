
interface Notification
{
    void sendNotification();
}

class EmailNotification implements Notification{
    public void sendNotification()
    {
        System.out.println("Sending notification through Email...");
    }
}
class SMSNotification implements Notification
{
public void sendNotification()
{
    System.out.println("Sending notification through SMS...");
}
}
class WhatsAppNotification implements Notification
{
public void sendNotification()
{
    System.out.println("Sending notification through WhatsApp...");
}
}
 
public class program_27 {

    public static void main(String[] args)
    {
        EmailNotification email = new EmailNotification();
        email.sendNotification();

        SMSNotification SMS = new SMSNotification();
        SMS.sendNotification();

        WhatsAppNotification whatsApp = new WhatsAppNotification();
        whatsApp.sendNotification();
    }
    
}
