package Pattern_observer;

public class Main_Observer {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.addObserver(new EmailListener());
        eventManager.addObserver(new LogListener());
        Editor editor = new Editor(eventManager);
        editor.openFile("");
        editor.saveFile();

    }
}
