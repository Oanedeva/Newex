package Pattern_decorator;

public class SMSPush implements PushNotifier {
    public static final int CONST=1;
    @Override
    public void push() {

        System.out.println("СМС уведомление:");
    }

    @Override
    public void getConst() {

    }
}
