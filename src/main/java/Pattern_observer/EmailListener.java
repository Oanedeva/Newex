package Pattern_observer;

import java.util.Observable;
import java.util.Observer;

public class EmailListener implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Отправлен email с текстом:"+arg);
    }

}
