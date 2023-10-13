package Pattern_decorator;

public class PushAndroid extends PushDecorator {
public static final int CONST=2;
    public PushAndroid(PushNotifier pushNotifier) {
        super(pushNotifier);
    }

    @Override
    public void push() {
        super.push();
        super.PlusSumConst(CONST);
        System.out.println("Уведомление на телефон:");
    }

    @Override
    public void getConst() {

    }
}
