package Pattern_observer;

import java.util.Observable;
import java.util.Observer;

public class EventManager extends Observable {
    public void onChange(){
        super.setChanged();
    }

}
