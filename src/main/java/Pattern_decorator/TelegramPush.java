package Pattern_decorator;

public class TelegramPush extends PushDecorator {
    public static final int CONST=3;
    public TelegramPush(PushNotifier pushNotifier) {
        super(pushNotifier);
    }

    @Override
    public void push() {
        super.push();
        super.PlusSumConst(CONST);
        System.out.println("Уведомление в Телеграме:");
    }

    @Override
    public void getConst() {

    }
}
