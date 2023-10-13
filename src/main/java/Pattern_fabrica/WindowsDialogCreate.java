package Pattern_fabrica;

public class WindowsDialogCreate extends Dialog {
    public WindowsDialogCreate(){

    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    //Конкретные создатели
}
