package Pattern_observer;

import java.util.Observable;

public class Editor {
    private EventManager eventManager;
    public void openFile(String pathFile){
        eventManager.onChange();
        eventManager.notifyObservers();
    }
    public void saveFile(){
        eventManager.onChange();
        eventManager.notifyObservers();
    }
    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}
