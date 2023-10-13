package Pattern_fabrica;

public abstract class Dialog {
    public abstract Button createButton();
    public void renderWindow(){
        Button button = createButton();
        button.render();
    };

}
