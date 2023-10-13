package Pattern_decorator;

public class Main_Push {
    public static void main(String[] args) {
       // Notifier not=new Notifier();
        PushNotifier pushNotifier=new PushAndroid(new PushAndroid(new PushAndroid(new TelegramPush(new SMSPush()))));
        PushNotifier pushNotifier1=(new SMSPush());
        PushNotifier pushNotifier2=(new TelegramPush(new PushAndroid(new TelegramPush(new SMSPush()))));
        pushNotifier.push();

    }
}
