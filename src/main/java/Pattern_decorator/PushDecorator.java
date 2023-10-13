package Pattern_decorator;

public abstract class PushDecorator implements PushNotifier {
    private int summaryCONST;
    private PushNotifier pushNotifier;

    public PushDecorator(PushNotifier pushNotifier) {
        this.pushNotifier = pushNotifier;
    }

    @Override
    public void push() {
        pushNotifier.push();
    }

    public void PlusSumConst(int CONST){
        summaryCONST+=CONST;
    }
}
